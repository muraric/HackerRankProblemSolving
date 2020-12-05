package org.murari.hackerrank.bitwiseand;

import java.util.Collections;
import java.util.List;

public class BitwiseAnd {
    public static long countPairs(List<Integer> arr) {
        // Write your code here
        long pairCount = 0;
        Collections.sort(arr);
        for (int i = 0; i <= arr.size() - 1; i++) {
            for (int j=0;j<=arr.size()-1;j++){
                if ((arr.get(i) != arr.get(j) - 1) && (arr.get(i) != arr.get(j) + 1)) {
                    if ((arr.get(i) & arr.get(j)) == 0) {
                        pairCount = pairCount + 1;
                    }
                }
            }


        }

        return pairCount;
    }

}
