package soobin.answer.chap05.exam01;

public class Cat {

	public String name;
	public int age;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void eat() {
		System.out.println(this.name + "(이)가 밥을 먹는다.");
	}
}
