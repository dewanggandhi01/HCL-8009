package OOPS;

public class cons_overloading {
    // learing about constructor overloading
    static class A{
        String name;
        int roll;
        String Dept;

        A(){
            System.out.println("Object is created");
        }

        A(String name,int roll){
            this.name = name;
            this.roll = roll;
        }

        A(String name,int roll,String Dept){
            this.name = name;
            this.roll = roll;
            this.Dept = Dept;
        }
    }

    public static void main(String[] args) {
        A a = new A();
    }
}
