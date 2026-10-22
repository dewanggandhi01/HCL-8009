package FunctionalInterface;

import java.util.function.Predicate;

public abstract class implement implements Predicate<Integer> {
    public static void main(String[] args) {
        Predicate<Integer> evenodd = n -> (n % 2) == 0;
        System.out.println(evenodd.test(1));
        System.out.println(evenodd.test(2));
    }

}
