package interfaceTest2;

public class Person extends SalesAdapter {
//	필드 name, age
	private String name;
	private int age;
	
	public Person() {;}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
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

	void eat() {
		System.out.println("먹고");
	}
	void sleep() {
		System.out.println("자고");
	}
	void poop() {
		System.out.println("화장실 가고!");
	}

	@Override
	public void sell() {
		System.out.println("인간은 장사를 팔기 위해 돈을 법니다.");
	}
	@Override
	public void social() {
		System.out.println("인간을 사회 생활을 합니다.");
	}
	
	@Override
	public void mitting() {
		System.out.println("다른 사람을 만납니다.");
	}

}








