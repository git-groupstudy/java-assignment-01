package soobin.answer.chap07.exam01;

public class App {

	public static void main(String[] args) {
		
		Dog dog = new Dog("백구", 10);
		Cat cat = new Cat("야옹이", 5);
		Eagle eagle = new Eagle("수리", 3);
		Pigeon pigeon = new Pigeon("둘기", 22);
		Fly fly = new Fly("파리");
		
//		dog.eat();
//		cat.eat();
//		eagle.eat();
		
		dog.run();
		cat.run();
		
		eagle.fly();
		pigeon.fly();
		fly.fly();
		
		
	}

}
