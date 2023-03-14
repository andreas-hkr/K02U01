import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        // Målet är att skriva ut
        // Klockan är: tt:mm:ss

        System.out.println("Datum och tid:");
        System.out.println(Calendar.getInstance().getTime().toString());
    }
}