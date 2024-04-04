public class day_10_arrays {
    // pairs of arrays
    /* public static void pairofarray(int numbers[]){
        for (int i = 0; i < numbers.length; i++) {
            int curr = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + curr + "," + numbers[j] + ")");
            }
            System.out.println( );
        }
    }
    public static void main(String[] args) {
        int numbers [] = {2,4,6,8,10};
        pairofarray(numbers);

    }
    */
    // print subarray of given arrays
    /*public static void  printsubarray(int numbers[]){
        int ts = 0;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                for ( int k = start; k<=end; k++){
                    System.out.print(numbers[k] + " ");
                }
                ts++;
                System.out.println( );
            }
            System.out.println( );
            
        }
        System.out.println("total subarray " + ts);
    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        printsubarray(numbers);
        
    } */

    public static void maxSubarraySum(int numbers[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currsum = 0;
                for (int k = start; k <= end; k++) {
                    currsum += numbers[k];
                }
                System.out.println(currsum);
                if (maxsum < currsum) {
                    maxsum = currsum;
                }
            }
        }
        System.out.println("max sum = " + maxsum);
    }
    public static void main(String[] args) {
        int numbers [] = {1,-2,6,-1,3};
        maxSubarraySum(numbers);
    }
}
