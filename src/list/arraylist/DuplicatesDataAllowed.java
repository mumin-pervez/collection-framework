package list.arraylist;

import java.util.ArrayList;

public class DuplicatesDataAllowed {

  public static void main(String[] args) {
    ArrayList<String> al = new ArrayList();
    al.add("Paracetamol");
    al.add("Napa");
    // Duplicates are allowed in ArrayList
    al.add("Paracetamol");
    al.add("Ace");
    System.out.println(al);

    ArrayList<Integer> al2 = new ArrayList<>();
    al2.add(10);
    al2.add(12);
    al2.add(11);
    al2.add(10);
    al2.add(13);
    System.out.println(al2);
  }

}
