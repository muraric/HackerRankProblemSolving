package org.murari.hackerrank;

import org.murari.hackerrank.countingvalley.CountingValley;
import org.murari.hackerrank.filledorders.FiledOrders;
import org.murari.hackerrank.jumpingonclouds.JumpingOnClouds;
import org.murari.hackerrank.keyboardanddrive.KeyboardandDrive;
import org.murari.hackerrank.pairofsocks.PairOfSocks;
import org.murari.hackerrank.repeatedstring.RepeatedString;

import java.util.LinkedList;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        //Pair of Socks
        int i = 100;
        int ar[] = new int[]{42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42, 42};
        PairOfSocks.sockMerchant(i, ar);

        //Count The valleys
        CountingValley.countingValleys(16, "UDDDUDUUUDDDUDUU");
        //Jumping Clouds
        int cloud[] = new int[]{0, 0, 1, 0, 0, 1, 0};
        JumpingOnClouds.jumpingOnClouds(cloud);

        //Repeated String Count
        RepeatedString.repeatedString("abaaabaab", 4);

        //Filled Orders
        int orderList[] = new int[]{10, 30};
        List<Integer> intlist = new LinkedList<>();
        for (int j = 0; j <= orderList.length - 1; j++) {
            intlist.add(j, orderList[j]);
        }
        FiledOrders.filledOrders(intlist, 40);
        //Keyboard and Drive
        int keyboard[]=new int[]{40,50,60};
        int drive[]=new int[]{5,8,12};
        KeyboardandDrive.getMoneySpent(keyboard,drive,60);
    }
}
