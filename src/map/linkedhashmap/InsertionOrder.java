package map.linkedhashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class InsertionOrder {

  public static void main(String[] args) {
    HashMap hashMap = new HashMap();
    hashMap.put(101, "Medicine Department");
    hashMap.put(105, "Gynae Department");
    hashMap.put(103, "Dental Department");
    System.out.println(hashMap); // Insertion order is not preserved.
    //Output: {101=Medicine Department, 103=Dental Department, 105=Gynae Department}

    // Now using the LinkedHashMap class where insertion order is preserved.
    LinkedHashMap lhm = new LinkedHashMap();
    lhm.put(101, "Medicine Department");
    lhm.put(103, "Dental Department");
    lhm.put(105, "Gynae Department");
    System.out.println(lhm); // Insertion order is preserved

  }

}
