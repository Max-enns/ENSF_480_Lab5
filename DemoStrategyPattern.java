package exB;
/*
*File Name: DemoStrategyPattern.java
*Lab Assignment 5
*Lab Section B01
*Completed By: Max Enns
*Developmenet Date: Oct 27th, 2024
*/

import java.util.Random;
public class DemoStrategyPattern {
	public static void main(String[] args) {
		// Create an object of MyVector<Double> with capacity of 50 elements
		MyVector<Double> v1 = new MyVector<Double> (50);
		
		// Create a Random object to generate values between 0
		Random rand = new Random();  
       
		// adding 5 randomly generated numbers into MyVector object v1
	   for(int i = 4; i >=0; i--) {
		   Item<Double> item;
		   item = new Item<Double> (Double.valueOf(rand.nextDouble()*100));
		  v1.add(item);
	   }
	   
	    // displaying original data in MyVector v1
       System.out.println("The original values in v1 object are:");
		v1.display();
		
		// choose algorithm bubble sort as a strategy to sort object v1
		v1.setSortStrategy(new BubbleSorter<Double>());
		
		// perform algorithm bubble sort to v1 
		v1.performSort();
		
        System.out.println("\nThe values in MyVector object v1 after performing BoubleSorter is:");
		v1.display();
		
		// create a MyVector<Integer> object V2 
		MyVector<Integer> v2 = new MyVector<Integer> (50);
		
		// populate v2 with 5 randomly generated numbers
		for(int i = 4; i >=0; i--) {
			Item<Integer> item;
			item = new Item<Integer> (Integer.valueOf(rand.nextInt(50)));
			v2.add(item);
			}
		   
	        System.out.println("\nThe original values in v2 object are:");
			v2.display();
			v2.setSortStrategy(new InsertionSorter<Integer>());;
			v2.performSort();
	        System.out.println("\nThe values in MyVector object v2 after performing InsertionSorter is:");
			v2.display();	

			 // -------- Adding Section to Test SelectionSorter --------

        MyVector<Float> v3 = new MyVector<Float>(50);

        for (int i = 4; i >= 0; i--) {
            Item<Float> item = new Item<>(Float.valueOf(rand.nextFloat() * 100));
            v3.add(item);
        }

        System.out.println("\nThe original values in v3 object are:");
        v3.display();

        v3.setSortStrategy(new SelectionSorter<Float>());
        v3.performSort();

        System.out.println("\nThe values in MyVector object v3 after performing SelectionSorter is:");
        v3.display();
		System.out.println("");

	}
}
