package streamTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamTask {
	public static void main(String[] args) {
		
//		40분 실습!
//		1) 1~10까지 ArrayList에 담고 출력
//		ArrayList<Integer> numbers = new ArrayList<Integer>();
//		IntStream.range(0, 10).map(n -> n+1).forEach(numbers::add);
//		numbers.forEach(System.out::print);
		
//		2) ABCDEF를 각각 문자별로 출력
//		ArrayList<Character> numbers2 = new ArrayList<Character>();
//		String str = "ABCDEF";
//		IntStream.range(0, 6).forEach((n) -> { numbers2.add((char)(n + 65));});
//		str.chars().forEach(c -> {System.out.println((char)c);});
//		numbers2.forEach(System.out::println);
		
//		3) 1~100까지 중 홀수만 ArrayList에 담고 출력
//		ArrayList<Integer> numbers3 = new ArrayList<Integer>();
//		IntStream.rangeClosed(1, 100).filter(n -> n % 2 == 1).forEach(numbers3::add);
//		IntStream.rangeClosed(1, 50).map(n -> n * 2 - 1).forEach(numbers3::add);
//		System.out.println(numbers3.toString());
		
//		4) A~F까지 중 D를 제외하고 출력하기
		ArrayList<Character> chars2 = new ArrayList<Character>();
		IntStream.range('A', 'F').map(c -> c > 67 ? c + 1 : c).forEach(c -> chars2.add((char)c));
		System.out.println(chars2);
		
//		5) 5개의 문자열을 모두 소문자로 출력하기
//		Black, WHITE, reD, yeLLow, PINk	String.toLowerCase(), toUppercase()
		String[] strArr = {"Black", "WHiTe", "ReD", "yeLLow", "PInK"};
		ArrayList<String> datas = new ArrayList<String>(Arrays.asList(strArr));
		datas.stream().map(String::toLowerCase).forEach(System.out::println);
		
		
	}
}









