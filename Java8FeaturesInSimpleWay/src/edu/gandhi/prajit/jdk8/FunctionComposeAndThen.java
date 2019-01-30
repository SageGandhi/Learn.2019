package edu.gandhi.prajit.jdk8;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.Year;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionComposeAndThen {
	//Primitive Type Functional Interface Improves Performance By Reducing Auto-Boxing/UnBoxing
	//Function<Integer,Integer> square = intValue->intValue*intValue;square.apply(100);
	//100->intValue[AutoBoxing]->intValue*intValue[AutoUnBoxing]->ReturnValue[AutoBoxing]
	//IntPredicate/LongPredicate/DoublePredicate
	//Default Method Came To Extend Interface Functionality Without Breaking Existing Implementation
	
	//IntFunction<ReturnType>->R apply(int value);
	//ToIntFunction<InputType>->int applyAsInt(T value);
	//IntToDoubleFunction->double applyAsDouble(int value);

	//IntConsumer/LongConsumer/DoubleConsumer
	//ObjIntConsumer<InputType>->void accept(InputType t, int value);
	//ObjLongConsumer<InputType>->void accept(InputType t, long value);
	//ObjDoubleConsumer<InputType>->void accept(InputType t, double value);
	
	//IntSupplier->int getAsInt();/LongSupplier->long getAsLong();
	//BooleanSupplier-> boolean getAsBoolean();/DoubleSupplier->double getAsDouble();
	
	//InputType===ReturnType Use UnaryOperator<T>/IntUnaryOperator-> int applyAsInt(int operand);
	//LongUnaryOperator->long applyAsLong(long operand);DoubleUnaryOperator->double applyAsDouble(double operand);
	
	//All InputType===ReturnType Use BinaryOperator<SameType>
	//DoubleBinaryOperator->double applyAsDouble(double left, double right);
	//IntBinaryOperator->int applyAsInt(int left, int right);
	//LongBinaryOperator->long applyAsLong(long left, long right);
	
	//Method Reference/Constructor Reference[::]Reusability,Existing Method Can Be Referenced 
	//For Functional Interfaces,Argument Type In Both Method Must Match
	//Constructor Reference[::]FunctionComposeAndThen::new
	//Method Reference[::]:FunctionComposeAndThen::StaticMethod/FunctionComposeAndThenInstance::NonStaticMethod
	
	//For min/max Method In Stream,Collection Must Be Sorted First.
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
		//If max(Comparator),min(Comparator) Do Reverse Sort,Does It Change Max/Min Behaviour
		final List<Integer> integerList=Arrays.asList(50,25,12,6,3,1,24,59,69,49);
		System.out.println(integerList.stream().max((i1,i2)->i1.compareTo(i2)).get());//Forward Sort
		System.out.println(integerList.stream().max((i1,i2)->i2.compareTo(i1)).get());//Reverse Sort
		//Copy To Array From Stream
		System.out.println(integerList.stream().toArray(Integer[]::new));
		System.out.println(LocalDate.now().getDayOfMonth()+":"+LocalDate.now().getMonthValue()+":"+LocalDate.now().getYear());

		Period elaspedPeriodFromBirthday = Period.between(LocalDate.of(1988,Month.FEBRUARY,22), LocalDate.now());
		System.out.println("Year:"+elaspedPeriodFromBirthday.getYears()+":Months:"+elaspedPeriodFromBirthday.getMonths()+":Days:"+elaspedPeriodFromBirthday.getDays());
		
		System.out.println("1988 IsLeap Year:"+Year.of(1988).isLeap());
		System.out.println(ZonedDateTime.now(ZoneId.of("America/Los_Angeles")));
	}
}
