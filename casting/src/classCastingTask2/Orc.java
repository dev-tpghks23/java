package classCastingTask2;

public class Orc extends Monster{
	
	public Orc() {;}
	public Orc(String name, int hp, int experience) {
		super(name, hp, experience);
	}
	
	@Override
	void dropItems() {
		System.out.println("가죽을 떨궜습니다.");
	}
}
