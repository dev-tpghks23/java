package classCastingTest;

// 넷플릭스 구현

// 애니메이션, 영화, 드라마 클래스를 선언
// 사용자가 선택한 영상이
// 애니메이션이라면 "자막 지원 기능 사용" 출력
// 영화라면 "4D 기능 사용" 출력
// 드라마라면 "굿즈 기능 사용"  출력

public class castingTask1 {

	void checkVideo(Video video) {
		if(video instanceof Drama) {
			Drama drama = (Drama)video;
			drama.sellGoods();
		}else if(video instanceof Film) {
			Film film = (Film)video;
			film.shakeChair();
		}else if(video instanceof Animation) {
			Animation animation = (Animation)video;
			animation.showSubtitle();
		}
	}
	
	public static void main(String[] args) {
//  애니메이션, 영화, 드라마 각각 객체화를 시키고,
//	checkVideo로 확인!
		castingTask1 ct = new castingTask1();
		ct.checkVideo(new Drama());
		ct.checkVideo(new Film());
		ct.checkVideo(new Animation());
		
	}
}









