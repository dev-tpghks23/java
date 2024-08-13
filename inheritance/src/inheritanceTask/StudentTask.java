package inheritanceTask;

public class StudentTask extends PersonTask{
	
	String insta;

	public StudentTask() {;}
	public StudentTask(String name, int age, String address, String phone, String insta) {
		super(name, age, address, phone);
		this.insta = insta;
	}
	
	@Override
	void eat() {
		System.out.println("밥먹을 시간이 없다!");
	}
	
	@Override
	void sleep() {
		System.out.println("수업 시간에 잠을 잔다.");
	}
	
	@Override
	void work() {
		System.out.println("아르바이트를 한다.");
	}

}
