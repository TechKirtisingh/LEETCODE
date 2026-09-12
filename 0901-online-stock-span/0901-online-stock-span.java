class StockSpanner {

    List<Integer> list;

    public StockSpanner() {
        this.list = new ArrayList<>();
    }

    public int next(int price) {
        list.add(price);

        int count = 0;

        for (int i = list.size() - 1; i >= 0; i--) {

            if (list.get(i) > price)
                break;

            count++;
        }

        return count;
    }

    public int[] calculateSpans(int[] prices) {

        int[] spans = new int[prices.length];
        spans[0] = 1; // Span of first element is always 1

        Stack<Integer> indexStack = new Stack<>();

        // Push the index of first element
        indexStack.push(0);

        for (int i = 1; i < prices.length; i++) {

            while (!indexStack.isEmpty()
                    && prices[indexStack.peek()] < prices[i])
                indexStack.pop();

            // If index stack is empty, the price at index 'i'
            // is greater than all previous values
            if (indexStack.isEmpty())
                spans[i] = i + 1;
            else
                spans[i] = i - indexStack.peek();

            indexStack.push(i);
        }

        return spans;
    }
}
























// class StockSpanner {

//     Stack<int[]> stack;

//     public StockSpanner() {
//         stack = new Stack<>();
//     }

//     public int next(int price) {

//         int span = 1;

//         // Remove all smaller/equal prices
//         while (!stack.isEmpty() && stack.peek()[0] <= price) {

//             span += stack.pop()[1];
//         }

//         // Store {price, span}
//         stack.push(new int[]{price, span});

//         return span;
//     }
// }

//// importaant point to be noted:
//1. first value of the output span is always be the one.
//2. the span is the difference of two indexes
//3. for every value , look to the left until you find a value that is greater.

//eg. [100 | 80 | 60 | 70 | 60 | 75 | 85]


//for span output::==>

// [1|1|1|2|1|4|6]

// explaination: look 85 :-> 1st way: 85 index in 6 and look left 100 is the only no. greater than 85 so, subtract their indexes: (6-0 = 6)
// 2nd way counting the total value between 100 and 85 and also include 85 (total 6) same for all number..


/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */