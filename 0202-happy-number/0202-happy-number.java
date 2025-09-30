class Solution {
    public boolean isHappy(int n) {
        if(n<=0){
            return false;
        }
        while(n!=1 && n!=4){
            int temp = n;
            int square = 0;
            while(temp>0){
                int num = temp%10;
                square += (num*num);
                temp/=10;
            }
            n = square;
        }
        return n == 1;
    }
}