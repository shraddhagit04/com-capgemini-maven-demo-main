package com.capgemini.demo;

import java.util.ArrayList;
import java.util.List;

public class GenericDemo {
	
	public static void main(String[] args) {
		
//		List marks = new ArrayList();
		List<Integer> marks = new ArrayList<>();
		
		marks.add(99);
		marks.add(95);
//		marks.add(99.99);
//		marks.add("ABC");
//		marks.add(false);
		
		System.out.println(marks);
	}

}
