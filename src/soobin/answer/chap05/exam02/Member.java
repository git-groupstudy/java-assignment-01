package soobin.answer.chap05.exam02;

public class Member {

	public String id;
	public String password;
	public String name;
	
	public void login(String inputId, String inputPassword) {
		
		if(inputId.equals(this.id)) {
			if(inputPassword.equals(this.password)) {
				System.out.println("로그인 성공!!");
			} else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
		} else {
			System.out.println("아이디가 일치하지 않습니다.");
		}
		
	}
}
