package arrayTest;

import java.util.Scanner;

public class arrTask4 {
	public static void main(String[] args) {
//		그룹 문제
//		정수를 한글로 변경하기
//		ex)
//		입력) 1024
//		출력) 일공이사
		
//		힌트
//		입력받은 정수를 문자열로 변경
//		어떤 배열 하나를 선언해서 한글을 담고 있어야 출력할 수 있다.
//		30분
		Scanner sc = new Scanner(System.in);
		String hangle = "공일이삼사오육칠팔구", input = null;
		String message = "정수 : ", result = "";
		
		System.out.println(message);
		input = sc.next();
		
		for(int i = 0; i < input.length(); i++){
			result += hangle.charAt(input.charAt(i) - 48);
		}
		
		System.out.println(result);
		
		
		
		
		
		
	}
}





