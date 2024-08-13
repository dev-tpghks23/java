package operExpert;

import java.util.Scanner;

public class Oper {
	public static void main(String[] args) {
//	(마스터)
//	사용자에게 값을 입력받고
//	정수라면 정수입니다를 출력
//	실수라면 실수입니다를 출력
		
//	예 ) 183 -> 입력한 값은 정수입니다.
//	183.5 -> 입력한 값은 실수입니다.
//	삼항 연산자를 꼭 사용!
		
//		스캐너가 필요하다
		Scanner sc = new Scanner(System.in);
		String inputValue = null, result = "";
		String message = "정수, 실수 확인할 값을 입력하세요.";
		String integerMessage = "입력한 값은 정수입니다.";
		String doubleMessage = "입력한 값은 실수입니다.";
		double num1 = 0.0;
		int num2 = 0;
		boolean isInteger = false;
		
		System.out.println(message);
		inputValue = sc.next();
		num1 = Double.parseDouble(inputValue);
		num2 = (int)num1;
		isInteger = num1 == num2;
		
		result = isInteger ? integerMessage : doubleMessage;
		System.out.println(result);

		
		
	}
}
