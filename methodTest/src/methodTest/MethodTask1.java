package methodTest;

import java.util.Scanner;

public class MethodTask1 {
//	1~10까지 println()으로 출력하는 메소드
	void printFrom1To10() {
		for(int i = 0; i < 10; i++) {
			System.out.println(i + 1);
		}
	}
	
//	세 정수를 뺄셈해주는 메소드
	int minus(int num1, int num2, int num3) {
		 return num1 - num2 - num3;
	}
	
	public static void main(String[] args) {
		MethodTask1 mt = new MethodTask1();
		mt.minus(30, 10, 20);
	}
	
}










