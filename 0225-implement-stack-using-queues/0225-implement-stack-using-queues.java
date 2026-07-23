class MyStack {

// no one access the queue
    private Queue<Integer> main;

    private Queue<Integer> helper;


    public MyStack() 
    {

        main = new LinkedList<>();
        helper = new LinkedList<>();
           
    }
    
    // main->helper
    //main.add(ele)
    //helper->main

    public void push(int x) 
    {
        // Moving all elemnt from main to helper

        while(main.size()>0)
        {
            helper.add(main.remove());
        }

// see in notes::->>

        // before adding element in main queue the element present in main queue will be added in helper 
        
        // then fir helper se elemnt nikal kr wapas main queue me add kr denge::
        // add ele(x) in main queue

        main.add(x);
        
        // moving all element from helper to main   

        while(helper.size()>0)
        {
            main.add(helper.remove());
        }
    }
    

    public int pop() 
    {
        return main.remove();   
    }
    

    public int top() 
    {
        return main.peek();   
    }
    

    public boolean empty() 
    {
        if(main.size()==0)
        {
            return true;
        }
        else
        {
            return false;
        }   
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */