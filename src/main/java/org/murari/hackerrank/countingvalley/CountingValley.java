package org.murari.hackerrank.countingvalley;

public class CountingValley {
    public static int countingValleys(int steps, String path) {
        // Write your code here

        int stepCount = 0;
        int valleyCount = 0;
        int valleyCount_save = 0;
        for (int i = 0; i <= steps - 1; i++) {
            if (path.charAt(i) == 'D') {
                valleyCount_save = stepCount;
                stepCount = stepCount - 1;

            } else {
                valleyCount_save = stepCount;
                stepCount = stepCount + 1;
            }
            if (stepCount == 0 && valleyCount_save < 0) {
                valleyCount = valleyCount + 1;

            }
        }
        System.out.println("");
        System.out.println("Valley Count : " + valleyCount);
        return valleyCount;
    }
}
