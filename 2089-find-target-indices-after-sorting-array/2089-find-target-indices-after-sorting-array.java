class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {

        Arrays.sort(nums);

        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                ans.add(i);
            }
        }

        return ans;
    }
}





// first we sort the array then...
// then check with target





// class Solution {
//     public List<Integer> targetIndices(int[] nums, int target) 
//     {
//         int num =0; // calculate kitne no. target se chote hai
//         int tcount = 0; // count kitne mere target wale integers hai 

//         for (int ele : nums) //element nikale nums se
//         {
//             if(ele == target)
//             {
//                 tcount++;
//             }
//             else if(ele <target)
//             {
//                 num++;
//             }
//         }
//         List<Integer> ans = new ArrayList<>(); // create new array to store ans

//         while(tcount > 0)
//         {
//             ans.add(num);
//             num++;
//             tcount--;
//         }

//         return ans ;

//     }
// }