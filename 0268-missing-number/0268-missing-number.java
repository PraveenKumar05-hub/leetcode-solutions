class Solution {
    public int missingNumber(int[] nums) {
        int l = nums.length;
        int Nsum = l * (l+1)/2;
        int sum = 0;
        for(int i = 0;i<l;i++){
            sum += nums[i];
        }
        return Nsum-sum;
    }
}