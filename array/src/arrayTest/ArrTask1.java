package arrayTest;

public class ArrTask1 {
	public static void main(String[] args) {
//		(브론즈)
//		10~1까지 중 짝수만 배열에 담고 출력
//		10분
//		int[] arData = {10, 8, 6, 4, 2};
//		for(int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}
		
//		int[] arData = new int[5];
//		arData[0] = 10;
//		arData[1] = 8;
//		arData[2] = 6;
//		arData[3] = 4;
//		arData[4] = 2;
//		
//		for(int i = 0; i < arData.length; i++) {
//			System.out.println(arData[i]);
//		}
		
		int[] arData = new int[5];
		for(int i = 0; i < arData.length; i++) {
			arData[i] = (5-i)*2;
			System.out.println(arData[i]);
		}
		
		
	}
}
