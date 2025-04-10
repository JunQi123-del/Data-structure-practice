package com.java.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListPractice {
	
	public static String world = "Hello";
	
	public static List<Integer> AllNumbers = new ArrayList<Integer>();
	
	//This program takes in a list of integer and filter them out to only print out even numbers
	public static void main(String [] args) {
		//predicate is a reusable filter function
		// java knows what is n based on the type of the predicate e.g. 
		//Predicate<Integer> so the lambda expression takes a Integer and returns a boolean
		Predicate<Integer> isEven = n->n%2 ==0;
		
		AllNumbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		//collect means to transform the stream into a different for like a list,set,map or string. 
		//.stream() is a method that converts a collection into a Stream, which lets you process data with a fluent, 
		//functional-style API (like filter, map, collect, etc).
		
		List<Integer> evenList = AllNumbers.stream().filter(isEven).collect(Collectors.toList());
		
		System.out.println(evenList);
	}
}
