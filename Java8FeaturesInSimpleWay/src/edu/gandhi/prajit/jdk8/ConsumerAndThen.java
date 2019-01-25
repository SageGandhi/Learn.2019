package edu.gandhi.prajit.jdk8;

import java.util.function.Consumer;

public class ConsumerAndThen {
	public static void main(String[] args) {
		final Consumer<String> first = str->{
			System.out.println("In First Consumer:"+str.toUpperCase());			
		};
		final Consumer<String> second = str->{
			System.out.println("In Second Consumer:"+str.toUpperCase());
		};
		//Executes First Consumer Then Second Consumer
		first.andThen(second).accept("01-First");
	}
}
