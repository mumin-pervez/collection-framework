package map.hashmap;

import java.util.HashMap;

public class ReplaceObjectOfHashMap {

  public static void main(String[] args) {
    HashMap hashMap = new HashMap();
    hashMap.put(97, "Mumin Pervez");
    hashMap.put(37, "Sharif");
    hashMap.put(99, "Kundu");
    hashMap.put(89, "Anik");
    System.out.println(hashMap);

    System.out.println("After replacing 37");
    hashMap.put(37, "Moyeen");
    System.out.println(hashMap);
  }

}
