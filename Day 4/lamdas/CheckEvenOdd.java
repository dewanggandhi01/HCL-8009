package lamdas;

public class CheckEvenOdd {
    public static void main(String[] args) {
        EvenOdd eo = a -> a % 2 == 0;
        System.out.println(eo.check(10));
        System.out.println(eo.check(21));
    }
}
