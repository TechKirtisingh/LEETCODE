class Solution {
    public void moveZeroes(int[] nums) {

        int j = 0;

        // Step 1: saare non-zero elements front mein
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }

        // Step 2: remaining positions mein zero
        while (j < nums.length) {
            nums[j] = 0;
            j++;
        }
    }
}






// class Solution {
//     public void moveZeroes(int[] nums) {


// // i se array traverse karo
// // 2. Agar nums[i] != 0:
// //       nums[i] ko nums[j] se swap karo
// //       j++
// //3. End mein saare zero automatically aa jayenge

//         int j = 0;

//         for (int i = 0; i < nums.length; i++) {

//             if (nums[i] != 0) {
//                 int temp = nums[i];
//                 nums[i] = nums[j];
//                 nums[j] = temp;

//                 j++;
//             }
//         }
//     }
// }




