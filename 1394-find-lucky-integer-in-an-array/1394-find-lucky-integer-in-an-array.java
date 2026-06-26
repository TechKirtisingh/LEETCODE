class Solution {
    public int findLucky(int[] arr) 
    {
       // Array ke ander frequency calculate karna hai to use :: """HASH MAP FUNCTION"""  : is a data structure used to store value in key value pair

       HashMap<Integer , Integer > hm = new HashMap<>(); 

       for(int i=0 ; i<arr.length ; i++)
       {
        int ele = arr[i]; // element nikala

        if(hm.containsKey(ele)==true)  
        // check kr rahe hai ki koi element PAHALE se present hai ki nahi hash map
        {
            hm.put(ele,hm.get(ele)+1); // hm me element put karo but   purani ferquency hme milega(hm.get(ele)) use increment kr do
        } 
        else
        {
            hm.put(ele ,1); // element pahli baar aya hai
        }
       }  

       int ans = -1 ; // beacuse jb bhi answer update na ho to wo return kr de -1

       for(int key : hm.keySet()) // iteration in hash map
       {
        if(hm.get(key)==key)
        {
            ans = Math.max(ans ,key);
        }
       }

       return ans;

    }
}