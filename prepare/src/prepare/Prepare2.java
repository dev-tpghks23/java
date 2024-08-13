package prepare;

public class Prepare2 {
	int num1; // ① num1은 전역변수이다.
	static int num2; // ② num2는 지역변수이다.
	
	int printName(String name) { // ③ name은 매개변수이다.
		int total = 0; // ④ total은 지역변수이다.
		int total2 = this.num1;
		for(int i = 0; i < 10; i++) { 
			total += i;
		}
		return total;
	}
	
	public static void main(String[] args) {
	}
}
