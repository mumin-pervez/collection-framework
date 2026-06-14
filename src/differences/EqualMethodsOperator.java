package differences;

class Patient {

  String name;

  Patient(String name) {
    this.name = name;
  }

  void displayName() {
    System.out.println(name);
  }
}

public class EqualMethodsOperator {

  public static void main(String[] args) {
    Patient p1 = new Patient("Kundu");
    Patient p2 = new Patient("Kundu");
    System.out.println(p1 == p2);
  }

}
