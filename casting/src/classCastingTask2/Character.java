package classCastingTask2;

public class Character {
	
	private String id;
	private String job;
	private int hp;

	public Character() {;}
	public Character(String id, String job, int hp) {
		this.id = id;
		this.job = job;
		this.hp = hp;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	
	void hunt(Monster monster) {
		if(monster instanceof Fairy) {
			Fairy fairy = (Fairy)monster;
			System.out.println(fairy.getName() +" 이(가) 사냥 당했습니다");
			System.out.println(id + "이(가) 사냥에 성공했습니다.");
			fairy.dropItems();
		}else if(monster instanceof Orc) {
			Orc orc = (Orc)monster;
			System.out.println(orc.getName() +" 이(가) 사냥 당했습니다");
			System.out.println(id + "이(가) 사냥에 성공했습니다.");
			orc.dropItems();
			
		}else if(monster instanceof Human) {
			Human human = (Human)monster;
			System.out.println(human.getName() +" (가) 사냥 당했습니다");
			System.out.println(id + "이(가) 사냥에 성공했습니다.");
			human.dropItems();
		}
		
	}
	
}
