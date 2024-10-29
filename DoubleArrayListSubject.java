/*
*File Name: DoubleArrayListSubject.java
*Lab Assignment 5
*Lab Section B01
*Completed By: Max Enns
*Developmenet Date: Oct 28th, 2024
*/


import java.util.ArrayList;

public class DoubleArrayListSubject implements Subject {
    public ArrayList<Double> data; 
    public ArrayList<Observer> observers;


    DoubleArrayListSubject(){
         data = new ArrayList<Double>();
         observers=new ArrayList<Observer>();
       
    };
    public void addData(Double newData){
            data.add(newData);
            notifyObserver();
            
    }
    public void setData(Double newData, int i){
        data.set(i,newData);
        notifyObserver();
       
        
    }
    public void populate(double [] arr){
        for(double d: arr){
            data.add(d);
        }
    }
    public void display(){
        if(data.isEmpty()){
            System.out.println("Empty List ...");
         }
        else{
            for(int i=0;i<data.size();i++){
                System.out.print(data.get(i));
                System.out.print(" ");
             }
        }
    }

public void register(Observer o){
    observers.add(o);

};
public void remove(Observer o){
    observers.remove(o);
};
public void notifyObserver(){
    
    for(int a=0;a<observers.size();a++){
        observers.get(a).update(data);
    }
};


}
