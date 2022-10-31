package kyubin.assign.chap05.exam02;

public class Exam02 {
	public static void main(String[] args) {
		// 1. String 타입의 id, password, name 변수를 가진 Member 클래스를 만듭니다.

		// 2. Member 클래스를 사용하여 member1 객체를 만들고 id, password, name을 정의해줍니다.
		Member Member1 = new Member();
		Member1.ID = "rlarbqls";
		Member1.PW = "qwer1234";
		Member1.name = "kyubhin";

		// 3. Member 클래스에 String 타입의 inputId, inputPassword 2개의 파라미터를 받고
		// id, password 변수와 비교한 뒤 아이디, 비밀번호가 일치하면 "로그인 성공!!", 일치하지않으면 "로그인 실패!!" 를 출력하는
		// login 메서드를 만들어봅시다.

		// 4. 로그인 성공했을 경우, 로그인 실패했을 경우를 가정하여 각각 메서드를 실행해봅시다.

		Member1.login("rbqls", "1234qwer");
		Member1.login("rlarbqls", "qwe123");
		Member1.login("rlarbqls", "qwer1234");
	}

}
