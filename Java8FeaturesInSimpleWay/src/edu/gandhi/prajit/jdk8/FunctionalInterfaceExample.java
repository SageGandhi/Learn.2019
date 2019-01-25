package edu.gandhi.prajit.jdk8;

public class FunctionalInterfaceExample {
	public static void main(String[] args) {
		//Type Inference
		final Addable addable=(a,b)->a+b;
		System.out.println(addable.add(10, 20));
	}
}
@FunctionalInterface
//Added Annotation If In Future Interface Got Modified(Add New Method)
//It Will Be Show Compilation Error In This Interface First Not In Entire Workspace
interface Addable{
	int add(int first,int second);
}
//List:Insertion Order Maintained+Duplicate Object Is Allowed[ArrayList/LinkedList/Vector->Stack]
//Set:Insertion Order Not Maintained+Duplicate Object Is Not Allowed[HashSet/TreeSet]
//Map:[Key|Value Pairs]:[EmployeeId->Employee]:[HashMap/TreeMap]:Duplicate Key OverWrite/Insertion Order Not Maintained.
//java.util.Comparator.compare(T, T)&java.lang.Comparable.compareTo(T)
//Default Sorting Order Is Ascending[Alphabetical] For Integer[String].