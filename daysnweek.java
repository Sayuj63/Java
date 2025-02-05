public class daysnweek {

    public static String convertDaysToWeeks(int days) {
        int weeks = days / 7;
        int remainingDays = days % 7;
        return days + " days is equal to " + weeks + " weeks and " + remainingDays + " days.";
    }

    public static void main(String[] args) {
        int days = 45;
        String result = convertDaysToWeeks(days);
        System.out.println(result);
    }
}