package anonymousTest;

public class Starbucks {
	public void register(Form form) {
		String[] menu = form.getMenus();
		for(int i = 0; i < menu.length; i++) {
			System.out.println(i + 1 + "." + menu[i]);
		}
		
//		40분( 11:50분 -> 10분 휴식 -> 12:20분까지 )
//		스타벅스가 판매 지점을 검토, Adapter
//		무료나눔 행사 중이라면, " 무료나눔 행사 승인" 출력
//		무료나눔 행사 중이 아니라면, 판매
		if(form instanceof FormAdapter) {
			System.out.println("무료 나눔 행사 승인");
		}else if(form instanceof Form) {
			form.sell("아메리카노");
		}else {
			System.out.println("다른 지점!");
		}
		
		
		
	}
}
