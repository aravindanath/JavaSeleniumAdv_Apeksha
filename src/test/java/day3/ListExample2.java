package day3;

import java.util.ArrayList;

public class ListExample2 {


    public static void main(String[] args) {
                       //    0         1      2       3

        ArrayList<String> names = new ArrayList<>();
        names.add("Apeksha");
        names.add("Arvind");
        names.add("Teju");
        System.out.println(names.get(2));

        System.out.println(names.size());

        for(int i=0; i<names.size();i++){

            System.out.println(names.get(i));
        }

    }
}
