class Solution {                                                                     
public int[] searchRange(int[] nums, int target) {

// Ek array banaya hai jisme default answer [-1,-1] hai.
//  Agar target nahi mila to isi ko return kar denge

        int[] ans = {-1, -1};

// Agar array empty hai to search karne ki zarurat hi nahi hai

        if(nums.length == 0)
            return ans;

        ans[0] = firstOccurance(nums, target); // Target ka pehla index nikal rahe hain.
        ans[1] = lastOccurance(nums, target); // Target ka last index nikal rahe hain.

        return ans;
    }

    public int firstOccurance(int[] nums, int target) {

        int start = 0;              // 0 
        int end = nums.length - 1;  // 5

        int ans = -1; // Agar target na mile to -1 return hoga.

        while(start <= end) {

            int mid = start + (end - start) / 2;         // 2

// Target mil gaya. Abhi immediately return nahi karenge.
// Kyun?
// Ho sakta hai usse bhi pehle target ho. // for if condition

            if(nums[mid] == target) {

                ans = mid;  // Answer store kar diya. Ab left side search karenge taaki aur pehla occurrence mil sake
                end = mid - 1;

            }
            else if(target > nums[mid]) {

                start = mid + 1;

            }
            else { // Target chhota hai.

                end = mid - 1;
            }
        }

        return ans;
    }

    public int lastOccurance(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;

        int ans = -1;

        while(start <= end) {

            int mid = start + (end - start) / 2;

            if(nums[mid] == target) {
// Target mil gaya. Ab aur right side search karenge.     Ho sakta hai target aur aage bhi ho.     Isliye
                ans = mid;
                start = mid + 1;

            }
            else if(target > nums[mid]) {

                start = mid + 1;

            }
            else {

                end = mid - 1;
            }
        }

        return ans;
    }
}

////////////////   explaination 

          // nums=[10 ,20,20,30,30,30,40,40,50,50,60,70]  target=30
//                  S                                   E
// First occurance
// use binary search method : array ko half me divide kr denge 
// mid = S+E /2 => 5
// agr hame kabhi 1st occurance find karna hai to wo mid ke left me milne ke chance jayada honge tb jb mid me shayad wo element occur kr sake (mid = 30)value (5th index) = ans
// so after getting take E and put at mid-1 positon (E=4index(mid-1))
// then fir find mid ((0+4)/2 => 2)

//check weather the target is greater or less than 

// in this case my target is greater than 
// // then move S to mid+1 (0=>3)(currently S is at 3)

// mid =((3+4)/2 => 3) (S and mid is at same position)

// then also we check shayad mid se pahale bhi occurance ho sakti hai to ((((put E ===>  mid - 1  ))))