class Solution {
    public boolean isPowerOfTwo(int n) 
    {
        if(n<1)             // negative number (n=-2,-4,-16)
        {
            return false;
        }
        else if (n==1)
        {
            return true;
        }
        else
        {
            while(n%2==0)   // even number (n=2,4,16)  // n=16 / 8 / 4 / 2 / 1
            {
                n=n/2;
            }
            if(n==1)                        //check after condition satisfy wheather it is 1 or not 
            {
                return true;  // n is a power of 2 (n=2,4,16)
            }
            else
            {
                return false;   // odd number (n=3,5,7,9)   
            }      
    }
 }
}