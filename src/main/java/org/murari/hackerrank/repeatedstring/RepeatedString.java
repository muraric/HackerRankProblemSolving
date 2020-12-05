package org.murari.hackerrank.repeatedstring;

public class RepeatedString {
    public static long repeatedString(String s, long n) {
        long repeatcount = 0;
        long leftcount = 0;
        StringBuffer sbuff = new StringBuffer(s);

        for (int k = 0; k <= sbuff.length() - 1; k++) {
            if (sbuff.charAt(k) == 'a') {
                repeatcount = repeatcount + 1;
            }

            if ((k <= ((n % sbuff.length()) - 1)) && sbuff.charAt(k) == 'a') {
                leftcount = leftcount + 1;
            }
        }
        repeatcount = (repeatcount * (n / sbuff.length())) + leftcount;
        System.out.println("Repeated Character Count : " + repeatcount);
        return repeatcount;
    }
}
