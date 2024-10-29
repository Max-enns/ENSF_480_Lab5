/*
*File Name: OneRow_Observer.java
*Lab Assignment 5
*Lab Section B01
*Completed By: Max Enns
*Developmenet Date: Oct 28th, 2024
*/


import java.util.ArrayList;

public class OneRow_Observer implements Observer {
    private DoubleArrayListSubject data;

    OneRow_Observer(DoubleArrayListSubject mydata){
        data=mydata;
        data.observers.add(this);
        update(data.data);
    }
    @Override
    public void update(ArrayList<Double> list) {
        System.out.println("");
        System.out.println("Notification to One-Row Table Observer: Data Changed:");
        display();
    }
    public void display(){
        for(int i=0;i<data.data.size();i++){
            System.out.print(data.data.get(i));
            System.out.print(" "); 
        }
    }
    
}
