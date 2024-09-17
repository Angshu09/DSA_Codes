package revise_DSA.Hashmaps;

import java.util.ArrayList;
import java.util.LinkedList;

class optimiseHashmap<K, V>{
    ArrayList<LinkedList<Entity>> list = new ArrayList<>();

    private int size = 0;
    private float loadFactor = 0.5f; //If I add the 51 first item then it will double the size

    public optimiseHashmap(){ //default constructor
        list = new ArrayList<>(); //initializing the arraylist
        for(int i=0; i<10; i++){
            list.add(new LinkedList<>());
        }
    }

    public void put(K key, V value){
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entities = list.get(hash);

        for(Entity entity: entities){
            if(entity.key.equals(key)){
                entity.value = value;
                return;
            }
        }

        if((float)(size) / list.size() > loadFactor){
            reHash();
        }

        entities.add(new Entity(key, value));

        size++;
    }

    public V get(K key){
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entries = list.get(hash);

        for(Entity entry: entries){
            if(entry.key.equals(key)){
                return entry.value;
            }
        }

        return null;
    }

    public void remove(K key){
        int hash = Math.abs(key.hashCode() % list.size());
        LinkedList<Entity> entries = list.get(hash);

        Entity target = null;

        for(Entity entry: entries){
            if(entry.key.equals(key)){
                target =  entry;
                break;
            }
        }

        entries.remove(target);

        size--;
    }

    private void reHash(){
        System.out.println("we are now Re-Hashing");

        ArrayList<LinkedList<Entity>> old = list;
        list = new ArrayList<>();

        for(int i=0; i<old.size() * 2; i++){
            list.add(new LinkedList<>());
        }

        for(LinkedList<Entity> entries : old){
            for(Entity entry: entries){
                put(entry.key, entry.value);
            }
        }
    }

    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("{");
        for(LinkedList<Entity> entries: list){
            for(Entity entry: entries){
                builder.append(entry.key);
                builder.append("=");
                builder.append(entry.value);
                builder.append(", ");
            }
        }
        builder.append("}");

        return builder.toString();
    }

    private class Entity{
        K key;
        V value;

        public Entity(K key, V value){
            this.key = key;
            this.value = value;
        }
    }
}

public class HashMapFinal {
    public static void main(String[] args) {
        optimiseHashmap<Integer, String> map = new optimiseHashmap<>();
        map.put(1, "Angshu");
        map.put(2, "Debojeet");

        System.out.println(map.get(2));
        System.out.println(map);
    }
}
