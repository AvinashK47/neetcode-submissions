class MinStack {
    private Deque<Integer> mainStack;
    private Deque<Integer> minStack;

    public MinStack() {
        this.mainStack = new ArrayDeque<>();
        this.minStack = new ArrayDeque<>();
    }

    public void push(int val) {
        mainStack.push(val);
        if (minStack.isEmpty() || val < minStack.peek()) {
            minStack.push(val);
        } else {
            int top = minStack.getFirst();
            minStack.push(top);
        }
    }

    public void pop() {
        mainStack.pop();
        minStack.pop();
    }

    public int top() {
        return mainStack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
