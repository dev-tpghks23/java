package classTest;

public class StaticTest {
		
	int data = 10;
	static int data_s = 10;
	
	public StaticTest() {;}
	
	void increase() {
		System.out.println(++data);
	}

	void increase_s() {
		System.out.println(++data_s);
	}
	
	
	public static void main(String[] args) {
		StaticTest st = new StaticTest();
//		st.increase();
//		st.increase();
//		st.increase();
//		st.increase();
//		st.increase();
//		st = new StaticTest();
//		st.increase();
//		st.increase();
//		st.increase();
//		st.increase();
//		st.increase();
		
		System.gc();
		
		st.increase_s();
		st.increase_s();
		st.increase_s();
		st.increase_s();
		st.increase_s();
		StaticTest st2 = new StaticTest();
		st2.increase_s();
		st2.increase_s();
		st2.increase_s();
		st2.increase_s();
		st2.increase_s();
		
	}
}
















