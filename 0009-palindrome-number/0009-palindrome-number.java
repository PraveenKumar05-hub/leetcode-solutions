import java.util.Scanner;
class Solution {
    public boolean isPalindrome(int x) {
        int original=x;
        int reversed=0;

        while(x>0){
            int digit=x%10;
            reversed=reversed*10+digit;
            x=x/10;
        }
        return original==reversed;
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("x = ");
        int y = sc.nextInt();
        Solution sol = new Solution();
        if(sol.isPalindrome(y)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        sc.close();
    }
}