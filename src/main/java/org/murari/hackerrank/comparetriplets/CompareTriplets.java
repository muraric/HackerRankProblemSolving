package org.murari.hackerrank.comparetriplets;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CompareTriplets {

    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int[] count = new int[2];
        count[0] = 0;
        count[1] = 0;
        List<Integer> c = new ArrayList<>();
        for (int i = 0; i <= 2; i++) {
            if (a.get(i) > b.get(i)) {
                count[0] = count[0] + 1;

            } else {
                if (a.get(i) < b.get(i)) {
                    count[1] = count[1] + 1;
                }
            }
        }
        c.add(count[0]);
        c.add(count[1]);
        return c;
    }
}
