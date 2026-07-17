class Solution {
    public String largestNumber(int[] nums) {

        // Step 1: Convert int to String
        String[] arr = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        // Step 2: Custom Sorting
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        // Step 3: Handle case like [0,0]
        if (arr[0].equals("0")) {
            return "0";
        }

        // Step 4: Join strings
        StringBuilder ans = new StringBuilder();

        for (String s : arr) {
            ans.append(s);
        }

        return ans.toString();
    }
}