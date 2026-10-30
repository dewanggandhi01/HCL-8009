package OOPS.inheritance;

public class CardPayment implements PaymentService{
    @Override
    public void pay() {
        System.out.println("Card Payment Done");
    }
}
