class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num<=0){
            return false;
        }
        int sum = 0;
        for(int i = 1 ; i <=num/2;i++){
            if(num%i==0){
                sum = sum + i;
            }
        }
        if(num == sum){
            return true;
        }
        return false;
    }
}