package castingTest;

public class StringTest2 {
	public static void main(String[] args) {
		boolean isTrue = false;
		double data1 = 0.0;
		char a = 'a';
		
//		
//		(int)1.5
//		int Integer
//		boolean Boolean
//		double Double
//		float Float
//		char Character		
		
//		문자열을 다른 타입으로 변경
//		String은 클래스, 기본 자료형과 격이 달라서 변경할 수 없다.
//		System.out.println((int)"1")는 사용할 수 없다.
		System.out.println(Integer.parseInt("1")+(3+8));
		
		isTrue = Boolean.parseBoolean("true");
		data1 = Double.parseDouble("10.2");
		System.out.println((int)Double.parseDouble("10.2"));
		
		System.out.println((char)('a' + 10));
	
	}
}






