package Exercises;

public class secondsInAYear {
    public static void main(String[] args) {
        System.out.println("There are " + getSecondsInAYear() + " seconds in a year");
    }

    public static int getSecondsInAYear() {
        int days = 365;
        int totalHours;
        int totalMinutes;
        int totalSeconds;
        totalHours = days * 24;
        totalMinutes = totalHours * 60;
        totalSeconds = totalMinutes * 60;
        return totalSeconds;
    }
}
