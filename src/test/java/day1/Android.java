package day1;

public class Android  extends Mobile
{
    @Override
    void camera() {
        System.out.println("android Camera");
    }

    @Override
    void tourch() {
        System.out.println("android Tourch");
    }

    public static void main(String[] args) {
        Android android = new Android();
        android.camera();
        android.tourch();
        android.network();
    }
}
