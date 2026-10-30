package Lambda;

import java.util.ArrayList;

// 1. Generic Class jisme T bounded hai (sirf Number types allow hain jaise Integer, Double)
class A<T extends Number> {
    T S;
    int a;

    // Constructor
    public A(T S, int a) {
        this.S = S;
        this.a = a;
    }

    public void display() {
        System.out.println("Generic Value (S): " + S + " (Type: " + S.getClass().getName() + ")");
        System.out.println("Integer Value (a): " + a);
    }

    // 2. Generic Static Method
    public static <E extends Number> void printNumbers(ArrayList<E> list) {
        System.out.println("Printing elements from Generic List:");
        for (E item : list) {
            System.out.println(item);
        }
    }
}

public class GenericDemo {
    public static void main(String[] args) {
        // Class A ka object banaya jisme T ki jagah Double diya
        A<Double> obj = new A<>(45.5, 10);
        obj.display();

        System.out.println("\n-------------------");

        // ArrayList banakar Generic Method ko call kiya
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);

        // Generic Method call
        A.printNumbers(numbers);
    }
}
