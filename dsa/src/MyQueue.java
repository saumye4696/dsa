import java.util.Stack;

class MyQueue {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> integerStack = new Stack<>();
    int pointer = 0;
    
    public MyQueue() {
        
    }

    public void push(int x) {
        stack.push(x);
    }

    public int pop() {
        for (int i = 0; i < stack.size(); i++) {
            integerStack.push(stack.pop());
        }
        int ans = integerStack.peek();
        for (int i = 0; i < integerStack.size(); i++) {
            stack.push(integerStack.pop());
        }
        return ans;
    }

    public int peek() {
        for (int i = 0; i < stack.size(); i++) {
            integerStack.push(stack.pop());
        }
        int ans = integerStack.peek();
        for (int i = 0; i < integerStack.size(); i++) {
            stack.push(integerStack.pop());
        }
        return ans;
    }

    public boolean empty() {
        return stack.size() == 0 ? true : false;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */