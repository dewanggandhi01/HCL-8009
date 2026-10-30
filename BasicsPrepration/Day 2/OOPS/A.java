package OOPS;

public class A {
    // default cons cannot be accessed outside the package
//    A(){
//        System.out.println("This is a constructor");
//    }

    // private cons can be accessed in same class but not in another
//    private A(){
//        System.out.println("Hello World");
//    }


    public static void main(String[] args) {
        A a = new A();
    }
}
