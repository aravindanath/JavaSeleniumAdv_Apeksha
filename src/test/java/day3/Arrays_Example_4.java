package day3;

import java.util.Arrays;

public class Arrays_Example_4 {


    public static void main(String[] args) {

        Integer [] names =  new Integer[4];

        names[1]=234;
        names[3]=1234;
        names[0]=32;
        names[2]=134;
//        names[4]="Raj";


        for(Integer str : names){
            System.out.println(str);
        }





    }
}
