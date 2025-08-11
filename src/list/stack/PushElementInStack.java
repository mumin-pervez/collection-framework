package list.stack;

import java.util.Stack;

public class PushElementInStack {

  public static void main(String[] args) {
    Stack s = new Stack();
    s.push("Banana");
    s.push("Mango");
    s.push("Apple");
    s.push("Berry");
    System.out.println(s); // [Banana, Mango, Apple, Berry]
    System.out.println(s.search("Mango")); // 3: When matched it will return 3

    System.out.println("Initial capacity : " + s.capacity()); // 10 as initial capacity

/*    System.out.println(s.pop()); // Last element will be shown
    System.out.println(s.pop()); // 2nd Last element will be shown*/
    System.out.println("Using isEmpty() and pop() method to show the elements");
    while (!s.isEmpty()) {
      System.out.println(s.pop());
    }

    System.out.println(s.search("Mang")); // 3: When not matched it will return -1
  }

}
