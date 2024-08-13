package classCastingTask2;

public class Human extends Monster {
	
	public Human() {;}
	public Human(String name, int hp, int experience) {
		super(name, hp, experience);
	}

	@Override
	void dropItems() {
		System.out.println("갑옷을 떨궜습니다.");
	}
}
