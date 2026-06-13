package map.hashmap;

import java.util.HashMap;

public class ShowEntrySet {

  public static void main(String[] args) {
    HashMap hashMap = new HashMap();
    hashMap.put(57, "Milon Hossain");
    hashMap.put(68, "Sharif Khan");
    hashMap.put(13, "Samsuddin Biswas");
    System.out.println("All entry set: " + hashMap.entrySet());
    //[68=Sharif Khan, 57=Milon Hossain, 13=Samsuddin Biswas]
  }

}
