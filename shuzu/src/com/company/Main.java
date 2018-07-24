package com.company;

public class Main {

    public static void main(String[] args) {
	Array myArray=new Array(10);
	myArray.addAtLast(1);
	myArray.addAtLast(2);
	myArray.addAtLast(3);
	myArray.addAtLast(4);
	System.out.println(myArray.toString());
	myArray.addAtLast(5);
	System.out.println(myArray.toString());
	System.out.println(myArray.findElement(3));
	myArray.deleteByElement(5);
	myArray.deleteByIndex(3);
	myArray.addAtMiddle(1,1);
		System.out.println(myArray.toString());
    }
}
