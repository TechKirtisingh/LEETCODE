class Solution {
    public int reverse(int x) 
    {
        int rev = 0;
// Jab tak x me digits hain, tab tak loop chalega.
        while(x!=0)
        {
            int digit = x%10; // get last digit

// Overflow Check

            if (rev > Integer.MAX_VALUE / 10 ||
                rev < Integer.MIN_VALUE / 10) {
                return 0;
            }

            if (rev == Integer.MAX_VALUE / 10 && digit > 7)
                return 0;

            if (rev == Integer.MIN_VALUE / 10 && digit < -8)
                return 0;

            rev = rev * 10 + digit;
            x/=10;
        }      

        return rev;
    }
}