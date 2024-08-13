package lambdaTest;

public class LambdaTest {
	public static void main(String[] args) {
//		LambdaInter lambda = num -> num % 2 == 0;
//		System.out.println(lambda.even(20));
		
//		중괄호로 실행 문장을 작성해서 리턴하는 방법
//		PrintName print = (String firstName, String lastName) -> {
//			String result = firstName + lastName;
//			return result;
//		};
//		
//		중괄호를 생략하는 방법, 1줄로 작성해야한다.
//		PrintName print = (String firstName, String lastName) -> firstName + lastName;
//		System.out.println(print.name("안녕", "하세요"));
		
//		20분
//		1) 1~10까지 출력해주는 람다구현 PrintNum, printUpTo10()
//		PrintNum printNum = () -> {
//			for(int i = 0; i < 10; i++) {
//				System.out.println(i+1);
//			}
//		};
		
//		printNum.printUpTo10();
		
//		3) 문자열을 받으면 뒤집은 문자열로 리턴해주는 람다구현 Reverse reverseString()
		Reverse reverse = (String str) -> {
			String result = "";
			for(int i = 0; i < str.length(); i++) {
				result += str.charAt(str.length() - i - 1);
			}
			return result;
		};
		
		String a = reverse.reverseString("아무거나넣어보고 ㅁㄴㅇㅁㄴㅇㅁㄴ 뒤집어주세용~!");
		System.out.println(a);
		
	}
}



















