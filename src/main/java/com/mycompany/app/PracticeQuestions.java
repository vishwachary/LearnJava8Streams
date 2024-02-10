package com.mycompany.app;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class PracticeQuestions {
	
	
	
	public static void main(String[] args) {
		
		//1. Given a List of strings, write a program to concatenate all the strings using streams.
		
		List<String> fruits = Arrays.asList("java", "streams", "makes", "code", "more" ,"reusable");
		
		fruits.stream().map(s -> s.concat(s)).forEach(System.out::println);  //wrong
		
		//2 .Find the sum of all elements in a List using streams.
		
		List<Integer> integeres  = Arrays.asList(5,6,9,11,89);
		
		int sum=integeres.stream().mapToInt(Integer::intValue).sum();
		
		System.out.println(sum);
		
		//3. Given a List of strings, write a program to count the number of strings that start with a specific 
		 //character using streams.
		
		List<String> allstates = Arrays.asList("maha", "madya", "megha", "manthani", "arunca" ,"andhra" ,"assam","ayodhya");
		
		long count=allstates.stream().filter(s->s.startsWith("m")).count();
		
		System.out.println(count);
		
		// 4. Convert a List of strings to uppercase using streams.
		
		List<String> lowerstates = Arrays.asList("maha", "madya", "megha", "manthani", "arunca" ,"andhra" ,"assam","ayodhya");
		
		List<String> upperstates=lowerstates.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
		
		
		
		upperstates.forEach(System.out::println);
		
		// 5. Given a List of integers, write a program to filter out the even numbers using streams.
		
		List<Integer> findEvenNums  = Arrays.asList(4,44,92,24,8,5,6,9,11,89,101,87,54);
		
		List<Integer> findAllNums=findEvenNums.stream().filter(n-> n%2==0).collect(Collectors.toList());
		
		findAllNums.forEach(System.out::println);
		
		// 6. Write a program to find the average of a List of floating-point numbers using streams.
		
		List<Double> allfloats  = Arrays.asList(4.7,44.8,92.8,24.4,8.2,5.8,6.9,9.8,11.9,89.8,101.3,87.9,54.9);
		
		Double sumall=allfloats.stream().mapToDouble(Double::doubleValue).sum();
		
		System.out.println(sumall);
		
		OptionalDouble res=allfloats.stream().mapToDouble(Double::doubleValue).average();
		
		System.out.println(res);
		
		// 8. Write a program to remove duplicate elements from a List using streams.
		
		List<String> dups = Arrays.asList("maha", "maha", "megha", "manthani", "arunca" ,"manthani" ,"assam","megha");
		
		List<String> dist=dups.stream().distinct().collect(Collectors.toList());
		
		dist.forEach(System.out::println);
		
	}

}
