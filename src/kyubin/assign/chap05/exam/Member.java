package kyubin.assign.chap05.exam;

public class Member{
	public String ID;
	public String PW;
	public String name;
	
	public void login(String inputID, String inputPW) {
		if (inputID.equals(this.ID)) {
			if(inputPW.equals(this.PW)) {
				System.out.println("로그인 성공");
			}
			else
				System.out.println("비밀번호가 틀렸습니다.");
		}
		System.out.println("아이디가 틀렸습니다.");
	}
	
	
}
