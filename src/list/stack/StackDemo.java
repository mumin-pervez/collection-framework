package list.stack;

import java.util.Stack;

public class StackDemo {

  public static void main(String[] args) {
    Stack list = new Stack();
    list.add("Zannat");
    list.add("Abdullah");
    list.add("Mina");
    System.out.println(list);

    Stack stack = new Stack();
    stack.push("A");
    stack.push("E");
    stack.push("I");
    stack.push("O");
    stack.push("U");
    System.out.println(stack);
    System.out.println(stack.search("O"));
  }

}
