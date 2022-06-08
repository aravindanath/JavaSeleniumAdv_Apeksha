package day1;

public class iOS extends Mobile{
    void camera() {
        System.out.println("iphone camera");
    }

    void tourch() {
        System.out.println("iphone tourch");
    }

    public static void main(String[] args) {
        iOS ios = new iOS();
        ios.camera();
        ios.tourch();
        ios.network();
    }
}
