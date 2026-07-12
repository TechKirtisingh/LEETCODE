class Solution {
    public int maxSubArray(int[] nums) 
    {
        int currsum = nums[0];
        int maxsum = nums[0];


        for(int i=1 ; i < nums.length ; i++)
        {
            if(currsum + nums[i] > nums[i]) 
            // check kr raha agr pichla sum me  judh ke nums[i] se bada ho raha ki nahi
            {
                currsum+=nums[i];
            }
            else
            {
                currsum = nums[i];
            }

            maxsum = Math.max(maxsum , currsum); // always update max  
        }           

        return maxsum;
    }
}


// max sum ke liye kabhi negative number khud se start nahi karega
// hame current sum nikalne ke liye ye check karna padega ki hu khud se start ho ke max no. de raha ki currsum me add hoke

// aur currsum and maxsum dono 1st bindx ke baad se suru honge

// currsum=nums[0]     ||         maxsum= nums[0]


// arr[5 ,-4 , 7 , 1 , 8]

// brute force tech:  
// [5] | [5,-4] | [5,-4,7] | [5,-4,7,1] | [5,-4,7,1,8]
// [-4] | [-4 ,7] | [-4,7,1] | [-4,7,1,8]
// [7] | [7,1] | [7,1,8] 
// [1] | [1,8]
// [8]

// we we aplly this technique we use
// for(int i=0 ----> n )
//   currsum=0;
//   for (int j = i+1 ---->n)
//      currsum = nums[j]