package day2;

public class Exceptions1 {


    public static void main(String[] args) {

        System.out.println("Starting..");

        try {
            int i = 10;
            int z = 0;
            int div = i / z;
            System.out.println("Division "+ div);
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("Ending..");


    }
}
