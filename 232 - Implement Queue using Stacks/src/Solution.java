import java.util.Stack;

class MyQueue {
    Stack<Integer> forwardQueue;
    Stack<Integer> reverseQueue;

    public MyQueue() {
        forwardQueue = new Stack<Integer>();
        reverseQueue = new Stack<Integer>();
    }

    public void push(int x) {
        reverseQueue.push(x);
    }

    public int pop() {
        fillForwardQueue();

        return forwardQueue.pop();
    }

    public int peek() {
        fillForwardQueue();

        return forwardQueue.peek();
    }

    public boolean empty() {
        return forwardQueue.isEmpty() && reverseQueue.isEmpty();
    }

    private void fillForwardQueue() {
        if (forwardQueue.isEmpty()) {
            while (!reverseQueue.isEmpty()) {
                forwardQueue.push(reverseQueue.pop());
            }
        }
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