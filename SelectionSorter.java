package exB;
/*
*File Name: SelectionSorter.java
*Lab Assignment 5
*Lab Section B01
*Completed By: Max Enns
*Developmenet Date: Oct 27th, 2024
*/

import java.util.ArrayList;

public class SelectionSorter<E extends Number & Comparable<E>> implements Sorter<E> {

    @Override
    public void sort(ArrayList<Item<E>> items) {
        int n = items.size();
        
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i; 
            
           
            for (int j = i + 1; j < n; j++) {
                if (items.get(j).getItem().compareTo(items.get(minIndex).getItem()) < 0) {
                    minIndex = j;
                }
            }
            
            
            if (minIndex != i) {
                Item<E> temp = items.get(i);
                items.set(i, items.get(minIndex));
                items.set(minIndex, temp);
            }
        }
    }
}
