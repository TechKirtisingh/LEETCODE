import java.util.Stack;

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> helperStack = new Stack<>(); // [ | | | 1 | 2] =>[||||4]

        // [1,3,4,1,2]

        int[] nextGreaterElements = new int[nums2.length]; //array create to put nextgreater ele
        // [ ,  , -1 , 2 ,  -1] => 

        for (int i = nums2.length - 1; i >= 0; i--) {
            int element = nums2[i];

            // If stack empty, no next greater element
            if (helperStack.isEmpty()) {
                helperStack.push(element);
                nextGreaterElements[i] = -1;
                continue;
            }

            // If top of stack is greater, it is next greatest

            if (helperStack.peek() > element) {    //  1<2(T) //4<2(F)
                nextGreaterElements[i] = helperStack.peek();
                helperStack.push(element); //2
                continue;
            }

            // Remove all elements smaller than or equal to element
            while (!helperStack.isEmpty() && helperStack.peek() <= element) { //-1(all ele smaller than 4)
                helperStack.pop();
            }

            if (helperStack.isEmpty()) {
                nextGreaterElements[i] = -1;
            } else {
                nextGreaterElements[i] = helperStack.peek();
            }

            helperStack.push(element);
        }

        int[] result = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {

            for (int j = 0; j < nums2.length; j++) {

                if (nums1[i] == nums2[j]) {
                    result[i] = nextGreaterElements[j];
                    break;
                }
            }
        }

        return result;
    }
}