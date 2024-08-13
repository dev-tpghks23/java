package prepareTask;

public class Student extends Person{
	int number;

	
	public Student() {;}
	public Student(String name, int age, String job, String hobby, int number) {
		super(name, age, job, hobby);
		this.number = number;
	}
	
	@Override
	void work() {
		System.out.println(job + "은 공부를 합니다.");
	}
	
	@Override
	void hobby() {
		for(int i = 1; i < 11; i++) {
			System.out.println(i);
		}
	}
	
	void printNumber() {
		System.out.println("학생의 이름은 "+ super.name + "이며 학번은 " + this.number + "입니다.");
	}
	
	
}























