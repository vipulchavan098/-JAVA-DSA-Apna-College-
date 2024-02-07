import java.util.Scanner;

public class day_03_conditional_statement {
    public static void main(String[]args){
        
// Question 1 : Write a Java program to get a number from the user and print whether it is
// positive or negative.
      /* Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a>0) {
            System.out.println("Postive");
        }
        else{
            System.out.println("negative");
        }  */ 

// Question 2 : Finish the following code so that it prints You have a fever if your temperature
//  is above 100 and otherwise prints You don't have a fever.
      /*  double temp = 103.5;
        if (temp>100) {
            System.out.println("YOU HAVE FEVER");
        }
        else{
            System.out.println("NO FEVER");
        }  */

// Question 3 : Write a Java program to input week number(1-7) and print day of week name
// using switch case
   /* Scanner sc = new Scanner(System.in);
    int week = sc.nextInt();   
        switch (week) {
            case 1: 
                System.out.println("Sunday");
                break;
            case 2: 
                System.out.println("Monday");
                break;
            case 3: 
                System.out.println("Tuesday");
                break;
            case 4: 
                System.out.println("Wednesday");
                break;
            case 5: 
                System.out.println("Thursday");
                break;
            case 6: 
                System.out.println("Friday");
                break;
            case 7: 
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Not Difine a Day");
                break;
        }  */
//Question 5 : Write a Java program that takes a year from the user and print whether that
// year is a leap year or not.
    /*    Scanner sc = new Scanner(System.in);
        System.out.print("Input the year: ");
            int year = sc.nextInt();
            boolean x = (year % 4) == 0;
            boolean y = (year % 100) != 0;
            boolean z = ((year % 100 == 0) && (year % 400 == 0));
               if (x && (y || z)) {
                System.out.println(year + " is a leap year");
               } 
               else {
                System.out.println(year + " is not a leap year");
               }     */
// Question 4 : What will be the value of x & y in the following program.
               int a = 63;
               int b = 36;
               boolean x = (a < b ) ? true : false;
               int y= (a > b ) ? a : b;
               System.out.println(x);
               System.out.println(y);

// Answer : false,63.
        }
    }
