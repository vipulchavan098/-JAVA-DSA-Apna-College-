public class day_11_arrays {
    public static void maxsubarraysum(int numbers[]) {
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
        System.out.println("the max sum = "+ maxsum);
    }
    public static void kadanes(int numbers[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < numbers.length; i++) {
            cs = cs + numbers[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, i);
        }
        System.out.println("the max sum = " + ms);
    }

    public static int trappedRainwater(int height[]) {
        int n = height.length;
        // calculate the left max boundary - array
        int leftmax [] = new int[n];
        leftmax [0] = height[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i-1]);
        }

        // calculate the left max boundary - array
        int rightmax[] = new int[n];
        rightmax [n-1] = height[n-1];
        for (int i = n-2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i+1]);
        }

        int trappedwater = 0;
        // loop
        for (int i = 0; i < n; i++) {
            //waterLevel = min(leftmax bound, rightmax bound)
            int waterLevel = Math.min(leftmax[i], rightmax[i]);

            //trapped water =waterlevel - height[i]
            trappedwater += waterLevel - height[i];
        }
        return trappedwater;
    }

    public static int buyandsellstocks(int price[]){
        int buyprice = Integer.MAX_VALUE;
        int maxprofit = 0;

        for (int i = 0; i < price.length; i++) {
            if (buyprice < price[i]) {
                int profit = price[i] - buyprice;
                maxprofit = Math.max(maxprofit, profit);
            } else {
                buyprice = price[i];
            }
        }
        return maxprofit;
    }
    public static void main(String[] args) {
        int price[] = {7,1,5,3,6,4};
        System.out.println(buyandsellstocks(price));
    }
}
