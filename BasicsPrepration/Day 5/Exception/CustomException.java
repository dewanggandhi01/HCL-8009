package Exception;

public class CustomException {
    public static void main(String[] args) throws Exception, InvalidAgeException {

        int age = 12;
        if (age < 18) {
            throw new InvalidAgeException("Under Age");
        }
    }
}
