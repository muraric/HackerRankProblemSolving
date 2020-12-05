package org.murari.hackerrank.filledorders;

import java.util.Collections;
import java.util.List;

public class FiledOrders {
    public static int filledOrders(List<Integer> order, int k) {
        // Write your code here
        int orderCount = 0;
        int availablityCount = k;
        Collections.sort(order);
        for (int i = 0; i <= order.size() - 1; i++) {
            if (order.get(i) <= availablityCount) {
                orderCount = orderCount + 1;
                availablityCount = availablityCount - order.get(i);
            }
        }
        System.out.println("orderCount : " + orderCount);
        return orderCount;
    }

}
