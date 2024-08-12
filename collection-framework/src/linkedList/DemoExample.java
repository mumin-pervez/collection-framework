package linkedList;

import java.util.LinkedList;

public class DemoExample {

  public static void main(String[] args) {
    // Creating a linkedList
    LinkedList<String> list = new LinkedList<>();

    //Adding elements to the LinkedList using add() method.
    list.add("Laptop");
    list.add("Monitor");
    list.add("Mouse");
    list.add("Keyboard");
    list.add("Laptop");
    // Traversing element using for each loop
    for(String lst : list){
      System.out.println(lst);
    }
  }

}
