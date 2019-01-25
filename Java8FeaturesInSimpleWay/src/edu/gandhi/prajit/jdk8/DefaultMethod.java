package edu.gandhi.prajit.jdk8;

public class DefaultMethod {
	public static void main(String[] args) {
		new DefaultNotOverriden().welcome("Prajit Gandhi");
		new DefaultOverriden().welcome("Prajit Gandhi");
	}
}
interface Defaultable{
	default void welcome(String message) {
		System.out.println("\nMessage Received[Defaultable]:"+message);
	}
}
class DefaultNotOverriden implements Defaultable{
	
}
class DefaultOverriden implements Defaultable{
	@Override
	public void welcome(String message) {
		System.out.println("\nMessage Received:In DefaultOverriden");
		Defaultable.super.welcome(message);
		System.out.println("\nMessage Received:In DefaultOverriden");
	}
}