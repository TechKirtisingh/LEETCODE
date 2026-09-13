class Solution {
    public List<List<Integer>> subsets(int[] nums) 
    {

        List<List<Integer>> resultList = new ArrayList<>();

        // Start backtracking from the beginning

        backtrack(resultList , new ArrayList<>(), nums , 0);
        return resultList;

    }
    private void backtrack(List<List<Integer>> resultSets , List<Integer> tempSet, int[] nums , int start)
    {
        //Add the set to result set

        resultSets.add(new ArrayList<>(tempSet));

        for(int i= start ; i<nums.length;i++)
        {
            //Case of including the number
            tempSet.add(nums[i]);

            //Backtrack the new subset
            backtrack(resultSets , tempSet , nums, i+1);

            //Case of not-including the number
            tempSet.remove(tempSet.size() -1);
        }
    }
}








// class Solution {
//     public List<List<Integer>> subsets(int[] nums) {

//         List<List<Integer>> result = new ArrayList<>();

//         int n = nums.length;
//         int total = 1 << n;   // 2^n

//         for (int mask = 0; mask < total; mask++) {

//             List<Integer> subset = new ArrayList<>();

//             for (int i = 0; i < n; i++) {

//                 // Check if ith bit is set
//                 if ((mask & (1 << i)) != 0) {
//                     subset.add(nums[i]);
//                 }
//             }

//             result.add(subset);
//         }

//         return result;
//     }
// }