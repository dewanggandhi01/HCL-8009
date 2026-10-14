package Lambda;

import java.util.function.Function;
import java.util.function.BiFunction;
import java.util.function.Supplier;
import java.util.function.Consumer;

class Student {
    String name;
    
    public Student(String name) {
        this.name = name;
    }
}

public class FunctionalDemo {
    public static void main(String[] args) {
    	// 1. Function (1 input, 1 output)
    	Function<String, Integer> stringLength = (str) -> str.length();
        int length = stringLength.apply("Dewang");
        System.out.println("Length of 'Dewang' = " + length);

        // 2. BiFunction (2 inputs, 1 output)
        BiFunction<Integer, Integer, Integer> multiply = (a, b) -> a * b;
        int product = multiply.apply(4, 5);
        System.out.println("Multiplication (4 * 5) = " + product);

        // 3. Supplier (0 input, generates a value)
        Supplier<Double> randomValue = () -> Math.random();
        System.out.println("Random Value: " + randomValue.get());

        // 4. Consumer (1 input, processes it, returns nothing)
        Consumer<Student> studentConsumer = (s) -> {
            System.out.println("Processing student name: " + s.name);
        };
        
        // Consumer Example
        Student studentObj = new Student("Dewang");
        studentConsumer.accept(studentObj);
    }
}
