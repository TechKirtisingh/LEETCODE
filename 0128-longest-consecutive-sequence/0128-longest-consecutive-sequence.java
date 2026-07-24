class Solution {
    public int longestConsecutive(int[] nums) 
    {
        // Agar array empty hai

        if(nums.length == 0)
        {
            return 0;
        }

        HashMap<Integer , Boolean> map = new HashMap<>(); 

// Har number ko map me insert kar do aur Abhi sabko true diya hai.

        for(int i =0 ; i<nums.length ; i++)
        {
            map.put(nums[i] , true);
        }

//               Kaun starting point hai?
//      Agar kisi number ka previous number exist karta hai
//           to woh starting point nahi ho sakta.

        for(int i=0 ; i< nums.length ; i++)
        {
            if (map.containsKey(nums[i] - 1)) 
            {
            map.put(nums[i], false);
            }
        }

        int longest = 0;

        // Step 3: Count sequence lengths
        for (int num : map.keySet())
        {
            if (map.get(num))
            {
                int current = num;
                int count = 1;

                while (map.containsKey(current + 1))
                {
                    current++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        return longest;
    }
}