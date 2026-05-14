package cursor;

import java.util.ArrayList;
import java.util.Iterator;

public class IterateEvenNo {

  public static void main(String[] args) {
    ArrayList<Integer> arrayList = new ArrayList<>();
    for (int i = 1; i <= 5; i++) {
      arrayList.add(i);
    }
    System.out.println(arrayList); // [1, 2, 3, 4, 5]
    System.out.println("Now showing the Even Number using Iterator");
    Iterator itr = arrayList.iterator();
    while (itr.hasNext()) {
      Integer num = (Integer) itr.next();
      if (num % 2 == 0) {
        System.out.println(num);
      } else {
        itr.remove();
      }
    }
  }

}
