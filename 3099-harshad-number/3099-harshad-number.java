class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int s = 0;
        int org = x;
        while(x>0){
            int c = x%10;
            s = s + c;
            x/=10;
        }
        if(org%s==0){
            return s;
        }
            return -1;
    }
}