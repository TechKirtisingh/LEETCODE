class Solution {
    public int maximumCount(int[] nums) 
    {
        int positivecount = 0;
        int negativecount = 0;
        for(int i=0 ; i<=nums.length-1 ; i++)
        {        
            if(nums[i]>0)
            {
                positivecount++;
            }
            else if (nums[i]<0)
            {   
                negativecount++;
            }
        }
        int answer = Math.max(positivecount , negativecount);
        return answer;
    }
}


// and time complexity is O(n)

//   now we are trying to do to solve this prb with TC: O(log(n))

//as the given array is sorted then we can apply binary search

// 2nd approch is that if we find last negative integer indx and first positive integer indx we get the answer as array is sorted


// last negative int : indx +1 =negative count
// first positive int : length - indx = positive count







// class Solution 
// {
//     public int maximumCount(int[] nums)
//     {
//         int lastNegIndx = lastNegative(nums)+1;
//         int firstposIndx = nums.length - firstpositive(nums);

//         return Math.max(lastNegIndx , firstposIndx);
//     }




//     public int lastNegative(int[] nums)
//     {
//         int start = 0;
//         int end = nums.length-1;

//         int ans =-1;

//         while(start<=end)
//         {
//             int mid = (start + end)/2;

//             if(nums[mid]<0)
//             {
//                 ans = mid;
//                 start = mid+1;
//             }
//             else{
//                 end = mid-1;
//             }
//         }

//         return ans;
//     }




//     public int firstpositive (int[] nums)
//     {
//         int start = 0;
//         int end = nums.length-1;

//         int ans = nums.length;

//         while(start<=end)
//         {
//             int mid = (start + end)/2;

//             if(nums[mid]>0)
//             {
//                 ans=mid;
//                 end = mid-1;
//             }
//             else
//             {
//                 start = mid+1;
//             }
//         }
//         return ans;

//     }
// }
