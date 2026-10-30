import java.sql.SQLOutput;
import java.util.HashSet;
import java.util.Set;

public class Setimp {
    public static void main(String[] args) {
        Set<Integer> s = new HashSet<>();
        s.add(1);
        s.add(2);
        s.add(2);
        s.add(1);
        System.out.println(s);

    }
}
