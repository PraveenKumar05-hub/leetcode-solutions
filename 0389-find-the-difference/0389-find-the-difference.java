class Solution {
    public char findTheDifference(String s, String t) {
        char result = 0;

        // XOR all characters in string s
        for (int i = 0; i < s.length(); i++) {
            result ^= s.charAt(i);
        }
        
        // XOR all characters in string t
        for (int i = 0; i < t.length(); i++) {
            result ^= t.charAt(i);
        }
        
        // The remaining value is the added character
        return result;
    }
}