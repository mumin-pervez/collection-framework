package list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class AcceptInitialCapacityConstructor {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>(5);
    System.out.println(list.isEmpty());
    list.add("Mango");
    list.add("Banana");
    list.add("Apple");
    list.add("Berry");
    list.add("Coconut");
    System.out.println(list);
  }

}
