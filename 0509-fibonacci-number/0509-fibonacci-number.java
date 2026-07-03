class Solution {
    public int fib(int n) {

        int n1 = 0, n2 = 1;

        for(int i = 1; i <= n; i++){
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }

        return n1;
    }
}