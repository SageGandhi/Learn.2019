package edu.gandhi.prajit.jdk8;

public class DefaultDiamondProblem implements FirstDefaultable, SecondDefaultable {
	public static void main(String[] args) {
		new DefaultDiamondProblem().printingDefault();
	}

	@Override
	public void printingDefault() {
		System.out.println("Overriden printingDefault For Either Interface,But Can Call Either Of Them.");
		FirstDefaultable.super.printingDefault();
		SecondDefaultable.super.printingDefault();
	}
}

interface FirstDefaultable {
	default void printingDefault() {
		System.out.println(this.getClass().getName());
	}
}

interface SecondDefaultable {
	default void printingDefault() {
		System.out.println(this.getClass().getName());
	}
	// Default Method Can Not Override A Method From java.lang.Object
}