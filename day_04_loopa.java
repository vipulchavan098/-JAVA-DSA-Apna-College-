import java.util.Scanner;

public class day_04_loopa {
    public static void main(String[] args) {

// Question 1 : How many times 'Hello' is printed?
       /* for(int i=0; i<5; i++) {
            System.out.println("Hello");
            i+=2;
            }  */

 // Question 2 : Write a program that reads a set of integers, and then prints the sum of the
// even and odd integers.
          /*  Scanner sc = new Scanner(System.in);
            int number;
            int choice;
            int evenSum = 0;
            int oddSum = 0;
            do{
                System.out.print("Enter the number");
                number = sc.nextInt();

                if (number % 2 == 0) {
                    evenSum += number;
                } else{
                    oddSum += number;
                }
            System.out.print("Do you want to continue? Press 1 for yes or 0 for no");
            choice = sc.nextInt();
            } while(choice ==1);
            System.out.println("Sum of even numbers: " + evenSum);
            System.out.println("Sum of odd numbers: " + oddSum);   */

// Question 3 : Write a program to find the factorial of any number entered by the user
           /* Scanner sc = new Scanner(System.in);
            
            int num; // To hold number
            int fact = 1; // To hold factorial
            
            System.out.print("Enter any positive integer: ");
            num = sc.nextInt();
            
            for(int i=1; i<=num; i++) {
            fact *= i;
            }
            System.out.println("Factorial: "+ fact);    */

// Question 4 : Write a program to print the multiplication table of a number N, entered by the user.
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter number:");
           
            int n = sc.nextInt();
            for(int i=1; i<=10; i++) {
           
            System.out.println(n + " * " + i + " = " + n*i);
            }

    }
}
