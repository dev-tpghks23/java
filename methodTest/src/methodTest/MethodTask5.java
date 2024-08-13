package methodTest;

public class MethodTask5 {
	
//	5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드
	int[] getMaxAndMin(int[] arData) {
		int[] arResult = {arData[0], arData[0]};
		for(int i = 1; i < arData.length; i++) {
			if(arResult[0] < arData[i]) {
				arResult[0] = arData[i];
			}
			if(arResult[1] > arData[i]) {
				arResult[1] = arData[i];
			}
		}
		return arResult;
	}
	
	
	
//	5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드 (void)
//	2분
	void getMaxAndMinVoid(int[] arData, int[] arResult) {
		for(int i = 1; i < arData.length; i++) {
			if(arResult[0] < arData[i]) {
				arResult[0] = arData[i];
			}
			if(arResult[1] > arData[i]) {
				arResult[1] = arData[i];
			}
		}
	}

	//	String 클래스의 indexOf()메소드 만들기, 문자열 전체와 검색할 문자형을 전달받는다.
	int indexOf(String content, char c) {
		for(int i = 0; i < content.length(); i++) {
			if(content.charAt(i) == c) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		MethodTask5 mt = new MethodTask5();
//		int[] result = null; 
//		result = mt.getMaxAndMin(new int[] {3, 10, 20, 30, 40});
//		System.out.println(result[0]);
//		System.out.println(result[1]);
		
		int[] arData = {3, 6, 10, 15, 8};
		int[] arResult = {arData[0], arData[0]};
		mt.getMaxAndMinVoid(arData, arResult);		
		
//		System.out.println(arResult[0]);
//		System.out.println(arResult[1]);
//		int result = 0;
//		result = mt.indexOf("apple", 'p');
//		System.out.println(result);
		
		
		
		
		
	}
	
	
}





























