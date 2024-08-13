package anonymousTest;

public class Building {
	public static void main(String[] args) {
		Starbucks gangnam = new Starbucks();
		gangnam.register(new Form() {
			
			@Override
			public String[] getMenus() {
				return new String[] {"아메리카노", "카페라떼", "에이드", "디카페인"};
			}
			
			@Override
			public void sell(String menu) {
				String[] menus = getMenus();
				for(int i = 0; i < menus.length; i++) {
					if(menus[i].equals(menu)) {
						System.out.println(menus[i] + " 판매 완료");
						break;
					}
				}
			}
		
		});
		
//		실습
//		잠실점 오픈
//		무료나눔 행사중
		Starbucks jamsil = new Starbucks();
		jamsil.register(new FormAdapter() {
			
			@Override
			public String[] getMenus() {
				return new String[] {"아메리카노", "카페라떼", "에이드", "디카페인"};
			}
		});
	}
}






















