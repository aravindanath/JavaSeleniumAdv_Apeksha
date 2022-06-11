package day3;

import java.util.ArrayList;
import java.util.HashSet;

public class SetExample1 {


    public static void main(String[] args) {
                       //    0         1      2       3

        HashSet<String> names = new HashSet<>();
        names.add("Apeksha");
        names.add("Arvind");
        names.add("Teju");
        names.add("Teju");


         for(String str : names)
         {
             System.out.println(str);
         }
    }
}
