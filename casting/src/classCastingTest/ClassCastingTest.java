package classCastingTest;

class Car{
	public Car() {;}
	void engineStart() {
		System.out.println("열쇠로 시동 킴");
	}
}

class SuperCar extends Car{
	
	public SuperCar() {;}	
	
	@Override
	void engineStart() {
		System.out.println("음성으로 시동 킴");
	}
	
	void openRoof() {
		System.out.println("뚜껑 오픈!");
	}
}

public class ClassCastingTest {
	public static void main(String[] args) {
		Car matiz = new Car();
		Car kia = new SuperCar(); // upCasting
		SuperCar ferrari = new SuperCar();
		SuperCar kiaFullOption = (SuperCar) kia; //downCasting
		
//		객체 instanceof type : 참 또는 거짓 
		System.out.println(matiz instanceof Car);
		System.out.println(matiz instanceof SuperCar);
		System.out.println(kia instanceof Car);
		System.out.println(kia instanceof SuperCar);
		System.out.println(ferrari instanceof Car);
		System.out.println(ferrari instanceof SuperCar);
		System.out.println(kiaFullOption instanceof Car);
		System.out.println(kiaFullOption instanceof SuperCar);
		
	}
}














