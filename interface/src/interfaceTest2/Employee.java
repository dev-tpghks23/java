package interfaceTest2;

import java.awt.event.MouseAdapter;

import org.w3c.dom.events.MouseEvent;

public class Employee extends Person{
//	회사원 Employee
//	필드 name, age, history, phone
	private String name;
	private int age;
	private int history;
	private String phone;

	public Employee() {;}

	public Employee(String name, int age, int history, String phone) {
		super(name, age);
		this.history = history;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getHistory() {
		return history;
	}

	public void setHistory(int history) {
		this.history = history;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
//	comeInMoney 없음
	
//	sell 구현
//	social 구현
	@Override
	public void sell() {
		System.out.println("꿈을 팔고 있습니다.");
	}
	@Override
	public void social() {
		System.out.println(this.history + "년 정도 일했습니다.");
	}
	
	@Override
	public void mitting() {}

}
















