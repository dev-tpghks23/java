
package inheritanceTask;

public class EmployeeTask extends PersonTask{
	String nestEgg;
	
	public EmployeeTask() {;}
	public EmployeeTask(String nestEgg) {
		super();
		this.nestEgg = nestEgg;
	}

	@Override
	void eat() {
		System.out.println("구내식당을 간다.");
	}
	
	@Override
	void sleep() {
		System.out.println("잘 시간이 없다");
	}
	
	@Override
	void work() {
		System.out.println("직업이 계속 바뀐다.");
	}
	
	
}
