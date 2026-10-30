package pack2;
public class Second {
    protected int id;
    public Second(int id) {
        this.id = id;
        System.out.println("Package 2");
    }
    public Second(){}

    public int getId() {
        return id;
    }
}

