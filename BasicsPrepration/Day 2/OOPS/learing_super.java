package OOPS;

public class learing_super {
    static class Animal{
        String name = "Animal";
        void sound(){
            System.out.println("Animal");
        }
    }
    static class Dog extends Animal{
        String name = "Dog";
        void printNames(){
            System.out.println(name);
            System.out.println(super.name);
        }
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.printNames();
    }
}
