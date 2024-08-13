package methodTest;

public class MethodConfirm {
	
   // 5개의 정수를 입력받고 최대값과 최소값 구해주는 메소드
   void maxMin(int[] arData) {
      // 최대값과 최솟값 변수를 만든다.
      int max = 0, min = 0;
      // 입력받은 5개의 정수값을 비교한다.
      // 첫 번째 정수를 max와 min에 넣는다.
      min = arData[0];
      max = arData[0];

      for (int i = 1; i < arData.length; i++) {
         if (max < arData[i]) {
            max = arData[i];
         }
         if (min > arData[i]) {
            min = arData[i];
         }
      }
      System.out.println("최솟값: " + min);
      System.out.println("최대값: " + max);
   }


	public static void main(String[] args) {
		MethodConfirm mc = new MethodConfirm();
		int[] arData = {10, 20, 30, 4, 5};
		
		mc.maxMin(arData);
	}
}












