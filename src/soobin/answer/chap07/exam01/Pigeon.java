package soobin.answer.chap07.exam01;

public class Pigeon extends Animal implements Flyable{

	public Pigeon(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void fly() {
		System.out.println("비둘기가 날아간다.");
	}
}
