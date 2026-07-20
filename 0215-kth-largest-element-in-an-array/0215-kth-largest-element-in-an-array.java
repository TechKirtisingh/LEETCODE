class Solution {
    public int findKthLargest(int[] nums, int k) 
    {
       // kth largest element means if k =2 means 2nd largest element in array , k=3 means 3rd largest element in array    

        Arrays.sort(nums); 

        return nums[nums.length - k]; //

    }
}


/// Another Apporach ::::::::::






// class Solution {
//     public int findKthLargest(int[] nums, int k) 
//     {


//        // kth largest element means if k =2 means 2nd largest element in array , k=3 means 3rd largest element in array    

//         // here we priority queue



//     PriorityQueue<Integer> pq = new PriorityQueue<>();

//     for(int i=0 ; i<nums.length;i++)
//     {
//         if(pq.size()<k)
//         {
//             pq.add(nums[i]);
//         }
//         else if(pq.peek() < nums[i])
//         {
//             pq.remove();
//             pq.add(nums[i]);
//         }
//     }
//     return pq.peek();

//     }
// }