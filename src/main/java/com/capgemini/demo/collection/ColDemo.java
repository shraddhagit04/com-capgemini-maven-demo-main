package com.capgemini.demo.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.Vector;

// Collection Framework in Java - 

// interfaces - 
//List 		
//Set
//Map
//Queue

// classes - 
//List 		
//		ArrayList
//		LinkedList
//		Stack
//		Vector

//Set
//Map
//Queue

public class ColDemo {

	public static void main(String[] args) {

//		int[] arr = {10, 20, 30.5, "abc", false};

		ArrayList myList = new ArrayList();    //mylist is collection object

		System.out.println(myList.size());
		System.out.println(myList);
		myList.add(10);
		myList.add(10.5);
		myList.add("abc");
		myList.add(false);
		System.out.println(myList.size());
		System.out.println(myList);
		myList.remove(2);
		System.out.println(myList.size());
		System.out.println(myList);

	}
}
		
