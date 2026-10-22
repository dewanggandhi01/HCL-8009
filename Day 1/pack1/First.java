package pack1;

import pack2.Second;

public class First{
    public static void main (String[] args)
    {
        System.out.println("Package 1");
        Second s=new Second(5);
        System.out.println(s.getId());
    }
}