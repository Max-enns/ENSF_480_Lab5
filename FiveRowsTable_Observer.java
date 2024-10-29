/*
*File Name: FiveRowsTable_Observer.java
*Lab Assignment 5
*Lab Section B01
*Completed By: Max Enns
*Developmenet Date: Oct 28th, 2024
*/



import java.util.ArrayList;

public class FiveRowsTable_Observer implements Observer {
    private DoubleArrayListSubject data;
    FiveRowsTable_Observer(DoubleArrayListSubject mydata){
        data=mydata;
        data.observers.add(this);
        update(data.data);
    }

    @Override
    public void update(ArrayList<Double> list) {
        System.out.println("");
        System.out.println("Notification to Five-Rows Table Observer: Data Changed:");
        display();
        
    }
    public void display(){
        float a= data.data.size();
        a=a/5;
        int numcolum=(int) Math.ceil(a);

        for(int i=0;i<5;i++){
            System.out.print(data.data.get(i));
            System.out.print(" ");
            for(int b=1;b<numcolum;b++){
                if(i+(5*b)<data.data.size()){
                    System.out.print(data.data.get(i+(5*b)));
                    System.out.print(" ");
                }
                if(b+1>=numcolum){ System.out.println();}
            
            }
            
        }

    }
      
}
    
   



