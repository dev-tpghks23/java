package staticTask;

public class Student {
//	학생 총점과 평균을 구해주는 로직 클래스로 구현
//  필드 : 학번, 이름, 국어점수, 영어점수, 수학점수, 토탈, 평균
	int number;
	String name;
	int kor;
	int eng;
	int math;
	int total;
	double average;
	
	public Student() {;}
	public Student(int number, String name, int kor, int eng, int math) {
		this.number = number;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.total = kor + eng + math;
		this.average = Double.parseDouble(String.format("%.2f", total / 3.0));
	}
	
	public static void main(String[] args) {
//	객체화
//	생성자로 초기화 : 학번, 이름, 국어점수, 영어점수, 수학점수
		Student sehwan = new Student(0001, "김세환", 100, 1, 60);
//	총점과 평균을 출력 (평균은 소수점 2자리까지만 출력)
//	15분
		System.out.println("총 점 :" + sehwan.total);
		System.out.println("총 점 :" + sehwan.average);
		
		Student yonghee = new Student(0002, "김영희", 100, 100, 88);
		System.out.println(yonghee.total);
		System.out.println(yonghee.average);
		
	}
}











