package hw_third.first_ex;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(3);
        set1.add(5);
        set1.add(9);
        set1.add(17);
        set1.add(23);
        set1.add(41);

        Set<Integer> set2 = new HashSet<>();
        set2.add(2);
        set2.add(5);
        set2.add(17);
        set2.add(41);
        set2.add(51);

        SetMethods setMethods = new SetMethods();

        Set<Integer> unionSet = setMethods.union(set1, set2);
        System.out.println("Union of set1 and set2: " + unionSet);


        Set<Integer> intersectionResult = setMethods.intersect(set1, set2);
        System.out.println("Intersection of set1 and set2: " + intersectionResult);
    }
}
