package soobin.answer.chap06.exam01;

public class App {

	public static void main(String[] args) {
		//1. Person 클래스에 생성자를 추가하여 아래의 코드가 동작하게 해봅시다.
		
		Person person = new Person(25);
		System.out.println("나이 : " + person.age);
		
		//2. Dog 클래스에 생성자를 추가하여 아래의 코드가 동작하게 해봅시다.
		Dog dog = new Dog("멍멍이", 3);
		System.out.println(dog.getName() + "는 " + dog.getAge() + "살 입니다.");
		
	}

}
