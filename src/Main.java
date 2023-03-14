import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        // Målet är att skriva ut
        // Klockan är: tt:mm:ss

        String now = Calendar.getInstance().getTime().toString();
        now = now.substring(11, 19);

        System.out.println("Klockan är: " + now);
    }
}