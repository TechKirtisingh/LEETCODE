class Solution{

    public int singleNumber(int[] nums) 
    {
        // [1,2,1,4,4]

        // variable to store xor element
        int sing = nums[0]; //1

        //start a loop for all element
        for(int i=1 ; i<nums.length ; i++)
        {
            sing = sing^nums[i]; // 1^2^1^4^4 // 1 xor 1 = 4 xor 4 = 0 = 0 xor 2 = 2
        }

        return sing;
    }
}











// brute force technique....


// class Solution {

//     public int singleNumber(int[] nums) {

//         Arrays.sort(nums);

//         for(int i = 0; i < nums.length - 1; i += 2){

//             if(nums[i] != nums[i + 1]){
//                 return nums[i];
//             }
//         }

//         return nums[nums.length - 1];
//     }
// }

























// class Solution {
//     public int singleNumber(int[] nums) 
//     {
//         int n = nums.length;

//         for(int i=0 ; i<n ; i++)
//         {
//             int count = 0;
//             for(int j=0 ; j<n ; j++)
//             {
//                 if(nums[i]==nums[j])
//                 {
//                     count++;
//                 }
//             }
//             if(count==1)
//             {
//                 return nums[i];
//             }
//         } 
//         return -1;  
//     }
// }