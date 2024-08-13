package prepareTask;

public class Calculator {
	
	void calcNum(int num1, int num2) {
		int result = num1 + num2;
		System.out.println(result);
	};
	
	double calcNum(int num1, double num2) {
		double result = num1 + num2;
		return result;
	};
	
	int calcNum(double num2) {
		
		return (int)num2;
	};
	
	void calcNum(String str1, String str2) {
		System.out.println(str1 + str2);
	};
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.calcNum(10, 20);
		System.out.println(calculator.calcNum(20));
		System.out.println(calculator.calcNum(10, 30.0));
		calculator.calcNum("안녕", "하세요");
	}
	
}
