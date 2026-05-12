package list.arraylist;

import java.util.ArrayList;

public class AddDataUsingLoop {

  public static void main(String[] args) {
    // Creating an ArrayList
    ArrayList<Integer> arrayList = new ArrayList<>();
    System.out.println(arrayList); //Empty array will be printed

    for (int i = 0; i <= 5; i++) {
      arrayList.add(i);
    }
    System.out.println(arrayList);
  }

}
