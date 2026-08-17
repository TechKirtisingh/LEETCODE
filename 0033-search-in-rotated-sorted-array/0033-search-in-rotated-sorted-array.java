class Solution {

    public int search(int[] arr, int target) {
        return modifiedBinarySearch(arr, target, 0, arr.length - 1);
    }

    private int modifiedBinarySearch(int[] arr, int target, int left, int right) {

        // Not found
        if (left > right)
            return -1;

        // Avoid overflow
        int mid = left + (right - left) / 2;

        // Found
        if (arr[mid] == target)
            return mid;

        // Left half is sorted
        if (arr[mid] >= arr[left]) {

            // Target lies in left half
            if (arr[left] <= target && target <= arr[mid])
                return modifiedBinarySearch(arr, target, left, mid - 1);
            else
                return modifiedBinarySearch(arr, target, mid + 1, right);
        }

        // Right half is sorted
        else {

            // Target lies in right half
            if (arr[mid] <= target && target <= arr[right])
                return modifiedBinarySearch(arr, target, mid + 1, right);
            else
                return modifiedBinarySearch(arr, target, left, mid - 1);
        }
    }
}













// class Solution {
//     public int search(int[] nums, int target) 
//     {

// // [50 60 70 80 90 100 10 20 30 40]   // target 30
// //  0  1  2  3  4  5   6  7  8  9
//         int start = 0;              // s=0
//         int end = nums.length - 1;  // 9

//         while (start <= end) { // T

//             int mid = start + (end - start) / 2; // 4 // (5+9)/2=>7 // 8+9/2=>8

//             // Target found   
//             if (nums[mid] == target) { // F //20==30(F) // 30==30(T) (final ans)
//                 return mid;
//             }

//             // Left half is sorted // first part is sorted
//             if (nums[start] <= nums[mid]) { // 50<90 (T this part is sorted) // 100<20 (F)

//                 if (target >= nums[start] && target < nums[mid]) {  // 50 60 70 // if target element is 60 then it means it must be greater than 50 (start) and less than 70 (end)

//                 // 30>50(F) 

//                     end = mid - 1;
//                 } else {
//                     start = mid + 1; // s= 5
//                 }

//             }
//             // Right half is sorted
//             else { 

//                 if (target > nums[mid] && target <= nums[end]) { // 30>20(T) && 30<=40 (T)
//                     start = mid + 1; // s=8
//                 } else {
//                     end = mid - 1;
//                 }
//             }
//         }

//         return -1;
//     }
// }




