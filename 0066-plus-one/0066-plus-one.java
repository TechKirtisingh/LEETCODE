class Solution {
    public int[] plusOne(int[] digits) {

        int n = digits.length;

        // Traverse from the last digit to the first
        for (int i = n - 1; i >= 0; i--) {

            // If the current digit is not 9,
            // increment it and return.
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }

            // If the digit is 9, it becomes 0
            digits[i] = 0;
        }

        // If all digits were 9, create a new array
        int[] ans = new int[n + 1];
        ans[0] = 1;

        return ans;
    }
}