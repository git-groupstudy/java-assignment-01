package soobin.answer.chap07.exam01;

public class Fly implements Flyable{
	public String name;
	
	public Fly(String name) {
		super();
		this.name = name;
	}

	@Override
	public void fly() {
		System.out.println("파리가 날아간다.");
	}

}
