package prepareTask;

public class PersonMain {
	public static void main(String[] args) {
		Person student = new Student("김세환", 10, "초등학생", "물어뜯기", 20240820);
		Person programmer = new Programmer("김세환", 20, "개발자", "노트북으로 찍기", true);
		
		Student st = (Student)student;
		Programmer pr = (Programmer)programmer;
			
		st.work();
		st.hobby();
		st.printNumber();
		pr.work();
		pr.hobby();
		pr.isNotebook();
		
	}
}
