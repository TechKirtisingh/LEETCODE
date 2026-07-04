class Solution {
    public int search(int[] nums, int target) 
    {

// [50 60 70 80 90 100 10 20 30 40]   // target 30
//  0  1  2  3  4  5   6  7  8  9
        int start = 0;              // s=0
        int end = nums.length - 1;  // 9

        while (start <= end) { // T

            int mid = start + (end - start) / 2; // 4 // (5+9)/2=>7 // 8+9/2=>8

            // Target found   
            if (nums[mid] == target) { // F //20==30(F) // 30==30(T) (final ans)
                return mid;
            }

            // Left half is sorted // first part is sorted
            if (nums[start] <= nums[mid]) { // 50<90 (T this part is sorted) // 100<20 (F)

                if (target >= nums[start] && target < nums[mid]) {  // 50 60 70 // if target element is 60 then it means it must be greater than 50 (start) and less than 70 (end)

                // 30>50(F) 

                    end = mid - 1;
                } else {
                    start = mid + 1; // s= 5
                }

            }
            // Right half is sorted
            else { 

                if (target > nums[mid] && target <= nums[end]) { // 30>20(T) && 30<=40 (T)
                    start = mid + 1; // s=8
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}


        // in roated sorted array     

        //[10 20 30 40 50 60 70 80 90 100]
        
    //1.  roated [50 60 70 80 90 100 10 20 30 40]

    //2. roated [70 80 90 100 10 20 30 40 50 60]

    // after many rotation may get originl array

// after finding mid any one part either (start to mid) or (mid to end) is sorted

// how to get to know that which part is sorted :

// always start move from mid+1
//                  

//  arr[start] <= mid :=> 1st part is sorted
// arr[mid] <= arr[end] :=> 2nd part is sorted
