class Solution {
    public int search(int[] nums, int target) 
    {

        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            // Target found
            if (nums[mid] == target) {
                return mid;
            }

            // Left half is sorted
            if (nums[start] <= nums[mid]) {

                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }
            // Right half is sorted
            else {

                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1;
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
//  arr[start] <= mid :=> 1st part is sorted
// arr[mid] <= arr[end] :=> 2nd part is sorted
