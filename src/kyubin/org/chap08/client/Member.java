package kyubin.org.chap08.client;

public class Member {
	private Integer id;
	private String name;
	private String grade;
	
	public Member(Integer id, String name, String grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
	
	

}
