import java.util.Scanner;

public class day_05_methods {
   public static double averagesum(double a, double b, double c) {
        return  (a + b + c) /3 ;
    }
    public static boolean IsEven(int number){
        if (number % 2 ==0 ) {
            return true;
        }
        else{
            return false;
        }
    } 
    public static boolean Ispalindrome(int number){
        int palindrome = number; // copied number into variable
        int reverse = 0;
        while (palindrome != 0) {
        int remainder = palindrome % 10;
        reverse = reverse * 10 + remainder;
        palindrome = palindrome / 10;
        }
        if (number == reverse ) {
            return true;
        }
        else{
            return false;
        }
    } 
    public static int sumDigits(int n) {
        int sumOfDigits = 0;
        
        while(n > 0) {
        int lastDigit = n % 10;
        sumOfDigits += lastDigit;
        n /= 10;
        }

        return sumOfDigits;
    }
        
        
   
    public static void main(String[] args) {
// Question 1 : Write a Java method to compute the average of three numbers..
      /*  Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        System.out.println(averagesum(a, b, c));
     */
    
    // Question 2 : Write a method named isEven that accepts an int argument. The method
    // should return true if the argument is even, or false otherwise. Also write a program to test your
    // method.
    /*Scanner sc = new Scanner(System.in);
    int number=sc.nextInt();
    if(IsEven(number)) {
        System.out.println("Number is even");
        } else {
        System.out.println("Number is odd");
        }
    }*/
// Question 3 : Write a Java program to check if a number is a palindrome in Java?
   /*  Scanner sc = new Scanner(System.in);
    int number=sc.nextInt();
    if(Ispalindrome(number)) {
        System.out.println("Number is palindrome");
        } else {
        System.out.println("Number is Not palindrome");
        } */
// Question 5 :
// Write a Java method to compute the sum of the digits in an integer.
        Scanner sc = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int digits = sc.nextInt();
        System.out.println("The sum is " + sumDigits(digits)); 

}
}
