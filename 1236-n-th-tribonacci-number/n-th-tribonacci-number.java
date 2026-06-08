class Solution {
    public int tribonacci(int n) 
    {
        if(n==0)
        {
            return 0;
        }
        else if (n==1 || n==2)
        {
            return 1;
        }   
        else 
        {
            int firstterm = 0;
            int secondterm = 1;
            int thirdterm = 1;
            int nextterm =0 ;

            for (int i =1 ; i<=n ; i++)
            {

                nextterm = firstterm + secondterm + thirdterm;  // next term is the sum of the previous three terms
                firstterm = secondterm;                          // update first term to the previous second term
                secondterm = thirdterm;                          // update second term to the previous third term
                thirdterm = nextterm;                          // update third term to the current next term
            }
            return firstterm;
        }
    }
}