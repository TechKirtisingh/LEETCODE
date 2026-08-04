class Solution {

    public int singleNumber(int[] nums) {

        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 1; i += 2){

            if(nums[i] != nums[i + 1]){
                return nums[i];
            }
        }

        return nums[nums.length - 1];
    }
}





















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