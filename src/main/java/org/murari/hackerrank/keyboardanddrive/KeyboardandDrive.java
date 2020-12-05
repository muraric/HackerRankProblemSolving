package org.murari.hackerrank.keyboardanddrive;

public class KeyboardandDrive {
    public static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        /*
         * Write your code here.
         */
        int money = 0;
        int tempmoney = 0;
        int tempmoney1 = 0;

        boolean dealfound = false;
        for (int i = 0; i <= keyboards.length - 1; i++) {
            for (int j = 0; j <= drives.length - 1; j++) {
                if (b >= keyboards[i] + drives[j]) {
                    tempmoney1 = keyboards[i] + drives[j];
                    if (tempmoney1 >= tempmoney) {
                        tempmoney = keyboards[i] + drives[j];
                        dealfound = true;
                    }
                }


            }
        }
        if (dealfound) {
            money = tempmoney;
        } else {
            money = -1;
        }
        System.out.println(money);
        return money;

    }
}
