package map.identityhashmap;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {

  public static void main(String[] args) {
    HashMap hashMap = new HashMap();
    Integer integer1 = new Integer(15);
    Integer integer2 = new Integer(15);

    System.out.println("Normal HashMap Example");
    hashMap.put(integer1, "Mumin");
    hashMap.put(integer2, "Anik");
    System.out.println(hashMap);

    System.out.println("IdentityHashMap Example");
    IdentityHashMap identityHashMap = new IdentityHashMap();
    identityHashMap.put(integer1, "Pervez");
    identityHashMap.put(integer2, "Sardar");
    System.out.println(identityHashMap);
  }

}
