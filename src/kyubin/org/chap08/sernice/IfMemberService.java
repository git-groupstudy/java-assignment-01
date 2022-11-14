package kyubin.org.chap08.sernice;

import kyubin.org.chap08.client.Member;

public interface IfMemberService {
	//1. 회원 가입
	void join(Member member);
	//2. 회원 정보 가져오기
	Member findMember(Integer memberId);

}
