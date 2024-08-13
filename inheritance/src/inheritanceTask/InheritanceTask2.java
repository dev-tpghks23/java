package inheritanceTask;

public class InheritanceTask2 {

	public static void main(String[] args) {
//	사람, 학생, 직장인을 객체화 후 각 메서드를 출력	
		PersonTask pt = new PersonTask();
		StudentTask st = new StudentTask("김세환", 20, "경기도 구리", "010", "insta");
		EmployeeTask et = new EmployeeTask();
		
		System.out.println(st.name);
		pt.work();
		st.work();
		et.work();
		
		pt.sleep();
		st.sleep();
		et.sleep();
		
		pt.eat();
		st.eat();
		et.eat();
	}
}
