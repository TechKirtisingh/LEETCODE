class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        //[30,40,50,60]

        Stack<Integer> helperStack = new Stack<>(); // store index

        int n= temperatures.length;
        int[] result = new int[n]; // result array [0|0|0|0]

        for(int idx = n-1 ; idx>=0 ; idx--) // last to first element traverse
        {

            //Popping all indices with a lower or equal (check any ele. smaller than 50 (ans no because only 60 is currently in the stack ))
            //Temp than the current index

            while(!helperStack.isEmpty() && temperatures[idx] >= temperatures[helperStack.peek()])
            {
                helperStack.pop();
            }

            //If the stack still has elements,
            //then the next warmer temp exsists!

            if(!helperStack.isEmpty())
            {
                result[idx] = helperStack.peek() -idx;
            }

            //Inserting current index in the stack //1st step as stack is empty
            helperStack.push(idx);
        }

        return result;
        
    }
}