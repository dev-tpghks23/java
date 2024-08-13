package controlStatement;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
//		두 수를 입력받고 if문으로 더 큰 수를 출력해보기
		
//		스캐너
		Scanner sc = new Scanner(System.in);
		int number1 = 0, number2 = 0;
		String result = null;
		String message = "두 정수를 입력하세요.", exampleMessage = "예)3 6";
		
		System.out.println(message);
		System.out.println(exampleMessage);
		
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		
		if(number1 > number2) {
			result = "더 큰 값: " + number1;
		} else if(number1 == number2) {
			result = "두 수가 같습니다.";
		} else {
			result = "더 큰 값: " + number2;
		}
		
		System.out.println(result);
		
	}
}












