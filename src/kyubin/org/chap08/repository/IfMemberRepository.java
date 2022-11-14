package kyubin.org.chap08.repository;

import kyubin.org.chap08.client.Member;

public interface IfMemberRepository {
	//1. 회원을 인수로 받아서 저장
	void save(Member member);
	
	//2. 회원 아이디를 인수로 받아서 해당 회원을 리턴
	Member findById (Integer memberId);
}
