package reTry;

public class Student extends Person{
	
//  Student 클래스(자식클래스)`
	//   *Student 클래스는 Person 클래스를 상속받는 클래스이다
	//   학생은 공부하는 학번(number)의 필드 값 정수형으로 존재한다.
	//   모든 매개변수를 받는 생성자(부모클래스의 생성자 호출)를 만드세요.
	void work() {
		System.out.println("자식이 선언한 work");
	}
	
	//   work 메소드 오버라이딩
	//   ex) “OO은 공부를 합니다.”
	//   *OO은 해당 필드의 직업의 이름을 넣으세요.
	   
	
	//   hobby 메소드 오버라이딩
	//   1~10까지 출력
	//   for반복문으로 구현하시오.
	void hobby() {}
	
	//   printNumber 메소드 : 리턴타입x, 매개변수 x
	//   학생의 학번을 출력해주는 메서드를 구현하세요.
	//   "학생의 이름은 OOO이며 학번은 OOO입니다"를 출력
	//   *OOO은 해당 필드의 이름과 학번을 넣으세요.
	public static void main(String[] args) {
		Student student = new Student();
		student.work();
//		student.printName();
//		student.hobby();
	}
}















