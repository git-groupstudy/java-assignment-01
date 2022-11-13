package soobin.answer.chap07.exam01;

public class Eagle extends Animal implements Flyable{

	public Eagle(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void fly() {
		System.out.println("독수리가 날아간다.");
	}
}
