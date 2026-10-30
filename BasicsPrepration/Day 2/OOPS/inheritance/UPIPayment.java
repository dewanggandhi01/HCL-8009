package OOPS.inheritance;

public class UPIPayment implements PaymentService{
    @Override
    public void pay() {
        System.out.println("UPI Payment Done");
    }
}
