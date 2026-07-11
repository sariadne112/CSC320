import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String[] dayOfWeek = new String[7];
        double[] temperature = new double[7];

        String weekday;
        int i;
        int j;

        // Collect seven weekdays and temperatures
        for (i = 0; i < dayOfWeek.length; i++) {

            System.out.print("Please enter weekday: ");
            weekday = scnr.next();

            boolean duplicateDay = false;

            for (int j = 0; j < i; j++) {
              if (weekday.equalsIgnoreCase(dayOfWeek[j])) {
             duplicateDay = true;
            }
            }

            if (duplicateDay) {
             System.out.println("That weekday has already been entered.");
             i--;
             continue;
            }
            // Validate weekday
            if (weekday.equalsIgnoreCase("Monday") ||
                weekday.equalsIgnoreCase("Tuesday") ||
                weekday.equalsIgnoreCase("Wednesday") ||
                weekday.equalsIgnoreCase("Thursday") ||
                weekday.equalsIgnoreCase("Friday") ||
                weekday.equalsIgnoreCase("Saturday") ||
                weekday.equalsIgnoreCase("Sunday")) {

                dayOfWeek[i] = weekday;

                boolean validTemperature = false;

                // Validate temperature
                while (!validTemperature) {

                    System.out.print("Enter temperature in Fahrenheit: ");

                    if (scnr.hasNextDouble()) {
                        temperature[i] = scnr.nextDouble();

                        if (temperature[i] >= -20 &&
                            temperature[i] <= 130) {

                            validTemperature = true;

                        } else {
                            System.out.println(
                                "Invalid temperature. Enter a value between -20 and 130."
                            );
                        }

                    } else {
                        System.out.println(
                            "Invalid input. Please enter a number."
                        );

                        scnr.next(); // Remove invalid input
                    }
                }

            } else {
                System.out.println("Please enter a valid weekday.");
                i--; // Repeat this array position
            }
        }

        // Print the entire week
        System.out.println("\nWeekly Temperatures:");

        for (i = 0; i < dayOfWeek.length; i++) {
            System.out.println(
                "Day: " + dayOfWeek[i] +
                " Temperature: " + temperature[i]
            );
        }

        scnr.close();
    }
}