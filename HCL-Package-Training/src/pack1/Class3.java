package pack1;

public class Class3 {

    public static void main(String[] args) {

        Class1 obj = new Class1();

        // Using setter
        obj.setName("Dewang");

        // Using getter
        System.out.println("Name: " + obj.getName());

        // Calling public method
        obj.showPrivateMessage();
    }
}