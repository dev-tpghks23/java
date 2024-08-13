package castingTest;

public class CastingTest {
	public static void main(String[] args) {
//		초기값
		final char KEY = 'a';
		int age = 0;
		double height = 0.0;
		char lastName = ' ';
		String Message = "", input = null;
		boolean isTrue = false;
		
//		double의 강제 형변환
		age = 17;
		height = 123.99;
		age = (int)height;
		System.out.println(age);
		
//		boolean의 강제 형변환
//		isTrue = true;
//		age = (int)isTrue;
		
		lastName = 'A';
		age = lastName;
		System.out.println((char)age*KEY);
		
		
//		8.43 + 2.59를 더해서 10이 나오도록 실습(3분)
		int number1 = 0, number2 = 0;
		number1 = (int)8.43;
		number2 = (int)2.59;
		System.out.println(number1 + number2);
		
		
		
		
		
	}
}











