import java.util.Stack;

class stackex {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack: " + stack);

        // Peeking the top element
        System.out.println("Top element: " + stack.peek());

        // Popping elements
        System.out.println("Popped: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        // Checking if stack is empty
        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
