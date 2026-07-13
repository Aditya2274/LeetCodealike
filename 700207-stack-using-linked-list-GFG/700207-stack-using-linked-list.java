class myStack {
    Node top;
    int currsize;

    public myStack() {
        this.top = null;
        this.currsize = 0;
    }

    public boolean isEmpty() {
        return this.top == null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        currsize++;
    }

    public int pop() {
        if (top == null) {
            return -1; 
        }
        int popped = top.data;
        top = top.next;
        currsize--;
        return popped;
    }

    public int peek() {
        if (top == null) {
            return -1;
        }
        return top.data;
    }

    public int size() {
        return this.currsize;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna