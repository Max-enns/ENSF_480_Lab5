package exA;
/*
*File Name: BubbleSorter.java
*Lab Assignment 5
*Lab Section B01
*Completed By: Max Enns
*Developmenet Date: Oct 28th, 2024
*/

import java.util.ArrayList;

public interface Sorter<E extends Number & Comparable<E>> {
    void sort(ArrayList<Item<E>> items);
}
