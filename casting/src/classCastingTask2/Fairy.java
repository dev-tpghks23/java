package classCastingTask2;

public class Fairy extends Monster{
	
	public Fairy() {;}
	public Fairy(String name, int hp, int experience) {
		super(name, hp, experience);
	}
	
	
	@Override
	void dropItems() {
		System.out.println("날개를 떨궜습니다.");
	}
}
