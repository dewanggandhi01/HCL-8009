package OOPS;

public class instancecounter {
    static int cnt;
    static class A{
        A(){
            cnt++;
            System.out.println("A");
        }
    }
    static class B{
        B(){
            cnt++;
            System.out.println("B");
        }
    }
    static class c extends A{
        c(){
            cnt++;
            System.out.println("C");
        }
    }

    public static void main(String[] args) {
        //A a = new A();
        A c = new c();
        B b = new B();
        System.out.println(cnt);
    }
}
