package soobin.answer.chap05.exam01;

public class App {

	public static void main(String[] args) {
		//1. 개(Dog), 고양이(Cat), 독수리(Eagle) 클래스를  chap05.exam01 패키지안에 만들어봅니다.
		
		
		//2. 각 클래스에 이름을 뜻하는 String 타입의 name 멤버 변수와 나이를 뜻하는 int타입의 age 멤버변수를 만듭니다.
		
		
		//3. App 클래스의 main 메서드에서 각 클래스 별로 인스턴스를 생성해봅시다.
		Dog dog = new Dog();
		Cat cat = new Cat();
		Eagle eagle = new Eagle();
		
		//4. 각 인스턴스의 이름을 정의하고 출력까지 해봅니다.
		dog.name = "백구";
		cat.name = "야옹이";
		eagle.name = "수리";
		
		System.out.println("dog.name : " + dog.name);
		System.out.println("cat.name : " + cat.name);
		System.out.println("eagle.name : " + eagle.name);
		
		//5. String타입 인수를 받아서 객체의 name 변수를 정의해주는 setName 메서드를 만들어 봅시다.
		
		
		//6. 각 인스턴스를 한번 더 생성하고 setName 메서드를 통해 겹치지 않는 새로운 이름을 정의하고 출력해봅시다.
		Dog dog2 = new Dog();
		Cat cat2 = new Cat();
		Eagle eagle2 = new Eagle();
		
		dog2.setName("백구2");
		cat2.setName("야옹이2");
		eagle2.setName("수리2");
		
		System.out.println("dog2.name : " + dog2.name);
		System.out.println("cat2.name : " + cat2.name);
		System.out.println("eagle2.name : " + eagle2.name);
		
		//7. Dog, Cat, Eagle 클래스에 "(인스턴스의 이름)" (이)가  밥을 먹는다." 문장을 출력해주는 eat 메서드를 만들어봅시다.
		
		
		//8. App 클래스의 main 메서드에서 각 인스턴스별로 eat 메서드를 사용해봅시다. (같은 클래스로 만든 인스턴스끼리도 출력 값이 같은지 다른지 확인해봅시다.) 
		dog.eat();
		dog2.eat();
		cat.eat();
		cat2.eat();
		eagle.eat();
		eagle2.eat();
		
	}

}
