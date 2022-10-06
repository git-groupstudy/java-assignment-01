package kyubin.assign.chap04.exam01;

import java.util.ArrayList;
import java.util.Arrays;

public class Task04 {

	public static void main(String[] args) {

		System.out.println("1번 문제");
		// 1.자연수 n을 뒤집은 후 각 자리 수를 하나씩 나누어 원소로 가지는 배열의 형태로 출력해주세요.
		// ex ) int n = 12345; -> 출력 : [5,4,3,2,1]

		int n1 = 12345;
		String n2 = Integer.toString(n1); 
		String[] res = n2.split("");
		String[] reverseArr = new String[res.length];
		for (int i = 0; i < res.length; i++) {
			reverseArr[res.length - 1 - i] = res[i];

		}
		System.out.println("reverseArr : " + Arrays.toString(reverseArr));

		System.out.println("2번 문제");
		// 자연수를 받아서 각 자리 수를 한자리 수로 보고 모두 더한 결과를 출력
		// ex) int n = 123 => 1 + 2 + 3 =>출력 6

		int num2 = 123;
		String n3 = Integer.toString(num2);
		String[] n4 = n3.split("");
		int sum = 0;
		for (int i = 0; i < n4.length; i++) {
			int z = Integer.parseInt(n4[i]);
			sum += z;
		}

		System.out.println("answer2 : " + sum);

		System.out.println("3번 문제");
		// 3. 자연수(1~100) 배열에서 최솟값과 최댓값을 찾아서 출력
		int[] arr = { 47, 17, 67, 89, 64, 29, 55, 78, 31 }; // 최솟값 : 17, 최댓값 : 89

		int min = 101;
		int max = 0;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
			if (min > arr[i]) {
				min = arr[i];
			}
		}

		System.out.println("최솟값 : " + min + ", 최댓값 : " + max);

		System.out.println("4번 문제");
		// 배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째 숫자를 구하려 합니다.

		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } }; // {{i,j,k},{i,j,k},{i,j,k}}

		// 1. array의 2번째 부터 5번째 까지 자르면 [5,2,6,3] 입니다.
		// 2. 1에서 나온 배열을 정렬하면 [2,5,6,3] 입니다.
		// 3. 2에서 나온 배열의 3번째 숫자는 5입니다.
		// 4. 조건에 따라 모두 출력하면 [5,6,3] 이 출력되어야 합니다.

		int[] result = new int[3];

		// 작성

		System.out.println(Arrays.toString(result));

		System.out.println("5번 문제");
//		정수 배열 numbers가 주어집니다. 
//		numbers에서 서로 다른 인덱스에 있는 두 개의 수를 뽑아 더해서 만들 수 있는 모든 수를 배열에 오름차순으로 담아 return 하도록 solution 함수를 완성해주세요.

//		numbers의 길이는 2 이상 100 이하입니다.
//		numbers의 모든 수는 0 이상 100 이하입니다.

//		예시
//		  numbers   ||    result
//		[2,1,3,4,1]	   [2,3,4,5,6,7]
//		[5,0,2,7]      [2,5,7,9,12]	

		int[] numbers = { 2, 1, 3, 4, 1 };

//		ArrayList<Integer> list = new ArrayList<Integer>();
//		for (int i = 0; i < numbers.length; i++) {
//			for (int j = 0; j < numbers.length; j++) {
//				if (i == j) {
//					continue;
//					int a = numbers[i] + numbers[j];
//				}
//			}
//		}

		// 작성

//		System.out.println(Arrays.toString(answer));
	}

}
