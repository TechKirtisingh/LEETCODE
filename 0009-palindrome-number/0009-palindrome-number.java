class Solution {
    public boolean isPalindrome(int x)
    {
        if (x<0)       // check given number is less than 0 (negative number is not allowed )
        {
            return false;
        }
        int n = x;               // x=121  andddd   n=121
        int revNum= 0;

        while(n>0)
        {       
        int lastdigit = n%10;           // with this we get last digit d=1 || 2
        revNum = revNum *10+lastdigit;  // revNum = 1 ||  12
        n=n/10;                 // with this we remove last element 12 || 1
        }
        if (revNum == x)        //  121 == 121
        {
            return true;
        }
        else 
        {
            return false;
        }
    }
}