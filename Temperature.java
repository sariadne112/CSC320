import java.util.Scanner;

public class Temperature{
    public static void main(String[] args){
        Scanner scnr = new Scanner(System.in);

        String[] dayOfWeek = new String[6];
        double[] temperature = new double[6];

        String weekday;
        String questionDay = " ";
        double total = 0;
        int i;
        int j;

        // Collect seven weekdays and temperatures
        for (i = 0; i < dayOfWeek.length; i++){

            System.out.print("Please enter weekday: ");
            weekday = scnr.next();

            boolean duplicateDay = false;

            for (j = 0; j < i; j++){
              if (weekday.equalsIgnoreCase(dayOfWeek[j])){
             duplicateDay = true;
            }
            }

            if (duplicateDay){
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
                weekday.equalsIgnoreCase("Sunday")){

                dayOfWeek[i] = weekday;

                boolean validTemperature = false;

                // Validate temperature
                while (!validTemperature){

                    System.out.print("Enter temperature in Fahrenheit: ");

                    if (scnr.hasNextDouble()){
                        temperature[i] = scnr.nextDouble();

                        if (temperature[i] >= -20 &&
                            temperature[i] <= 130){
                            validTemperature = true;
                        } 
                        else{
                            System.out.println(
                                "Invalid temperature. Enter a value between -20 and 130."
                            );
                        }
                    } 
                    else{
                        System.out.println("Invalid input. Please enter a number." );
                        scnr.next(); // Remove invalid input
                    }
                }
            } 
            else{
                System.out.println("Please enter a valid weekday.");
                i--; // Repeat this array position
            }
        }

        System.out.println("Please enter weekday or 'week': ");
        questionDay = scnr.next();
  
        //While to quit
        while (!questionDay.equalsIgnoreCase("q")){

          System.out.print("Enter a weekday, type 'week' to see the full forecast, or 'q' to quit: ");
          questionDay = scnr.next();
          //end program if q
          if (questionDay.equalsIgnoreCase("q")){
            System.out.println("Program ended.");
          }
          //Print whole week
          else if (questionDay.equalsIgnoreCase("week")){
            System.out.println("------------ Week Full Forecast ------------");
            
            for (i = 0; i < dayOfWeek.length; i++){
              System.out.println("Day: " + dayOfWeek[i] + " Temperature: " + temperature[i]);
              total += temperature[i];
            }

            double average = total / temperature.length;

            System.out.println("-------------------------------------");
            System.out.println("Weekly average temperature: " + average);
          }

        else{
          boolean dayFound = false;
           for (i = 0; i < dayOfWeek.length; i++){
              if (questionDay.equalsIgnoreCase(dayOfWeek[i])){
                  System.out.println("Day: " + dayOfWeek[i] + " Temperature: " + temperature[i]);
                  dayFound = true; }
            }

        if (!dayFound){
            System.out.println("That day was not found. Enter Monday through Sunday, week, or q.");}
        }
      }
        
        scnr.close();
    }
}