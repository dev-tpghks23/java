package inheritanceTask;

public class PersonTask {
	String name;
	int age;
	String address;
	String phone;
	
	public PersonTask() {;}

	public PersonTask(String name, int age, String address, String phone) {
		this.name = name;
		this.age = age;
		this.address = address;
		this.phone = phone;
	}
	
	void eat() {
		System.out.println("먹기");
	}
	void sleep() {
		System.out.println("자기");
	}
	void work() {
		System.out.println("놀기");
	}
	
	
}
