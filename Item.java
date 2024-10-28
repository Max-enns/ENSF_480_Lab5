/*
*File Name: Item.java
*Lab Assignment 5
*Lab Section B01
*Completed By: Max Enns
*Developmenet Date: Oct 27th, 2024
*/
class Item <E extends Number & Comparable<E> >{
	private E item;
	public Item(E value) {
		item = value;
	}
	
	public void setItem(E value){
		item = value;
	}
	
	public E getItem(){
		return item;
	}
}
