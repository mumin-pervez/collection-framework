package list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class AcceptingCollectionConstructor {

  public static void main(String[] args) {
    ArrayList<Integer> rollList = new ArrayList();
    rollList.add(1);
    rollList.add(2);
    rollList.add(4);
    rollList.add(8);
    rollList.add(9);

    List<Integer> list = new ArrayList<>(rollList);
    System.out.println(list);

  }

}
