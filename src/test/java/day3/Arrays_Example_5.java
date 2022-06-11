package day3;

public class Arrays_Example_5 {


    public static void main(String[] args) {

        Object [] names =  new Object[4];

        names[1]=234;
        names[3]="arvind";
        names[0]='d';
        names[2]=232.33f;



        for(Object str : names){
            System.out.println(str);
        }





    }
}
