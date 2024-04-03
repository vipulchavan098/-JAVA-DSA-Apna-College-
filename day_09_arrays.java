import java.util.Scanner;

public class day_09_arrays {
    // public static void update(int marks[], int nonchangable[]) {
    //    nonchangable[0] = 10;
    //     for(int i=0; i<marks.length; i++) {
    //         marks[i] = marks[i] + 1;
    //     }
    // }
    // public static int linearsearch(int numbers[], int key) {
    //     for(int i = 0; i<numbers.length; i++ ){
    //         if (numbers[i] == key) {
    //             return i;
    //         }
    //     }
    //     return -1;
// }
    public static int largestnumber(int numbers[]) {
        int largest = Integer.MIN_VALUE; //-infinity
        int smallest = Integer.MAX_VALUE;

        for(int i = 0; i<numbers.length;i++) {
            if (largest < numbers[i]) {
                largest = numbers [i];
            }
            if (smallest > numbers[i]) {
                smallest = numbers[i];
            }
        }
        System.out.println("smallest value is : " + smallest);
        return largest;
    }
    
    public static void main(String[] args) {
       int numbers[] = {1,2,6,3,5};
       System.out.println("largest number is : " + largestnumber(numbers));

       
        // int numbers[] ={10,12,4,5,7,8,9,14,17};
        // int key = 5;

        // int index = linearsearch(numbers, key);
        // if (index == -1) {
        //     System.out.println("Not Found");
        // }
        // else {
        //     System.out.println("the key is at index : " + index);
        // }
        
        // int marks[] = {97,98,99};
        // int nonchangable[] = {5};
        // update(marks,nonchangable);
        // System.out.println(nonchangable[0]);

        // for(int i=0; i<marks.length; i++) {
        //     System.out.print(marks[i]+" ");
        // }
        // System.out.println( );

        // int marks[] = new int[50];
        // Scanner sc = new Scanner(System.in);
        // marks[0] = sc.nextInt();
        // marks[1] = sc.nextInt();
        // marks[2] = sc.nextInt();

        // System.out.println("phy" + marks[0]);
        // System.out.println("che" + marks[1]);
        // System.out.println("mat" + marks[2]);
    }
}
