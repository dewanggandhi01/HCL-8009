package OOPS.inheritance;
public class order {
    public static void main(String[] args) {
        PaymentService ps = new CardPayment();
        ps.pay();
        System.out.println("Order Placed");
    }
}
