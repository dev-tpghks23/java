package anonymous;

public class AnonymousTest {
	public static void main(String[] args) {
		Study study = new Study() {
			
			@Override
			public void setTopic() {
				System.out.println("사용 했다 스터디!");
			}
		};
		
		study.setTopic();
	}
	
}
