public class day_13_parctice_sorting {
  /*   Question : Use the following sorting algorithms to sort an array in DESCENDING order :
a. Bubble Sort
b. Selection Sort
c. Insertion Sort
d. Counting Sort
You can use this array as an example : [3, 6, 2, 1, 8, 7, 4, 5, 3, 1]
*/
    public static void bubblesort(int nums[]) {
        for (int turn = 0; turn < nums.length-1; turn++) {
            for (int i = 0; i < nums.length-1-turn; i++) {
                if (nums[i] > nums[i+1]) {
                    //swap 
                   int temp = nums[i];
                   nums[i] = nums[i+1];
                   nums[i+1] = temp;
                }
            }
        }
    }
    public static void selectionsort(int nums[]) {
        for (int i = 0; i < nums.length-1; i++) {
            int minpos = i;
            for (int j = i+1; j < nums.length; j++) {
                if (nums[minpos] > nums[j]) {
                    minpos = j;
                }
            }
            //swap
            int temp = nums[minpos];
            nums[minpos] = nums[i];
            nums[i] = temp;
        }
    }
    public static void insertionsort(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            int prev = i-1;
            //finding out the correct postion to insert
            while (prev >= 0 && nums[prev] > curr) {
                nums[prev+1] = nums[prev];
                prev --;
            }
            //insertion
            nums[prev+1] = curr;
        }
    }
    public static void countingsort(int nums[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            largest = Math.max(largest, nums[i]);
        }

        int count[] = new int[largest+1];
        for (int i = 0; i < nums.length; i++) {
            count[nums[i]]++;
        }

        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                nums[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void printarr(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int nums[] = {3, 6, 2, 1, 8, 7, 4, 5, 3, 1};
        countingsort(nums);
        printarr(nums);
    }
}
