package operTest;

import java.util.Scanner;

public class OperTest2 {
	public static void main(String[] args) {
//		사용자에게 두 정수를 입력 받아서 대소를 비교하여 출력
//		관계연산자, 삼항연산자 이용

//		1. 초기 변수 설정 및 초기값
		int num1 = 0, num2 = 0;
		String message = "두 정수를 입력하세요.\n", exampleMessage = "ex)2 5";
		String result = "";
		
//		2. 스캐너 가져온다
		Scanner sc = new Scanner(System.in);
//		3. 출력 메세지
		System.out.println(message + exampleMessage);
//		4. 사용자에게 입력을 받는다. 정수로 nextInt()
		num1 = sc.nextInt();
		num2 = sc.nextInt();
				
//		5. 변수를 가지고 비교한다.
//		6. 삼항연산자 
		result = num1 > num2 ? "더 큰 값: " + num1 
				: num1 == num2 ? "두 수는 같습니다" : "더 큰 값: " + num2;
		
//		7. 결과 출력
		System.out.println(result);
			
	
//		System.out.println();
		
		
		
	}
}





