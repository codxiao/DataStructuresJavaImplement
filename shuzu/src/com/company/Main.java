package com.company;

public class Main {

    public static void main(String[] args) {
    	/*测试整型
    	Array<Integer> myArray = new Array<>(10);
//	Array<Integer> myArray=new Array(10);
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
	*/

	Array<Student> studentArray=new Array<>(10);
	studentArray.addAtFirst(new Student(1,98));
	studentArray.addAtFirst(new Student(2,99));
	studentArray.addAtFirst(new Student(3,100));
		//System.out.println(studentArray.getSize());
		System.out.println(studentArray.toString());

    }
}
