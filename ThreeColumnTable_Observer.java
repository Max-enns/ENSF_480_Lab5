/*
*File Name: ThreeColumnTable_Observer.java
*Lab Assignment 5
*Lab Section B01
*Completed By: Max Enns
*Developmenet Date: Oct 28th, 2024
*/


import java.util.ArrayList;


public class ThreeColumnTable_Observer implements Observer {
    private DoubleArrayListSubject data;
     ThreeColumnTable_Observer(DoubleArrayListSubject mydata){
        data=mydata;
        data.observers.add(this);
        update(data.data);
     }
    @Override
    public void update(ArrayList<Double> list) {
        
        System.out.println("");
        System.out.println("Notification to Three-Column Table Observer: Data Changed:");
        display();
        
    }
    public void display(){
        //System.out.println(data.data);
       
        for(int i=0;i<data.data.size();i=i+3){
           
            System.out.print(data.data.get(i));
            System.out.print(" ");
            if(i+1<data.data.size()){System.out.print(data.data.get(i+1));}
            System.out.print(" ");
            if(i+2<data.data.size()){System.out.print(data.data.get(i+2));}
            System.out.println();
        }
    }
    
    
}
