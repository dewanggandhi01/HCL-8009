package OOPS;

public class superclass {
    static class parent{
        parent(){
            System.out.println("parent");
        }
    }
    static class child extends parent{
        child(){
            super();
            System.out.println("child");
        }
    }

    public static void main(String[] args) {
        child c = new child();
    }
}
