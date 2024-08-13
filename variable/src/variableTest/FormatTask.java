package variableTest;

public class FormatTask {
	public static void main(String[] args) {
		int month = 7, date = 23;
		String message = "오늘 날짜는 %d월 %d일 입니다\n", 
				goodbye = "안녕",
				message2 = "하지만 %s";
		
//		오늘 날짜는 {7}월 {23}일입니다.
//		하지만 {안녕}
		System.out.printf(message, month, date);
		System.out.printf(message2, goodbye);
		
		
		
		
		
	}
}
