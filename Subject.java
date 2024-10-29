/*
*File Name: Subject.java
*Lab Assignment 5
*Lab Section B01
*Completed By: Max Enns
*Developmenet Date: Oct 28th, 2024
*/

interface Subject{
    public void register(Observer o);
    public void remove(Observer o);
    public void notifyObserver();
}