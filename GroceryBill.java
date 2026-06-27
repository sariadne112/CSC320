import java.util.Scanner;

public class GroceryBill {
  public static void main (String [] args){
    Scanner scnr = new Scanner(System.in);
    double coupon;
    double week1;
    double week2;
    double week3;
    double week4;
    double avgWeekly;
    double totalMonthly;
    double monthlyWithCoupon;
    double weekWithCoupon;
    
    /* Enter Coupon amount */
    System.out.println("Enter Coupon Amount in decimal form (example, .10) ");
    coupon = scnr.nextDouble();
    /*Ensure the value is set to 10% if the value exceeds 100% or is less than or equal to zero.*/
    if((coupon <= 0 )||(coupon > 1.0)){
      coupon = .10;
    }
    /*Prompt the user for weeks 1 */
    System.out.println("Enter grocery bill for Week1");
    week1 = scnr.nextDouble();
    /*Prompt the user for weeks 2 */
    System.out.println("Enter grocery bill for Week2");
    week2 = scnr.nextDouble();
    /*Prompt the user for weeks 3 */
    System.out.println("Enter grocery bill for Week3");
    week3 = scnr.nextDouble();
    /*Prompt the user for weeks 4 */
    System.out.println("Enter grocery bill for Week4");
    week4 = scnr.nextDouble();
    /* Calculate monthly total, also Monthly Without Coupon*/
    totalMonthly = week1 + week2 + week3 + week4;
    /*Calculate avg weekly, also weekly Without Coupon */
    avgWeekly = totalMonthly / 4;

    /*Monthly With Coupon */
    monthlyWithCoupon = totalMonthly - (totalMonthly * coupon);
    /*Weekly Avg With Coupon*/
    weekWithCoupon = monthlyWithCoupon / 4;

    System.out.println("--------------------------");
    System.out.println("Calculate Grocery Bill");
    System.out.println("Grocery Bills by Week: ");
    System.out.println("Week One: " + week1);
    System.out.println("Week Two: " + week2);
    System.out.println("Week Three: " + week3);
    System.out.println("Week Four: " + week4);
    System.out.printf("Your Monthly Total is: $%.2f%n", totalMonthly);;
    System.out.printf("Your Weekly Average is: $%.2f%n", avgWeekly);
    System.out.println("Your Coupon is " + coupon);
    System.out.printf("Your Monthly Total with Coupon is: $%.2f%n", monthlyWithCoupon);
    System.out.printf("Your Weekly Average with Coupon is: $%.2f%n", weekWithCoupon);
    System.out.print("--------------------------");
    






  }
}
