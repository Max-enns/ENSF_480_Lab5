
/*
*File Name: MyVector.java
*Lab Assignment 5
*Lab Section B01
*Completed By: Max Enns
*Developmenet Date: Oct27th, 2024
*/
import java.util.ArrayList;


public class MyVector<E extends Number & Comparable<E>> {
    private ArrayList<Item<E>> storageM;
    private Sorter<E> sorter;

    public MyVector(int n){
        storageM = new ArrayList<>(n);

    }

    public MyVector(MyVector<E> arr){
        int n = arr.storageM.size();
        storageM = new ArrayList<>(n);
        for(int i=0; i<n; i++){
            E item = arr.storageM.get(i).getItem();
            storageM.add(item);
        }
        sorter = arr.sorter;
    }

    public void add(Item<E> value){
        storageM.add(value);
    }

    public void setSortStrategy(Sorter <E> s){
        sorter = s;
    }

    public void performSort(){
        //we'll figure it out once i implement the sorts

    }

    public void display(){
        int n = storageM.size();
        for(int i=0; i<n; i++){
            E item = storageM.get(i).getItem();
            print(item);
        }
    }



}
