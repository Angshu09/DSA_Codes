package revise_DSA.Hashmaps;

import javax.swing.text.html.parser.Entity;
import java.util.HashMap;
import java.util.HashSet;

class MapUsingHash{
    private Entity[] entities;

    public MapUsingHash(){
        entities = new Entity[100];
    }

    public void put(String key, String value){
        int hash = Math.abs(key.hashCode() % entities.length);
        entities[hash] = new Entity(key, value);
    }

    public String get(String key){
        int hash = Math.abs(key.hashCode() % entities.length);
        if(entities[hash] != null && entities[hash].key.equals(key)){
            return entities[hash].value;
        }
        return null;
    }

    public void remove(String key){
        int hash = Math.abs(key.hashCode() % entities.length);
        if(entities[hash] != null && entities[hash].key.equals(key)){
            entities[hash] = null;
        }
    }

    private class Entity{
        String key;
        String value;

        public Entity(String key, String value){
            this.key = key;
            this.value = value;
        }
    }
}

public class JavaHashmap {
    public static void main(String[] args) {
        //These are the default ones
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Angshu", 89);
        map.put("Debojeet", 99);
        map.put("Sumit", 100);

        System.out.println(map); //{Debojeet=99, Sumit=100, Angshu=89}
        System.out.println(map.get("Sumit")); //100
        System.out.println(map.getOrDefault("Alvaro", 78)); //78
        System.out.println(map.containsKey("Angshu")); //gives true because "Angshu" key is exist
        System.out.println(map.containsValue(100)); //gives me true because value 100 is exist in the hashmap

        HashSet<Integer> set = new HashSet<>();
        set.add(56);
        set.add(90);
        set.add(52);
        set.add(23);
        System.out.println(set);

        //Custom
        MapUsingHash customMap = new MapUsingHash();
        customMap.put("Mango", "color is yellow");
        customMap.put("Apple", "color is Red");
        customMap.put("Orange", "color is orange");

        System.out.println(customMap.get("Apple")); //color is red
    }
}
