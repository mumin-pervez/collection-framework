package differences;

import java.util.Objects;

class Person {

  String name;

  Person(String name) {
    this.name = name;
  }

  // Override equals() for content comparison
  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null || getClass() != obj.getClass()) {
      return false;
    }
    Person person = (Person) obj;
    return Objects.equals(name, person.name);
  }
}

public class EqualOperatorVsMethodInObjects {

  public static void main(String[] args) {
    Person person1 = new Person("Mumin");
    Person person2 = new Person("Mumin");

    Person person3 = person2;
    System.out.println(person1 == person2);
  }

}
