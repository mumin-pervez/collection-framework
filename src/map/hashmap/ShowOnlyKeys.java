package map.hashmap;

import java.util.HashMap;

public class ShowOnlyKeys {

  public static void main(String[] args) {
    HashMap hashMap = new HashMap();
    hashMap.put(101, "Dr. Manirul Islam");
    hashMap.put(105, "Dr. Alim Al Razin");
    hashMap.put(203, "Dr. Anup Kumar");
    hashMap.put(208, "Dr. Monisha Chakroborti");
    hashMap.put(111, "Dr. Abir Hossain");
    System.out.println("Entry are: "+hashMap);

    System.out.println("Keys are: " + hashMap.keySet());
    System.out.println("Values are: " + hashMap.values());
  }

}
