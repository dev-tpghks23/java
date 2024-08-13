package variableTest;

public class FormatTest {
	public static void main(String[] args) {
//		출력에서 사용할 수 있는 서식문자
//		System.out.printf();
//		%d : decimal(10진수 정수)
//		%o : octal(8진수 정수)
//		%x : hexadecimal(16진수 정수)
//		%f : float(실수)
//		%c : character(문자형)
//		%s : String(문자열)
		
		String name = "김세환";
		int age = 17;
		double height = 120.123;
//		이름은 ____
//		나이는 ____
//		키는 ____cm

		System.out.printf("이름은 %s\n", name);
		System.out.printf("나이는 %d\n", age);
		System.out.printf("키는 %.3fcm", height);
		
		
		
	}
}




