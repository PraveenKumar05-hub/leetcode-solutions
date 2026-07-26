class Solution {
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int currentsum = 0;
        int maxsum = Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            currentsum = currentsum + nums[i];
            if(currentsum>maxsum){
                maxsum = currentsum;
            }
            if(currentsum < 0){
                currentsum = 0; 
            }  
        }
        return maxsum;
    }
}