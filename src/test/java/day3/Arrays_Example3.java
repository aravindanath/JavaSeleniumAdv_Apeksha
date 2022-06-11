package day3;

import java.util.Arrays;

public class Arrays_Example3 {


    public static void main(String[] args) {

        String [] names =  new String[4];

        names[1]="Arvind";
        names[3]="Divyashree";
        names[0]="Teju";
        names[2]="Raj";
//        names[4]="Raj";


        for(String str : names){
            System.out.println(str);
        }

        System.out.println("*************");

        Arrays.sort(names);


        for(String str : names){
            System.out.println(str);
        }



    }
}
