class Solution {
    public void moveZeroes(int[] nums) {


// i se array traverse karo
// 2. Agar nums[i] != 0:
//       nums[i] ko nums[j] se swap karo
//       j++
//3. End mein saare zero automatically aa jayenge

        int j = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                j++;
            }
        }
    }
}