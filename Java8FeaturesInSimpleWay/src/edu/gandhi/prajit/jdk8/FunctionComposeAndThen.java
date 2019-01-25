package edu.gandhi.prajit.jdk8;

import java.util.function.Function;

public class FunctionComposeAndThen {
	public static void main(String[] args) {
		final Function<String,String> first = str->{
			System.out.println("In First Function:"+str.toUpperCase());
			return "In First Function:"+str.toUpperCase();
		};
		final Function<String,String> second = str->{
			System.out.println("In Second Function:"+str.toUpperCase());
			return "In Second Function:"+str.toLowerCase();
		};
		//Executes First Function Then Second Function
		first.andThen(second).apply("01-First");
		System.out.println("*********************");
		//Executes Second Function And Then First Function 
		first.compose(second).apply("02-Second");
		
		System.out.println(Function.identity().apply("It Will Return Whatever We Pass Here"));
	}
}
