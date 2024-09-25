package revise_DSA.Hashmaps.Questions;

import java.util.HashMap;

public class FindItineraryFromTickets {

    static String getStart(HashMap<String, String> map){
        HashMap<String, String> rev = new HashMap<>();

        for(String key: map.keySet()){
            rev.put(map.get(key), key);
        }

        for(String key: map.keySet()){
            if(!rev.containsKey(key)){
                return key;
            }
        }

        return null;
    }
    public static void main(String[] args) {
        HashMap<String, String> tickets = new HashMap<>();

        tickets.put("Chennai", "Bengaluru");
        tickets.put("Mumbai", "Delhi");
        tickets.put("Goa", "Chennai");
        tickets.put("Delhi", "Goa");

        String start = getStart(tickets);

        while(tickets.containsKey(start)){
            System.out.println(start);
            start = tickets.get(start);
        }
        System.out.println(start);
    }
}
