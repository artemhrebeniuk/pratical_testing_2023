import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

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

        Set<Integer> unionSet = set1.stream()
            .collect(Collectors.toSet());
        unionSet.addAll(set2);
        System.out.println("Union of set1 and set2: " + unionSet);

        Set<Integer> intersectionResult = set1.stream()
            .filter(set2::contains)
            .collect(Collectors.toSet());
        System.out.println("Intersection of set1 and set2: " + intersectionResult);
    }
}
