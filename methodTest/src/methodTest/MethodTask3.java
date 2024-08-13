package methodTest;

public class MethodTask3 {
//		(실버)
//		홀수를 짝수로, 짝수를 홀수로 (2 -> 3, 5 -> 6)
		int changeToNumber(int number) {
			return ++number;
		}
	
//		(골드)
//		문자열을 입력받고 소문자는 대문자로, 대문자를 소문자로 바꿔주는 메소드
//		20분
		String changeToUpperCaseOrLowerCase(String content) {
			String result  = "";
//			반복을 돌린다.
			for(int i = 0; i < content.length(); i++) {
//				문자열마다 1개씩 추출한다.
				char c = content.charAt(i);
//				a : 97, A : 65 
//				65~90까지 아스키코드의 범위 안에서 c를 검사한다
				if( c >= 65 && c <= 90) {
//					각각의 결과값을 형변환해서 result에 연결한다.
					result += (char)(c+32);
//					소문자 영역에 들어오는 문자형을 비교하여 대문자로 변환한다.
				}else if( c >= 97 && c <= 122 ) {
//					결과값에 문자형을 소문자로 형변환하여 result에 연결한다.
					result += (char)(c-32);
//					문자형이 아닌 다른 값들을 그냥 연결한다.
				}else {
					result += c; 
				}
			}
			return result;
		}
		
	
	public static void main(String[] args) {
		MethodTask3 mt = new MethodTask3();
//		System.out.println(mt.changeToNumber(10));
		System.out.println(mt.changeToUpperCaseOrLowerCase("안녕hI"));
		
	}
}
