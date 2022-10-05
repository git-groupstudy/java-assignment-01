package soobin.answer.chap05.exam02;

public class App {

	public static void main(String[] args) {
		
		//회원의 비밀번호를 입력받아 로그인 성공 실패 여부를 출력해보는 아주 간단한 프로그램을 만들어 볼 것입니다.
		
		//1. String 타입의 id, password, name 변수를 가진 Member 클래스를 만듭니다.
		
		//2. Member 클래스를 사용하여 member1 객체를 만들고 id, password, name을 정의해줍니다.
		Member member1 = new Member();
		member1.id = "abc123";
		member1.password = "1234";
		member1.name = "soobin";
		
		//3. Member 클래스에 String 타입의 inputId, inputPassword 2개의 파라미터를 받고
		//   id, password 변수와 비교한 뒤 아이디, 비밀번호가 일치하면 "로그인 성공!!", 일치하지않으면 "로그인 실패!!" 를 출력하는 login 메서드를 만들어봅시다.
		
		
		//4. 로그인 성공했을 경우, 로그인 실패했을 경우를 가정하여 각각 메서드를 실행해봅시다.
		member1.login("abc123", "1234");
		member1.login("abc", "1234");
		member1.login("abc123", "123456");

	}

}
