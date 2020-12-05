package org.murari.hackerrank.stringanagram;

import java.util.*;

public class StringAnagram {
    public static List<Integer> stringAnagram(List<String> dictionary, List<String> query) {
        // Write your code here
        List<String> sorteddictionary = new LinkedList<>();
        List<String> sortedquery = new LinkedList<>();
        List<Integer> count = new LinkedList<>();
        int mycount = 0;
        Map<String, Integer> dictinonarymap = new HashMap<>();


        for (int i = 0; i <= dictionary.size() - 1; i++) {
            sorteddictionary.add(i, sortString(dictionary.get(i)));
        }
        for (int j = 0; j <= query.size() - 1; j++) {
            sortedquery.add(j, sortString(query.get(j)));
        }


        for (int k = 0; k <= query.size() - 1; k++) {
            mycount = 0;
            for (int l = 0; l <= dictionary.size() - 1; l++) {

                if (sortedquery.get(k).equals(sorteddictionary.get(l))) {
                    mycount = mycount + 1;
                    count.add(k, mycount);
                }
            }
        }
        return count;
    }

    public static String sortString(String inputString) {
        // convert input string to char array
        char tempArray[] = inputString.toCharArray();

        // sort tempArray
        Arrays.sort(tempArray);

        // return new sorted string
        return new String(tempArray);
    }
}
