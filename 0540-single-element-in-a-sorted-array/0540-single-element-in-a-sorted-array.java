class Solution {
    public int singleNonDuplicate(int[] nums) 
    {
        if (nums.length ==1)
        {
            return nums[0];
        }
        else if (nums[0]!=nums[1])
        {
            return nums[0];
        }
        else if(nums[nums.length-1] != nums[nums.length-2])
        {
            return nums[nums.length-1];
        }

        int start =0;
        int end = nums.length-1;

        while(start<=end)
        {
        int mid = (start +end)/2;

        if(nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1])
        {
            return nums[mid];
        }
        else if (mid % 2 == 1) // check mid hamara odd indx hai to 
        {
            if(nums[mid-1] == nums[mid]) //  agr odd indx hai to uska pichla elemt se match kr gya to move karenge start index ko
            {
                start = mid+1;
            }
            else
            {
                end = mid -1;
            }
        }
        else // if mid indx is even
            {
            if(nums[mid] == nums[mid+1])
            {
                start = mid+1;
            }
            else
            {
                end = mid-1;
            }
            }
        }

           return -1;
    }
}


           // start hoga even index(0)
           // but end hoga odd index pe as exactly 2 baar repeat bs kr sakta hai
           // butt if agr koi element single present in between 1st na last element ho to iss hisab se jo last element ka index hoga wo even ho jayega

           // if agr hame mid element odd indx ka hua to uske left me check karege agr repeat hua elemnt to iska mtlb ye hua ki abhi tk jobhi elemnt the wo pair me the firrrrrr
           // move start mid+1