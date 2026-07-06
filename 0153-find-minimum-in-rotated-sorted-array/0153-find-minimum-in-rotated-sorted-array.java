class Solution {
    public int findMin(int[] nums) 
    {
    if(nums.length == 1) // ek hi element ho to 
    {
         return nums[0];
    } 
    else if (nums[0] <nums[nums.length -1]) // if array is sorted
    {
        return nums[0];
    } 

    // [50 , 60 , 70 ,80 ,90,100, 10 , 20 , 30 , 40]
    //  0     1    2   3   4   5   6    7    8  9

        int start = 0; // 5 
        int end = nums.length-1; // 9  // 6

        while(start <= end)
        {
            int mid = (start +end )/2; // 4 // 7 // 5(here start and mid is same)

            if(mid!=0 && nums[mid-1]>nums[mid]) // left adjacent hamesha chota hi hota but agr bada hua mtlb ki wo mid element hai [10 is mid] [90 , 100 , 10 , 20]

            // in case agr mid hara starting element ho gya to mid ka left to zero hua hai that's an exception case

            // T&80>90(F) // T&10>20(F)
            {
                return nums[mid];
            }
            else if(mid!=nums.length-1 && nums[mid]>nums[mid+1]) 
            {  // T&90>100(F) //T&20>30(F)
                return nums[mid+1];
            }
            else if (nums[start]<=nums[mid]) // left part is sorted // 50<90(T) // 100<20(F)
            {
                start = mid+1;
            }
            else // right part is sorted
            {
                end = mid-1;

            }
        }

        return -1;




//               [50 , 60 , 70 ,80 , 90 , 100 , 10 , 20 , 30 , 40 ] {rotated array}

// if array is rotated and if we get min element then uske dono side left aur right max element hoga 

// in this mujhe kabhi bhi sorted part me min element nahi milega as min is present to hm unsorted part ko dekhenge to start poitnt (mid+1) ho jayega
// then calculate mid [20] (now next we taking unsorted part of [100 , 10 , 20 ] )
// mid-1 (end) when we calculate unsorted par
    }
}