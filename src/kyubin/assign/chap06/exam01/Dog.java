package kyubin.assign.chap06.exam01;

public class Dog {

	public String name;
	public int age;
	
	public Dog(String getName) {
		this.name = getName;
	}
	
	public Dog(int getAge) {
		this.age = getAge;
	}
//	
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
//	
	
	
}
