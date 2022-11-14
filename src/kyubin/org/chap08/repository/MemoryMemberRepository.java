package kyubin.org.chap08.repository;

import java.util.HashMap;
import java.util.Map;

import kyubin.org.chap08.client.Member;

public class MemoryMemberRepository implements IfMemberRepository{

	private static Map<Integer, Member> store = new HashMap<Integer, Member>();
	
	@Override
	public void save(Member member) {
		store.put(member.getId(), member);
	}

	@Override
	public Member findById(Integer memberId) {
		Member findMember = store.get(memberId);
		return findMember;
	}

}
