package prepareTask;

public class Person {
	
	String name;
	long age;
	String job;
	String hobby;
	
	public Person() {;}
	public Person(String name, long age, String job, String hobby) {
		this.name = name;
		this.age = age;
		this.job = job;
		this.hobby = hobby;
	}

	void printName() {
		System.out.println(name);
	}
	
	void work() {
		System.out.println(job + "하는 일은 없습니다.");
	}
	
	void hobby(){
		System.out.println("취미는 잠자기 입니다.");
	}
	
}
