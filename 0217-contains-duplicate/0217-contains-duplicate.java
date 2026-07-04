class Solution {
    public boolean containsDuplicate(int[] nums) {
        int c=0;
        Arrays.sort(nums);
        for(int i = 0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]){
                c++;
                break;
            }
        }
        if(c==0){
            return false;
        }
        return true;
    }
}