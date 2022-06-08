package day1;

public class ExamplePolymarphysm
{

    public static void main(String[] args) {

        RBI rbi ; // Ref of parent class
        rbi = new AXIS();
        System.out.println("Axis Bank Int: "+rbi.getIntRate());
        rbi = new SBI();
        System.out.println("SBI Bank Int: "+rbi.getIntRate());



    }
}
