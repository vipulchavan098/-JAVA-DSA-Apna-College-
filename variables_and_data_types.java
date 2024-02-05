import java.util.Scanner;

public class variables_and_data_types {
    public static void main(String[] args) {
//Question 1 : In a program, input 3 numbers : A, B and C. You have to output the average of
// these 3 numbers.
       /*  Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int average = (a + b + c)/3;
        System.out.println("the average of given value =" +average);*/

//Question 2: In a program, input the side of a square. You have to output the area of the 
//square
      Scanner sc = new Scanner(System.in);
      int side = sc.nextInt();
      
      int area = side * side;
      System.out.println("Area of square= " +area);

//Question 3: Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
//an eraser. You have to output the total cost of the items back to the user as their bill.
       /* Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();

        float net = pencil + pen + eraser;
        System.out.println("The total cost of item= " +net);
        //try adding 18% gst tax to the items in the bil

        float Total = (0.18f * net )+ net;
        System.out.println("TOTAL is" +Total);  */
// Question 4: What will be the type of result in the following Java code
        byte b =4;
        char c= 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;

        double result = (f*b) + (i%c) - (d*s);
        System.out.println("the value will get Double because of type conversion ");

// Question 5: (Advanced) Will the following statement give any error in Java?
// int $ = 24
    //   => No it will not give error Because of $ it is variable name ;
    }
}
