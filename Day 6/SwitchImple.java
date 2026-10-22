
public class SwitchImple {
    public static void main(String[] args) {
        String day = "Monday";
        String result = switch (day){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> "WeekDay";
            case "Saturday", "Sunday" -> "WeekEnd";
            default -> "Unexpected Value";
        };
        System.out.println(result);

    }
}
