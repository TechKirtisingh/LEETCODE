class MinStack {
    // create two stack:

    private Stack<Integer> stmain;
    private Stack<Integer> min;

// const funct because class name and function name is same
    public MinStack() 
    {
        stmain = new Stack<>();
        min = new Stack<>();
    }
    


    public void push(int value) 
    {
        if(stmain.size()==0)
        {

            min.push(value);
        
        }
        else if(min.peek()>=value)
        {
         
            min.push(value);
        
        }
        
        stmain.push(value);
    }
    


    public void pop() 
    {
        int ele1 = stmain.pop(); // yaha element main me se remove kr rahe hai
        int ele2 = min.peek(); // peek means element ko nikala hai check karne ke liye abhi pop nahi kiya hai

        if(ele1==ele2)
        {
            min.pop();
        }   
    }
    
    public int top() 
    {
        return stmain.peek();   
    }
    
    public int getMin() 
    {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */