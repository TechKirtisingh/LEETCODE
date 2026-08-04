class Solution {

    public int majorityElement(int[] nums) {

        Arrays.sort(nums);

        return nums[nums.length / 2];
    }
}

















// class Solution {
//     public int majorityElement(int[] nums) 
//     {

// // [2,2,1,1,1,2,2]

//         int n = nums.length; // n=7

//         for(int i=0 ; i<n ; i++)
//         {// Har element ko ek baar current element banana. //i=0->2 , i=1->2 , i=3->1
//             int count=0;

//             for(int j=0 ; j<n ; j++)
//             {//Current element ki frequency count karna.
//                 if(nums[i]==nums[j])
//                 {
//                     count++;
//                 }
//             }
//             if(count>n/2)
//             {
//                 return nums[i];
//             }
//         }
//         return -1;
//     }
// }