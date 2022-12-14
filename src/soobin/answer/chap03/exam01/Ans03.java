package soobin.answer.chap03.exam01;

public class Ans03 {
	public static void main(String[] args) {

		//1. for문을 사용해 1~100까지 자연수 중 짝수 만 출력하기
		//힌트) %연산자를 사용하면 홀수, 짝수 판별이 가능합니다.
		
		for (int i = 0; i < 101; i++) {
			if((i % 2) == 0) {
				System.out.println(i);
			}
		}
		
		
		
		//2. 1번 문제를 %연산자를 사용하지 않고 출력해봅시다.
		//힌트) for(초기값; 조건문; 증가값)중 어떤 값을 바꿔야 할 지 잘 생각해봅시다.
		
		for(int i = 0; i < 101; i = i + 2) {
			System.out.println(i);
		}
		
		
		//3. for문을 이용해 100->0 까지 1씩 작아지면서 출력되도록 만들어봅시다.
		//힌트) 2번 문제를 해결하셨다면 충분히 하실 수 있습니다:)
		
		for (int i = 100; i > 0; i--) {
			System.out.println(i);
		}
		
		
		
		//4. while문을 사용해 1~100까지 자연수 중 3의 배수의 합 구하기
		//힌트) %연산자 사용하여 3의 배수 찾기
		
		int sum = 0;
		
		//코드 작성
		for (int i = 0; i < 101; i++) {
			if((i % 3) == 0) {
				sum += i;
			}
		}
		
		System.out.println(sum);
		
		
		
		//5. 아래 그림과 같은 역삼각형을 출력해보자
		/*
		 
		  *******
		   ***** 
		    ***
		     *
		     
		*/
		//힌트) java-classes-01 프로젝트의 챕터03 Stars.java의 6번 피라미드응용을 참고해보면 됩니다. 어렵운걸 알지만 고민해보시면 좋을 것 같습니다.
		
		for (int i = 0; i < 4; i++) {
			
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
			
			for (int j = 7; j > (i * 2); j--) {
				System.out.print("*");
			}
			
			System.out.println("");
		}
		
		
		
		//6. 나이가 19세 이하이거나 60세 이상이면 할인해주려고 합니다. 
		//   int age 값을 새로 초기화하여 검사할 때 할인 대상인지 아닌지 판별해봅시다.
		//   아래 코드의 주석을 해제하고 () 안을 채워서 실행해보면 됩니다.
		
		
		int age = 19;
		
		if(age <= 19) {
			System.out.println("할인 대상 O");
		} else if (age >= 60) {
			System.out.println("할인 대상 O)");				
		} else {
			System.out.println("할인 대상 X");
		}
		
		
		
		//7. if문을 사용하여 numIf 값이 100보다 작은지 같은지 큰지를 판별하여 출력하는 코드를 작성해봅시다.
		//힌트) if - else if - else 문법을 사용
		
		int numIf = 10;
		
		if(numIf < 100) {
			System.out.println("100보다 작음");
		} else if(numIf > 100) {
			System.out.println("100보다 큼");
		} else {
			System.out.println("같음");
		}
		
		
	
		//8. switch문을 사용하여 A, B, C, D 학점이 존재할 때 score 값에 따라 해당 학점이 몇점인지 출력해주는 코드를 작성해봅시다.
		// A = 4, B = 3, C = 2, D = 1
		
		String score = "A";
		
		switch (score) {
		case "A":
			System.out.println("A학점은 4점입니다.");
			break;
		case "B":
			System.out.println("B학점은 3점입니다.");
			break;
		case "C":
			System.out.println("C학점은 2점입니다.");
			break;
		case "D":
			System.out.println("D학점은 1점입니다.");
			break;

		default:
			break;
		}
		
		
		
		
	}
}
