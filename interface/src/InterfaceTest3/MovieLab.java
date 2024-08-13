package InterfaceTest3;


public class MovieLab {
	//	모든 영화는 Movie의 자식이다.
	//  checkKinds 구성
	//	markerInterface를 이용해서 각 분류마다 분류한다. 
	//	마커인터페이스는 이름뒤에 Marker를 붙인다.
	//  부모로 한 번에 매개변수로 받는다(업 캐스팅)
	//  각자 가지고 있는 메서드를 (다운 캐스팅) 출력
	
	void checkKinds(Movie[] movie) {
		for(int i = 0; i < movie.length; i++) {
			if(movie[i] instanceof ActionMarker) {
				if(movie[i] instanceof SpiderMan) {
					SpiderMan sp = (SpiderMan)movie[i];
					sp.fly();
				}else{
					CityOfCrime coc = (CityOfCrime)movie[i];
					coc.cry();
				}
			}else if(movie[i] instanceof FantasyMarker) {
				Doom doom = (Doom)movie[i];
				doom.isFantasy();
			}else if(movie[i] instanceof HorrorMarker) {
				It it = (It)movie[i];
			}else if(movie[i] instanceof RomanceMarker) {
				BeforeSunrise beforeSunrise = (BeforeSunrise)movie[i];
				beforeSunrise.tearsShower();
			}else if(movie[i] instanceof Kids){
				TinyPing kids = (TinyPing)movie[i];
				kids.broke();
			}else{
				System.out.println("다른 영화");
			}
			
		}
	}

	public static void main(String[] args) {
		MovieLab ml = new MovieLab();
		ml.checkKinds(new Movie[] {new SpiderMan(), new CityOfCrime()});
		
	}
}





















