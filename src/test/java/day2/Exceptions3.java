package day2;

public class Exceptions3 {


    public static void main(String[] args) throws Exception {

     int amt = 99;
     if(amt<100){
         throw new Exception(" Enter 100 mutiples only!");

     }else{
         System.out.println("Collect your cash");
     }


    }
}
