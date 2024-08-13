package castingTest;

public class StringTask2 {
	public static void main(String[] args) {
	char a = 'a', j = 'j', k = 'k';
	int gap = 32;
	a = (char)(a - gap);
	j = (char)(j - gap);
	k = (char)(k - gap);
	
//	13분
//	a, j, k를 연산하여 A, J, K 출력하기
//	힌트 아스키코드
		System.out.printf("%c, %c, %c", a, j, k);
	}
}
