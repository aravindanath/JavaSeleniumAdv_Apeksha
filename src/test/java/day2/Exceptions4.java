package day2;

public class Exceptions4 {


    public static void main(String[] args) {

        System.out.println("Starting..");

        try {
            String name = null;
            System.out.println(name.length());
        }catch (NullPointerException e){
            e.printStackTrace();
        }catch (ArithmeticException a){
            a.printStackTrace();
        }finally {
            System.out.println("Finally block");
        }

        System.out.println("Ending..");


    }
}
