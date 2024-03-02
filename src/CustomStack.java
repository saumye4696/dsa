public class CustomStack {
    private static final int DEFAULT_SIZE = 10;
    protected int[] data;

    int pointer = -1;

    public CustomStack() {
        // this(DEFAULT_SIZE);
        data = new int[DEFAULT_SIZE];
    }

    public CustomStack(int size) {
        data = new int[size];
    }

    public boolean push(int element) {
        if (isFull()) {
            System.out.println("Stack already full.");
            return false;
        }
        pointer++;
        data[pointer] = element;
        return true;
    }

    public int pop() {
        if (isEmpty()) {
            throw new Exception("Stack is already empty.");
        }
        return data[pointer--];
    }

    private boolean isFull() {
        if (pointer == data.length - 1) {
            return true;
        }
        return false;
    }

    private boolean isEmpty() {
        if (pointer == -1) {
            return true;
        }
        return false;
    }

}
