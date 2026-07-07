  class Solution {
    public int findPeakElement(int[] nums) 
    {
        // peak element are those element which is greater than both adjacent element 


    if(nums.length ==1) // if one element is present
    {
        return 0;
    }
    else if(nums[0]>nums[1]) // cheching edge case (starting element)
    {
        return 0;
    }
    else if(nums[nums.length-1]>nums[nums.length-2])
    {
        return nums.length-1;
    }
    else 
    {
        int start =1 ;
        int end = nums.length-2;

        while(start<=end)
        {
            int mid=(start+end)/2;

            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]) // 13,[14],16
            {
                return mid;
            }
            else if (nums[mid]<nums[mid+1]) // Start move to right
            {
                start = mid+1;   
            }
            else
            {
                end = mid-1;
            }
        }

        return -1;
    }

    }
}

 // 5, 10, 20, 15, 14, 13 ,12 , 11 ,10 // here peak element is 20
//  0   1   2   3  4    5   6    7   8
// S                                 E
//      S          mid           E

// check adjacent element of mid ""is it possible that the adjacent element will be peak (compare with mid if possible move that past of the element)""  ..... E (15)  and new_mid=20 as element 15 may be poosible be a peak element as it is smaller then right neighbour