class Solution {
    public boolean isPalindrome(int x) {
        int rev = 0;
        int org = x;

        while(x>0){
            int LD = x % 10;
            rev = rev * 10 + LD;
            x = x / 10;
        }
        return org==rev;

    }
}