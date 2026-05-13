package list.stack;

import java.util.Stack;

public class AddElements {

  public static void main(String[] args) {
    Stack stack = new Stack();
    stack.push("A");
    stack.push("E");
    stack.push("I");
    stack.push("O");
    stack.push("U");
    System.out.println(stack); // [A, E, I, O, U]

    System.out.println(stack.search("E")); // As found, it will show 4 as offset is 4
    System.out.println(stack.search("P")); // If not found it will show -1

  }

}
