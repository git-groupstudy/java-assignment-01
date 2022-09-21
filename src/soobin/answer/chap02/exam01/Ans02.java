package soobin.answer.chap02.exam01;

public class Ans02 {

	public static void main(String[] args) {
		
		
		//1. 아래 구문의 실행 결과로 3이 출력되도록 해보세요.
		//코드 작성 부분
		int num1 = 3;
		
		//주석해제하여 실행
		System.out.println(num1);
		
		
		
		//2. 홍길동 씨의 과목별 점수는 다음과 같다. 홍길동 씨의 평균 점수를 구해 보자.
		
		//----------
		// 과목 | 점수
		// 국어 | 80
		// 영어 | 75
		// 수학 | 55
		//----------
		
		int korean = 80;
		int english = 75;
		int math = 55;
		
		int avg = (korean + english + math) / 3;
		
		System.out.println(avg);
		
			
		
		//3. 10이 짝수인지 홀수 인지 판별할수 있는 방법을 생각해보고 어떤 값인지 출력해보자.
		//   완료했다면 다른 자연수를 넣어도 알맞게 나오는지 확인해보자.
		
		int num2 = 10;
		
		System.out.println((num2) % 2); //짝수이면 나머지가 0
		
		
		
		// 4. 아래는 변수 x, y 의 값을 서로 바꾸는 예제입니다.
		//    결과와 같이 출력되도록 (1)에 알맞은 코드를 넣어봅시다.

		int x = 1;
		int y = 2;
		
		int tmp = x;
		
		//(1)
		x = y;
		y = tmp;
		
		System.out.println("x=" + x); // x=2
		System.out.println("y=" + y); // y=1		
		
		
		
		// 5. 증감연산자를 활용하여 아래 numPlus값이 0~9가 출력되게 해보자. 
		
		int numPlus = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.print(numPlus++);
		}
		
		
		System.out.println(""); //<= 줄바꿈이니까 무시
		
		// 6. 증감연산자를 활용하여 아래 numMinus값이 9~0이 출력되게 해보자. 
		
		int numMinus = 10;
		
		for(int i = 0; i < 10; i++) {
			System.out.print(--numMinus);
		}
		
		
		System.out.println(""); //<= 줄바꿈이니까 무시
		
		// 7. 다음 선언된 변수의 값을 초기화하여 아래 문자열이 콘솔에 출력해도록 해보자.
		
		String printStr = "화면에 출력!!";
		
		
		//출력예제
		boolean printBool = true;
		
		if(printBool) {
			System.out.println(printStr);
		}
		
		
		
		// 8. 홍길동 씨의 주민등록번호는 881120-1068234이다. 
		//   홍길동 씨의 주민등록번호를 연월일(YYYYMMDD) 부분과 그 뒤의 숫자 부분으로 나누어 출력해 보자.
		//   힌트 : 문자열 substring 사용
		
		String pin1 = "881120-1068234";
		
		System.out.println(pin1.substring(0, 6));
		System.out.println(pin1.substring(7));
		
		
				
		// 9. 주민등록번호 뒷자리의 맨 첫 번째 숫자는 성별을 나타낸다. 주민등록번호에서 성별을 나타내는 숫자를 출력해 보자.
		//   힌트 : 문자열 charAt을 사용해보자.
		
		String pin2 = "881120-1068234";
		
		System.out.println(pin2.charAt(7));
		
		
		
		// 10. 다음과 같은 문자열 a:b:c:d가 있다. 문자열의 replace 함수를 사용하여 a#b#c#d로 바꿔서 출력해 보자.
		
		String abcd = "a:b:c:d";
		
		System.out.println(abcd.replace(":", "#"));
		
		
		
	}

}
