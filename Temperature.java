import java.util.Scanner;

public class Temperature {
  public static void main (String [] args){
    Scanner scnr = new Scanner(System.in);
    int[] dayOfWeek = new int[7];
    double[] temperature = new double[7];
    int searchDay;
    int i;
    

//Day of week for loop
  for (i = 0; i < 7; i++){
    System.out.println("Please insert weekday: ");
    dayOfWeek[i] = scnr.nextInt();

    if (dayOfWeek.equalsIgnoreCase("Monday") ||
    dayOfWeek.equalsIgnoreCase("Tuesday") ||
    dayOfWeek.equalsIgnoreCase("Wednesday") ||
    dayOfWeek.equalsIgnoreCase("Thursday") ||
    dayOfWeek.equalsIgnoreCase("Friday") ||
    dayOfWeek.equalsIgnoreCase("Saturday") ||
    dayOfWeek.equalsIgnoreCase("Sunday")) {
      temperature[i] = scnr.nextDouble();
    }

    // Valid day
}
  //test print
  System.out.println(dayOfWeek);





  }
}
