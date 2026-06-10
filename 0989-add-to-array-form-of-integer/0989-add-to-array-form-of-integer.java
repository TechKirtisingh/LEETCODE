class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) 
    {
        // int p = num  // not possible because of the size of num, it can be up to 10^4 digits, which is too large for an integer type  (0-9)
        // k%10=last digit
        // k/10 = remove last digit

        List<Integer> ans= new ArrayList<>(); // create list as we return answer in array..

        int p = num.length -1; // pointer is at last index.. // [9,6,1] p is at 1 and k=532

        int carry = 0;

        while(p>=0 || k>0) // false as p=-1 
        {
           int numval = 0;

           if(p>=0)
           {
            // last digit nikal rahe hai array ka
            numval = num[p]; // numval= num[2(index)] = 1 // = 6 // = 9
           } 

           int d = k%10; // last digit from k // 2   // 3 // 5
           int sum = numval + d + carry; // sum = 1+2+0=3 // = 6+3+0 =9 // = 9+5+0 = 14

           int digit = sum%10; // = 3 // = 9 // =4
           carry = sum/10; // = 0 // =0 // = 1

           ans.add(digit); //[3] // [3 , 9] // [3,9,4] // digit at in reverse order

            p--;       // moving the pointer // p is at 6 // p is at 9 // p
            k = k/10; // removing the last digit from k // = 53 // = 5
        }
        if (carry>0)
        {
            ans.add(carry); // adding carry to the array list
        }
        Collections.reverse(ans); // reversing the ans array list 
        return ans ;
         
    }
}