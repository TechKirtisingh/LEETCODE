class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1; // 
            if(nums[index]<0) //if value is neagtive just continue..
                continue;

            nums[index] *= -1; // if value is not negative just multiply with -1..
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) { //dubara iterate karenge aur check karenge kon sa mark nahi jo mark nahi hoga wahi element add hoga
                result.add(i + 1);
            }
        }

        return result;
    }
}