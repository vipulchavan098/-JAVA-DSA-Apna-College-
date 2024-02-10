import java.util.Scanner;

public class day_05_methods {
    public static void main(String[] args) {
// Question 1 : Write a Java method to compute the average of three numbers..
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        System.out.println(averagesum(a, b, c));
    }
    public static double averagesum(double a, double b, double c) {
        return  (a + b + c) /3 ;
    }
}
