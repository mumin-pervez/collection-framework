package map.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EntrySetIterator {

  public static void main(String[] args) {
    HashMap hashMap = new HashMap();
    hashMap.put(1, "Alim Al Razin");
    hashMap.put(2, "Mumin Pervez");
    hashMap.put(5, "Shams Sun");
    hashMap.put(7, "Arnab Jit");
    hashMap.put(3, "Rathin Biswas");

    Set entrySet = hashMap.entrySet();
    System.out.println("Entry Set: " + entrySet);
    Iterator itr = entrySet.iterator();
    while (itr.hasNext()) {
      Map.Entry mapEntry = (Map.Entry) itr.next();
      System.out.println(mapEntry.getKey() + " " + mapEntry.getValue());
    }

  }

}
