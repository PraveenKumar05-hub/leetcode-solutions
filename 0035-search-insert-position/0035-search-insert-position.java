class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        while(start<=end) {
            int mid=(start+end)/2;
            if(target>nums[mid]) {  //focus on right
                start = mid+1;
            }
            else if(target<nums[mid]) { // focus on left
                end = mid-1;
            }
            else {
                return mid;
            }
        }
        return start;
    }
    }
