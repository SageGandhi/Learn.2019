package edu.gandhi.prajit.jdk8;

public class StaticMethodInterface implements MethodStaticable {
	public static void main(String[] args) {
		// General Utility Method
		// Interface Static Method Not Available In Implemented Classes
		// Interface Static Method Not Available In Implemented Classes Override
		// Scenario Does Not Occur
		MethodStaticable.utilityMethod();
		utilityMethod();// Not Overriding,Even With Restrictive Modifier We Can Define Same Name Method
		MethodStaticable.main(args);
	}

	static void utilityMethod() {
		System.out.println("Static Method In StaticMethodInterface");
	}
}

interface MethodStaticable {
	static void utilityMethod() {
		System.out.println("Static Method In MethodStaticable");
	}
	//Declaring Main Method Inside Interface
	public static void main(String[] args) {
		System.out.println("Provided Args:"+args);
	}
}
