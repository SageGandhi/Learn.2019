package edu.gandhi.prajit.jdk8;

public class AnnonymousInnerVsLambda {
	private int instanceVariable = 42;
	public static void main(String[] args) {
		new AnnonymousInnerVsLambda().executeAnnonymous();
		new AnnonymousInnerVsLambda().executeLambda();
	}
	public void executeLambda() {
		TryFuncInterface tryFuncInterface = ()->{
			int instanceVariable = 43;
			System.out.println("In AnnonymousInnerVsLambda:"+this.instanceVariable);
			System.out.println("In Local Variable Lambda:"+instanceVariable);
		};
		tryFuncInterface.peform();
	}
	public void executeAnnonymous() {
		new TryFuncInterface() {
			private int instanceVariable = 43;
			@Override
			public void peform() {
				System.out.println("In TryFuncInterface Annonymous Class:"+this.instanceVariable);
				System.out.println("In AnnonymousInnerVsLambda:"+AnnonymousInnerVsLambda.this.instanceVariable);
			}
		}.peform();
	}
}
@FunctionalInterface
interface TryFuncInterface{
	void peform();
}
