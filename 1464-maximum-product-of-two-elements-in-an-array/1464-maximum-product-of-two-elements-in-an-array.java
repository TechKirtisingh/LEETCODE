class Solution {
    public int maxProduct(int[] nums) 
    {
        int max=-1;  // nums[i] =arr[i]
        int smax= -1;

        for(int i=0 ; i<nums.length ; i++) // [3|4|7|6|5|8]
        {
            if(max<nums[i]) // -1<3(T) |  3<4(T) | 4<7(T) | 7<6 (F(loop ke bhar)) // 7<5(F) || 7<8(T)
            {
                smax= max;  // sm = -1 | =3 |=4 |=7
                max = nums[i] ; // ma = 3 | =4 |=7 | =8
            }
            else if (smax<nums[i]) // 4<6(T) | 6<5(F)
            {
                smax= nums[i] ; // 6
            }
        }    
        int ans = (max -1) * (smax-1); // (8-1)*(7-1)

        return ans;
    }
}