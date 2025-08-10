package list.linkedlist;

import java.util.LinkedList;

class SignInData {

  private String userName;
  private String password;

  public SignInData() {
  }

  public SignInData(String userName, String password) {
    this.userName = userName;
    this.password = password;
  }

  void displayInfo() {
    System.out.println("User : " + userName + "Password : " + password);
  }

  @Override
  public String toString() {
    return "SignInData{" +
        "userName='" + userName + '\'' +
        ", password='" + password + '\'' +
        '}';
  }
}

public class MethodsOfLinkedList {

  public static void main(String[] args) {
    SignInData obj1 = new SignInData("kundu", "Admin123");
    SignInData obj2 = new SignInData("anowar", "Admin123");
    SignInData obj3 = new SignInData("anik", "Admin123");
    SignInData obj4 = new SignInData("sadat", "Admin123");
    SignInData obj5 = new SignInData("mumin", "Admin123");

/*    obj1.displayInfo();
    obj2.displayInfo();
    obj3.displayInfo();
    */

    LinkedList<SignInData> list = new LinkedList<>();
    list.add(obj1);
    list.add(obj5);
    list.add(obj2);
    list.add(obj3);
    list.add(obj3);
    list.addFirst(obj1);
    list.addLast(obj4);

    for (SignInData obj : list) {
      System.out.println(obj);
    }

    list.removeFirst();
    System.out.println("After removing first element");
    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
  }
}
