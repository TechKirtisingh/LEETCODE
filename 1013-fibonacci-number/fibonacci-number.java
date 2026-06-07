class Solution {
    public int fib(int n) {
        if (n==0)           
        {
            return 0;
        }
        else if (n == 1)
        {
            return 1;
        }
        int firstterm = 0;                                   // ft=0 /  st=1   / tt =0+1=1
        int secondterm = 1;                                  //      / ft =1   / st= 1     / tt=1+1=2         
                                                            //                 /ft =1      / st =2       /tt =1+2=3 // goes same on.....
       for (int i=1 ; i<=n ; i++)
        {
            int thirdterm = firstterm + secondterm ;    // third term is the sum of the previous two terms 

            firstterm = secondterm ;                 // update first term to the previous second term             
            secondterm = thirdterm ;                // update second term to the current third term
        }

        return firstterm ; 
    }
}