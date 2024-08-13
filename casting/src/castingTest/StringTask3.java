package castingTest;

public class StringTask3 {
	public static void main(String[] args) {
		String str1 = "12.123", str2 = "345.789", str3 = "6789.456";
		double dou1 = 0.0, dou2 = 0.0, dou3 = 0.0;
		int num1 = 0, num2 = 0, num3 = 0;
		
		dou1 = Double.parseDouble(str1);
		dou2 = Double.parseDouble(str2);
		dou3 = Double.parseDouble(str3);
		
		num1 = (int)dou1;
		num2 = (int)dou2;
		num3 = (int)dou3;
		
		System.out.println("" + num1 + num2 + num3);
		System.out.println(String.valueOf(num1) + num2 + num3);
		
		
//		"12.123";
//		"345.789"
//		"6789.456"
//		3개 값을 더해서 123456789를 출력하기
//		25분
		
		
	}
}
