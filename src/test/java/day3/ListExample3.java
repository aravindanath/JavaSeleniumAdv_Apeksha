package day3;

import java.util.ArrayList;
import java.util.Iterator;

public class ListExample3 {


    public static void main(String[] args) {
                       //    0         1      2       3

        ArrayList<String> names = new ArrayList<>();
        names.add("Apeksha");
        names.add("Arvind");
        names.add("Teju");


      Iterator it =  names.iterator();

      while (it.hasNext()){
          System.out.println(it.next());
      }

    }
}
