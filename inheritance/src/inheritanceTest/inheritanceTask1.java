package inheritanceTest;

class Car2 {
	String name;
	String color;
	public Car2() {;}
	public Car2(String name, String color) {
		this.name = name;
		this.color = color;
	}
	
	void engineStart() {
		System.out.println("열쇠로 켜기");
	}
	
	void engineStop() {
		System.out.println("열쇠로 시동 끄기");
	}
}

class SuperCar2 extends Car2{
	
//	부모 클래스에 선언된 메소드를 재정의하여
	@Override
	void engineStart() {
		System.out.println("음성으로 시동 켜기!");
	}
//	음성으로 시동켜기, 음성으로 시동끄기 후 
	@Override
	void engineStop() {
		super.engineStop();
		System.out.println("음성으로 시동 끄기");
	}
//	프로그램에서 객체 생성 후 2개의 메소드를 모두 실행하기
	
}

public class inheritanceTask1 {
	public static void main(String[] args) {
		SuperCar2 ferrari = new SuperCar2();
		ferrari.engineStop();
	}
}


















