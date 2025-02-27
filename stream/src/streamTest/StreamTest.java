package streamTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTest {
	
	public String addRoot(String url) {
		return "/app" + url;
	}
	
	public static void main(String[] args) {
		
//		시작점과 끝점을
//		IntStream.range(0, 10);
//		IntStream.rangeClosed(0, 10);
		
//		forEach()
//		IntStream.range(0, 10).forEach(num -> {System.out.println(num);});
//		IntStream.range(0, 5).forEach(num -> {System.out.println(num + 10);});
		
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 40, 50));
//		System.out.println(numbers);
		
//		일반적인 for문
//		for(int i = 0; i < numbers.size(); i++) {
//			System.out.println(numbers.get(i));
//		}
//		
//		향상된 for문, 빠른 for문
//		for(int number : numbers) {
//			System.out.println(number);
//		}
//		
//		Stream forEach
//		numbers.forEach((num)-> {System.out.println(num);});
//		참조형 (소속::메서드)
//		a.forEach(num -> { System.out.println(num);});
//		numbers.forEach(System.out::println);
	
//		인덱스가 있는 자료구조
//		ArrayList<Integer> datas2 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
//		datas2.forEach(System.out::println);

//		ArrayList<Integer> datas3 = new ArrayList<Integer>();
//		datas3.forEach((num) -> { datas3.add(5); });
//		IntStream.range(0, 10).forEach((num) -> { datas3.add(num * 5); });
//		System.out.println(datas3);
		
//		ArrayList<Integer> numbers = new ArrayList<Integer>();
//		IntStream.rangeClosed(1, 10).forEach((num) -> { numbers.add(11 - num); });
//		1) 10~1까지 ArrayList 담기, 단 Arrays.asList() 쓰지 말기
//		2) ArrayList에 있는 값 출력하기
//		System.out.println(numbers);
//		numbers.forEach((n)->{ System.out.println(n);});
		
//		3) ArrayList에 있는 값 인덱스 0부터 4까지 삭제하기
//		IntStream.range(0, 5).forEach((num) -> { numbers.remove(0); });
//		numbers.forEach(System.out::println);
//		System.out.println(numbers);
		
//		String datas = "ABCDEFG";
//		문자열 Stream : chars()
//		datas.chars().forEach(System.out::println);
//		datas.chars().forEach(c-> {System.out.println((char)c);});
		
//		map() : 기존 값을 다른 값으로 변경, 맵은 반드시 return 해야한다.
//		ArrayList<Integer> datas2 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
//		datas2.stream().map(n -> n + 20).forEach(n -> {System.out.println(n);});
//		IntStream.range(0, 5).map(n -> n+10).map(n -> n - 5).forEach(System.out::println);
	
//		람다식
//		(String a) -> {};
//		(String a) -> {return a;}
//		매개변수가 1개면 ()와 자료형 생략, 리턴값이 있으면 {} 생략
//		a -> a;
//		String str1 = "ABCDE";
//		str1.chars().map(c->c+5).forEach(c->{System.out.println((char)c);});
		
//		Wrapper Class
//		User user1 = new User(1L, "김세환", 17, "강사");
//		User user2 = new User(Long.valueOf(2), "홍길동", 17, "개발자");
//		User user3 = new User(Long.valueOf(3), "장보고", 17, "기획자");
//		User user4 = new User(Long.valueOf(4), "이순신", 17, "디자이너");
//		User user5 = new User(Long.valueOf(5), "이성계", 17, "사장");
//		
//		ArrayList<User> users = new ArrayList<User>();
//		
//		users.add(user1);
//		users.add(user2);
//		users.add(user3);
//		users.add(user4);
//		users.add(user5);
		
//		직업만 추출(map()), 직업 앞에 "직업: "(map())붙여서 출력하기!(forEach())
//		stream
//		users.stream().map(u -> u.getJob()).map(job -> "직업 :" + job).forEach(job -> {
//			System.out.println(job);
//			});
//		참조형
//		users.stream().map(User::getJob).map(job -> "직업 :" + job).forEach(System.out::println);
		
//		실습
//		아래의 4개의 URL을 ArrayList에 담은 후 모든 경로 앞에 /app을 붙인다.
//		/news, /game, /brand, /rank
//		15분
		
//		StreamTest streamTest = new StreamTest();
//		ArrayList<String> urls = new ArrayList<String>(Arrays.asList("/news", "/game", "/brand", "/rank"));
		
//		클래스가 다른 메서드의 참조형
//		urls.stream().map(streamTest::addRoot).forEach(System.out::println);
		
//		오름차순 정렬 : sorted() 
//		ArrayList<Integer> numbers2 = new ArrayList<Integer>(Arrays.asList(30, 50, 10, 40, 90, 20, 80, 50));
//		numbers2.stream().sorted().forEach((n)->{System.out.println(n);});;
//		내림차순
//		numbers2.stream().sorted(Collections.reverseOrder()).forEach((n)->{System.out.println(n);});;
		
//		결과를 다른 자료형으로 바꾸고 싶을 때 : collect();
//		ArrayList<Integer> numbers3 = new ArrayList<Integer>(Arrays.asList(30, 50, 10, 40, 90, 20, 80, 50));
//		List<Integer> list = numbers3.stream().sorted().collect(Collectors.toList());
		
//		문자열로 바꾸기
//		ArrayList<Integer> numbers3 = new ArrayList<Integer>(Arrays.asList(30, 50, 10, 40, 90, 20, 80, 50));
//		String str = numbers3.stream().sorted().map(n->n+10).map(String::valueOf).collect(Collectors.joining("-"));
//		System.out.println(str);
//				
//		ArrayList<String> numbers4 = new ArrayList<String>(Arrays.asList(str.split("-")));
//		System.out.println(numbers4);
		
//		filter
//		1부터 100까지 홀수만 출력
//		IntStream.rangeClosed(1, 100).filter((num)-> num % 2 != 0 ).forEach(System.out::println);
		
//		1부터 100까지 ArrayList에 짝수만 담고 출력
		ArrayList<Integer> even = new ArrayList<Integer>();
		IntStream.rangeClosed(1, 100).filter(n-> n % 2 == 0).forEach(even::add);
		System.out.println(even.toString());
	}
}

















