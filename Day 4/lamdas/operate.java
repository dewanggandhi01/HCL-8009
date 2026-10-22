package lamdas;

public class operate {
    public static void main(String[] args) {
        Calc c1 = (a, b) -> a + b;
        System.out.println(c1.calculate(10, 20));
        Calc c2 = (a, b) -> a - b;
        System.out.println(c2.calculate(10, 20));
        Calc c3 = (a, b) -> a * b;
        System.out.println(c3.calculate(10, 20));
        Calc c4 = (a, b) -> a / b;
        System.out.println(c4.calculate(10, 20));
        Calc c5 = (a, b) -> a % b;
        System.out.println(c5.calculate(10, 20));
    }
}
