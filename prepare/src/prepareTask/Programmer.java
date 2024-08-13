package prepareTask;

public class Programmer extends Person{
	boolean notebook;

	public Programmer() {;}
	public Programmer(String name, int age, String job, String hobby, boolean notebook) {
		super(name, age, job, hobby);
		this.notebook = notebook;
	}
	
	@Override
	void work() {
		System.out.println(job + "은 코딩을 합니다.");
	}

	@Override
	void hobby() {
		char[] arData = new char[4];
//		arData[0] = 'A';
//		arData[1] = 'B';
//		arData[2] = 'C';
//		arData[3] = 'D';
//		
//		System.out.println(arData[0]);
//		System.out.println(arData[1]);
//		System.out.println(arData[2]);
//		System.out.println(arData[3]);
		
		for(int i = 0; i < arData.length; i++) {
			arData[i] = (char)('A' + i);
			System.out.println(arData[i]);
		}
		
	}
	
	void isNotebook() {
		if(notebook){
			System.out.println("노트북이 있습니다");
		}else {
			System.out.println("노트북이 없습니다.");
		}
	}
	
}











