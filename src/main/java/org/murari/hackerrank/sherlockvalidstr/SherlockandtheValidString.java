package org.murari.hackerrank.sherlockvalidstr;

import java.util.HashMap;
import java.util.Map;

public class SherlockandtheValidString {
    public static String SherlockandtheValidString(String s) {
        Integer count = new Integer(0);
        String YES = "YES";
        String NO = "NO";
        String result = "";
        Integer zero = new Integer(0);
        Map<String, Integer> stringcounter = new HashMap<>();
        for (int i = 0; i <= s.length() - 1; i++) {
            if (stringcounter.get(s.substring(i, i + 1)) == null) {
                stringcounter.put(s.substring(i, i + 1), 1);

            } else {
                count = stringcounter.get(s.substring(i, i + 1));
                count = Integer.sum(count.intValue(), 1);
                stringcounter.put(s.substring(i, i + 1), count);
            }
        }
        int oddcount = 0;
        Map<Integer, Integer> countcount = new HashMap<>();
        for (Map.Entry<String, Integer> entry : stringcounter.entrySet()) {
            if (countcount.get(entry.getValue()) == null) {
                countcount.put(entry.getValue(), 1);

            } else {
                count = countcount.get(entry.getValue());
                count = Integer.sum(count.intValue(), 1);
                countcount.put(entry.getValue(), count);
            }
        }
        Integer result1 = new Integer(0);
        Integer result2 = new Integer(0);
        Integer resulta = new Integer(0);
        Integer resultb = new Integer(0);

        if (countcount.size() > 2) {
            result = NO;
        } else {
            if (countcount.size() == 1) {
                result = YES;
            } else {
                for (Map.Entry<Integer, Integer> entry : countcount.entrySet()) {
                    System.out.println(entry.getKey() + " " + entry.getValue());
                    if (result1 == 0) {
                        result1 = entry.getValue();
                        resulta = entry.getKey();

                    } else {
                        result2 = entry.getValue();
                        resultb = entry.getKey();

                    }
                }
                if (resulta.intValue() - resultb.intValue() == -1) {
                    if (result2.intValue() == 1) {
                        result = YES;
                    } else {
                        if ((resulta.intValue() == 1 && result1.intValue() == 1)
                                || (resultb.intValue() == 1 && result2.intValue() == 1)) {
                            result = YES;
                        } else {
                            result = NO;
                        }
                       // result = NO;
                    }
                } else {
                    if (resulta.intValue() - resultb.intValue() == 1) {
                        if (result1.intValue() == 1) {
                            result = YES;
                        } else {
                            if ((resulta.intValue() == 1 && result1.intValue() == 1)
                                    || (resultb.intValue() == 1 && result2.intValue() == 1)) {
                                result = YES;
                            } else {
                                result = NO;
                            }

                            //result = NO;
                        }
                    } else {
                        result=NO;
                    }
                }
            }
        }
        System.out.println(result);
        return result;
    }

}
