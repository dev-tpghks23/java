package anonymous;

public class Inner {
	
	public Inner() {;}
	
	public class InnerTest {
		int value;
		
		public InnerTest() {
			this.value = 20;
		}

		public InnerTest(int value) {
			this.value = value;
		}
		
		public void printInnerClassValue() {
			System.out.println("inner class Value" + this.value);
		}
		
	}
	
	public static void main(String[] args) {
		Inner.InnerTest inner = new Inner().new InnerTest();
		System.out.println(inner.value);
	}
	
	
}










