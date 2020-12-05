package org.murari.hackerrank.jumpingonclouds;

public class JumpingOnClouds {
    public static int jumpingOnClouds(int[] c) {
        int jumpCount = 0;
        for (int i = 0; i <= c.length - 1; i++) {
            if (i == c.length - 1) {
                continue;
            } else {
                if (c[i] == 0) {
                    if (i <= c.length - 2) {
                        if (c[i + 2] == 0) {
                            jumpCount = jumpCount + 1;
                            i = i + 1;
                        } else {
                            if (c[i + 1] == 0) {
                                jumpCount = jumpCount + 1;
                                i = i + 0;
                            }
                        }
                    } else {
                        if (c[i + 1] == 0) {
                            jumpCount = jumpCount + 1;
                            i = i + 0;
                        }
                    }

                }
            }
        }
        System.out.println("Cloud Jump Count : " + jumpCount);
        return jumpCount;

    }
}
