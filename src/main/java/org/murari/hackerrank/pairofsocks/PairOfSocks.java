package org.murari.hackerrank.pairofsocks;

public class PairOfSocks {


    public static int sockMerchant(int n, int[] ar) {
        int count[] = new int[100];
        int duplist[] = new int[100];
        int sockscount = 0;
        int k = 0;
        int l_save = 0;
        boolean colorfound = false;
        int finalcount = 0;

        //Code to find the Unique Socks colours
        for (int i = 0; i <= ar.length - 1; i++) {
            colorfound = false;
            if (i == 0) {
                duplist[0] = ar[i];
                colorfound = true;
            } else {
                for (int l = 0; l <= duplist.length - 1; l++) {
                    if (duplist[l] == ar[i]) {
                        colorfound = true;
                        l = duplist.length - 1;
                    }
                }
            }
            if (colorfound) {
                continue;
            } else {
                for (int l = 0; l <= duplist.length - 1; l++) {
                    if (duplist[l] == 0) {
                        duplist[l] = ar[i];
                        l = duplist.length - 1;
                    }
                }
            }
        }
        //Code to find the Socks Count
        for ( k = 0; k <= duplist.length - 1; k++) {
            sockscount = 0;
            if (duplist[k] == 0) {
                break;
            } else {
                for (int j = 0; j <= ar.length - 1; j++) {
                    if (duplist[k] == ar[j]) {
                        sockscount = sockscount + 1;
                    }
                }
                count[k] = sockscount;
            }
        }

        // Code to Print the Unique Colors
        System.out.print("Unique Colors             : ");
        for (int i = 0; i <= duplist.length - 1; i++) {
            System.out.print(duplist[i]);
            System.out.print(" ");
        }
        // Code to Print the Unique Color Socks Count
        System.out.println("");
        System.out.print("Unique Colors Socks Count : ");
        for (int i = 0; i <= count.length - 1; i++) {
            System.out.print(count[i]);
            System.out.print(" ");
        }
        for (int i = 0; i <= count.length - 1; i++) {
            if (count[i] / 2 >= 1) {
                finalcount = finalcount + count[i] / 2;
            }
        }
        System.out.println(" ");
        System.out.print("Total Number of Pairs     : ");
        System.out.print(finalcount);
        return 1;
    }

}