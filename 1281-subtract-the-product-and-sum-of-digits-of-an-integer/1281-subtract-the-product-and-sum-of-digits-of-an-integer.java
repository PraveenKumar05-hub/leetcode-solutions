class Solution {
    public int subtractProductAndSum(int n) {
        int org = n;
        int s = 0;
        int p = 1;
        while(n>0){
            int c = n % 10;
            s = s + c;
            p = p * c;
            n/=10;
        }
        int result = p - s;
        return result;
    }
}