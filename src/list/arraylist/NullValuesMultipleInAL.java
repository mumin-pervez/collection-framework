package list.arraylist;

import java.util.ArrayList;

public class NullValuesMultipleInAL {

  public static void main(String[] args) {
    ArrayList<String> al = new ArrayList<>();
    al.add("Registration");
    al.add("Emergency");
    al.add("OPD");
    al.add("IPD");
    al.add("OPD");
    al.add("Billing");
    al.add("Laboratory");
    al.add("Radiology");
    al.add("Pharmacy");
    al.add("Store & Inventory");
    al.add("");
    al.add(null);
    al.add(null);
    al.add(null);
    System.out.println(al);
  }

}

