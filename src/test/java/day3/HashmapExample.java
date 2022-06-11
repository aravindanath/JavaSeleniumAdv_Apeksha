package day3;

import java.util.HashMap;
import java.util.Map;

public class HashmapExample {


    public static void main(String[] args) {


        HashMap<String, String> mp = new HashMap<>();
        mp.put("Name","Arvind");
        mp.put("City","Bangalore");
        mp.put("Course","Java");



        System.out.println(mp.get("Name"));

        for(Map.Entry<String, String> m : mp.entrySet()){
            System.out.println(m);
        }

    }
}
