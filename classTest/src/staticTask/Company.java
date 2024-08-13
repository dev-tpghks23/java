package staticTask;

public class Company {
//	필드
//	money 회사의 총 수입
	static long money; 
//	name 이름
	String name;
//	age 나이
	int age;
//	income 수입
	long income;
	
//	기본 생성자 생성
	public Company() {;}
	
//	초기화 생성자 생성:  이름, 나이
	public Company(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {	
//	필드 구성 후 객체화
//	객체화 시 생성자로 초기화
		Company employee1 = new Company("김세환", 20);
		Company employee2 = new Company("류재은", 20);
		Company employee3 = new Company("최도윤", 17);
		Company employee4 = new Company("김태혁", 10);
		
//	회사원 employee1 총 수입 10000
		employee1.income += 10_000;
//	회사원 employee2 총 수입 1000
		employee2.income += 1_000;
//	회사원 employee3 총 수입 2000
		employee3.income += 2_000;
//	회사원 employee4 총 수입 -10000
		employee4.income -= 10_000;
		
//	회사의 총 수입 출력
		Company.money += employee1.income;
		Company.money += employee2.income;
		Company.money += employee3.income;
		Company.money += employee4.income;
		System.out.println(Company.money);
	}
	
}












