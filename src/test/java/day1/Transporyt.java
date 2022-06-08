package day1;

public class Transporyt implements MinOFRailwasy, MinOFRoadWays
{
    @Override
    public void metro() {
        System.out.println("Metro");
    }

    @Override
    public void cargo() {
        System.out.println("Cargo");
    }

    @Override
    public void NH() {
        System.out.println("NH");
    }

    @Override
    public void sh() {
        System.out.println("sh");
    }

    public static void main(String[] args) {

        Transporyt transporyt = new Transporyt();
        transporyt.cargo();
        transporyt.NH();
        transporyt.metro();
    }
}
