package edu.gandhi.prajit.jdk8;

import java.util.function.Predicate;

public class PredicateIsEqual {
	public static void main(String[] args) {
		//Requires equals/hashCode Contract Overrides
		System.out.println(Predicate.<String>isEqual("Prajit Gandhi").test("Prajit Gandhi"));
		System.out.println(Predicate.<String>isEqual("Prajit Gandhi").test("Gandhi"));
	}

}
