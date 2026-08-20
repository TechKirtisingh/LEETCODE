class StockSpanner {

    Stack<int[]> stack;

    public StockSpanner() {
        stack = new Stack<>();
    }

    public int next(int price) {

        int span = 1;

        // Remove all smaller/equal prices
        while (!stack.isEmpty() && stack.peek()[0] <= price) {

            span += stack.pop()[1];
        }

        // Store {price, span}
        stack.push(new int[]{price, span});

        return span;
    }
}


/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */