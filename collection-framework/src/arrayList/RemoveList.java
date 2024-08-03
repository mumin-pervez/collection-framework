package arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveList {

  public static void main(String[] args) {
    ArrayList<String> department = new ArrayList<>();
    department.add("Registration");
    department.add("OPD");
    department.add("OPD");
    department.add("IPD");

    System.out.println("Row data list : " + department);

    // Traversing data by using foreach loop
    System.out.println("Initial List");
    System.out.println("=============");
    for (String list : department) {
      System.out.println(list);
    }
    System.out.println("After removing the 2nd element of the list");
    department.remove(1);
    // Traversing data by using iterator
    Iterator<String> itr = department.iterator();
    while (itr.hasNext()){
      System.out.println(itr.next());
    }


  }

}
