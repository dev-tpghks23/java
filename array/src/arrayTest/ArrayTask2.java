package arrayTest;

import java.util.Scanner;

public class ArrayTask2 {
	public static void main(String[] args) {
//		(브론즈)
//		1~10까지 배열에 담고 출력
//		int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//		int[] numbers = new int[10];
//		System.out.println(numbers.length); // 10
//		for(int i = 0; i < numbers.length; i++) {
//			numbers[i] = i + 1;
//			System.out.println(numbers[i]);
//		}
		
//		1~100까지 배열에 담은 후 홀수만 출력
//		int[] arData = new int[100];
//		for(int i = 0; i < arData.length; i++) {
//			arData[i] = i + 1;
//			if(i % 2 != 0) { continue; }
//			System.out.println(arData[i]);
//		}

//		(실버)
//		1~100까지 배열에 담은 후 짝수의 합을 출력
//		int result = 0;
//		int[] arData = new int[100];
//		for(int i = 0; i < arData.length; i++) {
//			arData[i] = i + 1;
//			if(i % 2 != 0) {
//				result += arData[i];
//			}
//		}
//		System.out.println(result);
		
//		A~F까지 배열에 담고 출력
//		char[] arData = new char[6];
//		
//		for(int i = 0; i < arData.length; i++) {
//			arData[i] = (char)(65 + i);
//			System.out.println((arData[i]));
//		}
		
//		A~F까지 중 C를 제외하고 배열에 담은 후 출력

//		char[] arData = new char[5];
//		
//		for(int i = 0; i < arData.length; i++) {
//			arData[i] = (char)(i > 1 ? 66 + i : 65 + i);
//			System.out.println((arData[i]));
//		}
		
//		(골드)
//		5개의 정수를 입력받고 배열에 담은 후 최대값과 최소값을 출력
//		30분
		Scanner sc = new Scanner(System.in);
		int min = 0, max = 0;
		int[] arData = new int[5];
		String message = "5개의 정수를 입력하세요.", exampleMessage = "ex)1 3 5 7 9";
		
		System.out.println(message);
		System.out.println(exampleMessage);

		for(int i = 0; i < arData.length; i++) {
			arData[i] = sc.nextInt();
		}
		
		min = arData[0];
		max = arData[0];
		
		for(int i = 1; i < arData.length; i++) {
			if( max < arData[i]) { max = arData[i]; }
			if( min > arData[i]) { min = arData[i]; }
		}
		
		System.out.println("최솟값: " + min);
		System.out.println("최대값: " + max);
		
		
//		그룹 단위 문제
//		(다이아)
//		사용자가 입력할 정수의 개수만큼 배열을 만든 후 정수를 입력받고
//		평균 구하기
//		Scanner sc = new Scanner(System.in);
//		int[] arData = null;
		String message1 = "정수의 개수를 입력하세요.", message2 = "번 째 정수";
		int length = 0, total = 0;
		double average = 0.0;
		
		System.out.println(message1);
		
		length = sc.nextInt();
		arData = new int[length];
		
		for(int i = 0; i < arData.length; i++) {
			System.out.println(i+1+message2);
			arData[i] = sc.nextInt();
		}
		
		for(int i = 0; i < arData.length; i++) {
			total += arData[i];
		}
		
		average = (double)total/length;
		
		System.out.print("[");
		for(int i = 0; i < arData.length; i++) {
			System.out.print(arData[i]);
			if(i != length - 1) {
				System.out.print(" ");
			}
		}
		System.out.println("]");
		System.out.println("평균 :" + average);
		
	}
}

















