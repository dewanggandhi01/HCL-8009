package pack1;

public class Class1 {

    private String name;

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Private method
    private void privateMessage() {
        System.out.println("This is a PRIVATE method of Class1");
    }

    // Public method that calls the private method
    public void showPrivateMessage() {
        privateMessage();
    }
}