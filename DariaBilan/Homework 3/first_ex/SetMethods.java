package hw_third.first_ex;

import java.util.HashSet;
import java.util.Set;

public class SetMethods {
    public Set union(Set set1, Set set2){
        Set<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;
    }

    public Set intersect(Set set1, Set set2){
        Set<Integer> intersectSet = new HashSet<>(set1);
        intersectSet.retainAll(set2);
        return intersectSet;
    }

}
