package cursor;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

  public static void main(String[] args) {
    List<String> list = new ArrayList<>();
    list.add("Registration");
    list.add("Emergency");
    list.add("OPD");
    list.add("IPD");
    list.add("Billing");
    list.add("Pharmacy");
    list.add("Inventory");
    list.add("Death");

    ListIterator listIterator = list.listIterator();
    //Forward traversal
    while (listIterator.hasNext()) {
      System.out.println(listIterator.next());
    }
    System.out.println("====================Backward Traversal====================");
    //Backward Traversal
    while (listIterator.hasPrevious()) {
      System.out.println(listIterator.previous());
    }


  }

}
