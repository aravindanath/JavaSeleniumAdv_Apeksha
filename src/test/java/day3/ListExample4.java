package day3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListExample4 {


    public static void main(String[] args) {
                       //    0         1      2       3

        ArrayList<String> names = new ArrayList<>();
        names.add("Apeksha");
        names.add("Arvind");
        names.add("Teju");


      ListIterator it =  names.listIterator();

      while (it.hasNext()){
          System.out.println(it.next());
      }


      System.out.println("*****************");

        while (it.hasPrevious()){
            System.out.println(it.previous());
        }
    }
}
