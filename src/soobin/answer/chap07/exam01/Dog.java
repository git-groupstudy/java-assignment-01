package soobin.answer.chap07.exam01;

public class Dog extends Animal{

	public Dog(String name, int age) {
		super(name, age);
	}
	
	public void run() {
		System.out.println(this.name + "(이)가 달린다.");
	}
}
