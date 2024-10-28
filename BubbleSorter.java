
/*
*File Name: BubbleSorter.java
*Lab Assignment 5
*Lab Section B01
*Completed By: Max Enns
*Developmenet Date: Oct 28th, 2024
*/


import java.util.ArrayList;

public class BubbleSorter<E extends Number & Comparable<E>> implements Sorter<E> {

    @Override
    public void sort(ArrayList<Item<E>> items) {
        int n = items.size();
        
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) { // Compare adjacent elements
                if (items.get(j).getItem().compareTo(items.get(j + 1).getItem()) > 0) {
                   
                    Item<E> temp = items.get(j);
                    items.set(j, items.get(j + 1));
                    items.set(j + 1, temp);
                }
            }
        }
    }
}
