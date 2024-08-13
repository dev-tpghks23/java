package variableTest;

public class VariableTask2 {
	public static void main(String[] args) {
//		저장공간 2개만 사용 
//		값을 넣고 모두 출력하기
//		저장공간 : datas, numbers 
//		값 : 85.10F, 7845.15, false, B, 5, 자바, S, 98590, D, true, 공백문자
//		실습 12분
		
		double numbers = 0.0;
		String datas = "";
		
		numbers = 85.10F;
		System.out.println(numbers);
		numbers = 7845.15;
		System.out.println(numbers);
		datas = "false";
		System.out.println(datas);
		datas = "B";
		System.out.println(datas);
		datas = "5";
		System.out.println(datas);
		datas = "자바";
		System.out.println(datas);
		datas = "98590";
		System.out.println(datas);
		datas = "true";
		System.out.println(datas);
		datas = " ";
		System.out.println("공백 문자" + datas);
	
	}
}
