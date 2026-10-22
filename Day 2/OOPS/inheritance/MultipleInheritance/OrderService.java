package OOPS.inheritance.MultipleInheritance;

public class OrderService implements PlaceOrder, PaymentService {
    @Override
    public void order() {
        System.out.println("Order Placed");
    }
    @Override
    public void pay(){
        System.out.println("Payment Done");
    }

    public static void main(String[] args) {
        OrderService orderService = new OrderService();
        orderService.pay();
        orderService.order();
    }
}
