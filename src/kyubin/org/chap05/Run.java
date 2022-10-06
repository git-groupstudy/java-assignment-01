package kyubin.org.chap05;

public class Run {
	public static void main(String[] args) {
		Calculator call = new Calculator();
		Calculator call2 = new Calculator();
		
		System.out.println("call = " + call.add(3));
		System.out.println("call = "+ call.add(4));
		
		System.out.println();
		
		System.out.println("call2 = " + call2.add(10));
		System.out.println("call2 = "+ call2.min(5));
		System.out.println("call2 = "+call2.mul(3));
		System.out.println("call2 = "+call2.div(3));
		
	}
}
