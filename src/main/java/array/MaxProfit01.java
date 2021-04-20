package array;

public class MaxProfit01 {

    public static void main(String[] args) {
        int[] prices = {8, 2, 6, 5, 1, 7, 5};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] nums){
        //1 errcheck
        if(nums.length == 0) return 0;

        //2
        int max = 0;
        int sofaMin = nums[0];

        for(int i = 0; i <nums.length; i++){
            if(nums[i] < sofaMin){
                sofaMin = nums[i];
            }else{
                max = Math.max(max, nums[i] - sofaMin);
            }
        }
        return  max;
    }
}
