package day3;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {


    public static void main(String[] args) {


        HashMap<String, String> mp = new HashMap<>();
        mp.put("Name","Arvind");
        mp.put("City","Bangalore");
        mp.put("Course","Java");
        mp.put(null, null);



        System.out.println(mp.get("Name"));

        for(Map.Entry<String, String> m : mp.entrySet()){
            System.out.println(m);
        }

        System.out.println("************");


        Hashtable<String, String> ht = new Hashtable<>();
        ht.put("Name","Arvind");
        ht.put("City","Bangalore");
        ht.put("Course","Java");
//        ht.put(null, null);


        for(Map.Entry<String, String> m : ht.entrySet()){
            System.out.println(m);
        }
    }
}
