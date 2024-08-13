package reTry;

public class Caluator {
		
	//   calcNum
	//   정수형 2개의 ‘매개변수’를 넘겨 받아, 더한 값을 출력해주는 기능을 가진 메소드 구현
	int calcNum(int a, int b) {
		return a + b;
	}
	
	//   calcNum 
	//   정수형 1개, 실수형 1개의 ‘매개변수’를 넘겨 받아 더한 결과값을 주는 기능을 가진 메소드 구현
	double calcNum(int a, double b) {
		return a + b;
	}
	
	//   calcNum
	//   실수형 1개를 ‘매개변수’로 넘겨 받아 정수형으로 바꿔주는 기능을 가진 메소드 메소드 구현
	int calcNum (double a) {
		return (int)a;
	}
	
	//   calcNum
	//   문자열 매개변수 2개를 넘겨받아 연결해서 출력하는 기능을 가진 메소드

	void calcNum(String a, String b) {
		System.out.println(a + b);
	}
	//   클래스의 객체를 메모리에 할당하여, 클래스 객체가 가진 모든 메소드 호출하여
	//   오류를 검증하고 결과 확인한다.

	public static void main(String[] args) {
		Caluator calc = new Caluator();
		calc.calcNum(10, 20);
	}
}










