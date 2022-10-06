package kyubin.org.chap05;

public class Calculator {
	int result = 0;

	int add(int num) {
		result += num;

		return result;
	}

	int min(int num1) {
		result -= num1;
		return result;
	}
	
	int mul(int num2) {
		result *= num2;
		return result;
	}
	
	int div(int num3) {
		result /= num3;
		return result;
	}
}
