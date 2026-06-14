class Solution 
{
    public int removeElement(int[] nums, int val) 
    {
       // AFETR REMOVING ELEMENT : ORDER NOT MATTER

        // [2,6,2,1,3,4] , val=2 

        int p=0; // pointer 

        for(int i=0 ; i<nums.length ; i++)
        {
            if(nums[i] != val) // 2!=2 (F) // 6!=2 (T) // 2!=2(F) (skip) // 1!=2(T) // 3!=2 (T)
            {
                nums[p] = nums[i] ; // [6,1,3,4, , ]
                p++ ;
            }
        }
        return p ;

    }
}