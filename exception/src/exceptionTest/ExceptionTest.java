package exceptionTest;

public class ExceptionTest {
	
	public static void main(String[] args) {
		int[] arData = {10, 20, 30, 40, 50};
		try {
			System.out.println(arData[5]);
			System.out.println(arData[4]/0);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("야 index 잘못입력했어~!");
		} catch(ArithmeticException e) {
			System.out.println();
		} catch(Exception e) {
			System.out.println("알 수 없는 오류 발생!");
			e.printStackTrace();
		}
	}
}
