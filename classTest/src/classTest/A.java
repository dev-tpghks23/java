package classTest;

public class A {
	
	String name;
	int age;
	
	public A() {;};
	public A(String name) {};
	public A(int name) {};
	public A(boolean name) {};
	public A(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	public static void main(String[] args) {
		A person1 = new A();
		A person2 = new A("김세환", 20);
		System.out.println(person1.name + " " + person1.age);
		System.out.println(person2.name);
		
		
	}
	
}









