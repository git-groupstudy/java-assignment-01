package soobin.answer.chap07.exam01;

public class Animal {

	public String name;
	public int age;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void eat() {
		System.out.println(this.name + "(이)가 밥을 먹는다.");
	}
	
//	public void run() {
//		System.out.println(this.name + "(이)가 달린다.");
//	}
	
//	public void fly() {
//		System.out.println(this.name + "(이)가 날아간다.");
//	}
	
	
}
