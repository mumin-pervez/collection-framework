package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetInMathOperation {

  public static void main(String[] args) {
    Set<Integer> a = new HashSet<>();
    a.addAll(Arrays.asList(new Integer[]{1, 5, 8, 2, 9, 3, 0}));

    Set<Integer> b = new HashSet<>();
    b.addAll(Arrays.asList(new Integer[]{1, 3, 5, 7, 9}));

    Set<Integer> union = new HashSet<>(a);
    union.addAll(b);
    System.out.println("Union of Set A and Set B is " + union);

    Set<Integer> c = new HashSet<>();
    c.addAll(Arrays.asList(new Integer[]{2, 4, 6, 8}));

    Set<Integer> intersection = new HashSet<>(union);
    intersection.retainAll(union);
    System.out.println("Intersection of U and C is : " + intersection);


  }

}

//a.addAll(Arrays.asList(new Integer[]{1,3,2,4,8,9,0,5}));