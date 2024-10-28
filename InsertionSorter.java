
/*
*File Name: BubbleSorter.java
*Lab Assignment 5
*Lab Section B01
*Completed By: Max Enns
*Developmenet Date: Oct 28th, 2024
*/

import java.util.ArrayList;

public class InsertionSorter<E extends Number & Comparable<E>> implements Sorter<E> {
    @Override
    public void sort(ArrayList<Item<E>> items) {
        int n = items.size();
        for (int i = 1; i < n; ++i) {
            Item<E> key = items.get(i);
            int j = i - 1;

            while (j >= 0 && items.get(j).getItem().compareTo(key.getItem()) > 0) {
                items.set(j + 1, items.get(j));
                j = j - 1;
            }
            items.set(j + 1, key);
        }
    }
}


