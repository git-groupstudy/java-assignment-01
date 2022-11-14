package kyubin.org.chap08.app;

import kyubin.org.chap08.client.Member;
import kyubin.org.chap08.sernice.IfMemberService;
import kyubin.org.chap08.sernice.MemberService;

public class MemberApp {
	public static void main(String[] args) {
		IfMemberService memberService = new MemberService();
		
		Member member1 = new Member(1,"김규빈","VIP");
		
		memberService.join(member1);
		
		Member newMember = memberService.findMember(1);
		
		System.out.println("member1 : " + member1.getName());
		System.out.println("newMember : " + newMember.getName());
		
	}

}
