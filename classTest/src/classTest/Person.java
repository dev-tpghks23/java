package classTest;

public class Person {
	String name;
	int age;
	
//	기본 생성자
	public Person() {;}
	
//	초기화 생성자(오버로딩)
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public static void main(String[] args) {
//		객체화
		Person yonghee = new Person("영희", 20);
		Person zzangoo = new Person();
		
		System.out.println(yonghee.name);
		
		
		
		
		
		
		
		
	}
}






