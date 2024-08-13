package interTest;

public class InterTask {
	public static void main(String[] args) {
		Electronics el = (String name) -> {
			return name;
		};
		
		el.on("안녕");
	}
}
