class Solution {
    public int bulbSwitch(int n) 
    {
// perfect square ke odd no. of multiples hote hai: 
// 25 [1,5,25]  ||  16 [1,2,4,8,16] 

// non perfect square ke even no. of multiples hote hai...
// 14 [1,2,7,14] || 8[1,2,4,8]

// in this question only the perfect square no. (positon) of the bulb is on

        int count = 0; //count of bulbs that are on

        int i=1;

// yaha tak ki condition ye hai ki count ka square n se chhota ya barabar ho kyuki bulb on hone ke liye bulb ka number perfect square hona chahiye

        while(i*i <= n) 
        {
            count++;
            i++ ;
        }        

        return count;
    }
}