package day1;

public class ExampleEncapsulation {

    public static void main(String[] args) {

        BankTxn bt = new BankTxn();
        bt.setCardNumber(245342352455l);
        bt.setCvv(123);
        bt.setExp(3333);
        bt.setName("Arvind");


        System.out.println(bt.getCardNumber());
        System.out.println(bt.getCvv());
        System.out.println(bt.getExp());
        System.out.println(bt.getName());


        System.out.println("*****************");

        bt.setCardNumber(2453423234552455l);
        bt.setCvv(123);
        bt.setExp(3233);
        bt.setName("Apeksha");


        System.out.println(bt.getCardNumber());
        System.out.println(bt.getCvv());
        System.out.println(bt.getExp());
        System.out.println(bt.getName());

    }
}
