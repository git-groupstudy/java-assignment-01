package kyubin.org.chap08.sernice;

import kyubin.org.chap08.client.Member;
import kyubin.org.chap08.repository.IfMemberRepository;
import kyubin.org.chap08.repository.MemoryMemberRepository;

public class MemberService implements IfMemberService {
	
	IfMemberRepository memberRepository = new MemoryMemberRepository();

	@Override
	public void join(Member member) {
		memberRepository.save(member);
	}

	@Override
	public Member findMember(Integer memberId) {
		Member findMember = memberRepository.findById(memberId);
		
		return findMember;
	}
	
	
}
