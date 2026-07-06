import java.util.Scanner;

public class GradeStatistics {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      double grade;
      double valueList;
      double sumOfGrades;
      double avgGrade;
      double maxGrade = 0;
      double minGrade = 0;
      int i;
      char userChar;

      valueList = 0;
      sumOfGrades = 0;
      userChar = ' ';

      /* For loop continues until user enters q */
      for(i = 1; userChar != 'q'; ++i){
         System.out.println("Please enter a grade from 1-10 or press q to quit.");

         if(scnr.hasNextDouble()){

            grade = scnr.nextDouble();

            if(grade >= 1 && grade <= 10){

               sumOfGrades += grade;
               valueList++;

               if(valueList == 1){
                  maxGrade = grade;
                  minGrade = grade;
               }

               if(grade > maxGrade){
                  maxGrade = grade;
               }

               if(grade < minGrade){
                  minGrade = grade;
               }

            }
            else{
               System.out.println("Grade must be between 1 and 10.");
            }

         }
         else{
            userChar = scnr.next().charAt(0);
            if(userChar != 'q'){
               System.out.println("Invalid input.");
            }

         }

      }
      if(valueList > 0){

         avgGrade = sumOfGrades / valueList;
         System.out.println("Total grades entered: " + valueList);
         System.out.println("Grade average: " + avgGrade);
         System.out.println("Maximum grade is: " + maxGrade);
         System.out.println("Minimum grade is: " + minGrade);
      }
      else{
         System.out.println("No grades were entered.");
      }

   }
}