class Solution {
    public List<List<Integer>> permute(int[] nums) {

// tc= O[(n!)n]

        //iterate over each character 
        // for each character:
            //- start to pick the 1st character
            //- go back
            //-try pick the next

        List<List<Integer>> result = new ArrayList<>();
        
        //we pass result were we add all the permutation
        // we also add empty array list so that we back track and start from begin
        backtrack(result , new ArrayList<>() , nums);
        return result;
        
    }

    public void backtrack(List<List<Integer>> result , ArrayList<Integer> tempList , int[] nums)
    {

        // if we match the length , it is a permutation

        if(tempList.size()==nums.length)
        {
            result.add(new ArrayList<>(tempList));
            return;
        }

// number = one element from nums
        for (int number : nums)
        {
            //skip if we get same element
            if(tempList.contains(number))
                continue;

            //Add new element
            tempList.add(number);

            //go back to try other element
            backtrack(result , tempList , nums);

            //Remove the element that was just aaded
            tempList.remove(tempList.size()-1);
        }
    }
}