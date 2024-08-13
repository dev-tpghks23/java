package classCastingTask2;

// 캐릭터 hunt(Monster monster)
// 몬스터(부모), 오크, 요정, 휴먼

// 클래스 5개 만든다.
// 캐릭터, 몬스터, 오크, 요정, 휴먼

// 오크의 가죽을 얻었습니다.
// 요정의 날개를 얻었습니다.
// 휴먼의 갑옷을 얻었습니다.

public class CastingTask2 {
	public static void main(String[] args) {
		Character ct = new Character("코딩왕", "프로그래머", 100);
		Fairy fairy = new Fairy("요정", 10, 100);
		Monster orc = new Orc("못생긴 오크", 100, 1);
		Human human = new Human("적자낸 태혁", 50, 100);
		
		Monster[] monsters = {fairy, orc, human};
//		for(int i = 0; i < monsters.length; i++) {
//			ct.hunt(monsters[i]);
//		}
		
//		빠른 for문, 향상된 for문, forEach, ...
//		for(타입 변수 : 순서가 있는 객체){}
//		for(Monster monster : monsters) {
//			ct.hunt(monster);
//		}
		
//		int[] arData = {10, 20, 30, 40, 50, 60};
//		for(int v :arData) {
//			System.out.println(v);
//		}
		
		String[] arData2 = {"안녕", "업캐스팅", "다운캐스팅", "힘드네 오늘"};
		for(String str:arData2) {
			System.out.println(str);
		}
		
		
		
		
		
	}
}








