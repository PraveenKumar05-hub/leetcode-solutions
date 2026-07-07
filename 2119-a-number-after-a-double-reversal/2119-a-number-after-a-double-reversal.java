class Solution {
    public boolean isSameAfterReversals(int num) {
        int org = num;
        int sum1 = 0;
        int sum2 = 0;
        while(num>0){
            int ld = num % 10;
            sum1 = sum1 * 10 + ld;
            num = num/10; 
        }
        int org1 = sum1;
        while(sum1>0){
            int c = sum1 % 10;
            sum2 = sum2 * 10 + c;
            sum1 = sum1/10;
        }
        if(sum2 == org){
            return true;
        }
        return false;
    }
}