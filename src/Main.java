public class Main {
    public static void main(String[] args) {
        System.out.println(isWeekend("Saturday"));
    }

    public static boolean isWeekend(String weekday) {
        if (weekday == "Saturday" || weekday == "Sunday") {
            return true;
        } else{
            return false;
        }
    }
}