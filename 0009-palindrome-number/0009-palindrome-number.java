class Solution {
    public boolean isPalindrome(int x) {
        
        // Negative numbers are never palindromes
        if (x < 0) {
            return false;
        }

        // Numbers ending in 0 (except 0 itself) cannot be palindromes
        if (x % 10 == 0 && x != 0) {
            return false;
        }

        int reversed = 0;

        // Reverse only half of the digits
        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }

        // Even digits: x == reversed
        // Odd digits: x == reversed / 10 (ignore middle digit)
        return x == reversed || x == reversed / 10;
    }
}