class Solution {
    public String largestNumber(int[] nums) {

        // Step 1: Convert int to String(array to string)

        String[] arr = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i]+""; //5+"" => "5"
        }

        // Step 2: Custom Sorting [3,31] => 331(s1+s2) , 313(s2+s1) || compare
        Arrays.sort(arr, (s1, s2) -> (s1 + s2).compareTo(s2 + s1));

        // Step 4: Join strings
        StringBuilder ans = new StringBuilder("");

        for (int i = arr.length-1 ; i>=0 ;i--) {
            ans.append(arr[i]);
        }

        if(ans.charAt(0) =='0'){
            return "0";
        }
        else{
            return ans.toString(); 
        }
    }
}