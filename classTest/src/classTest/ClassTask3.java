package classTest;

class Market {
	String productName;
	int productPrice;
	int productStock;
	
//	기본 생성자
	public Market() {;}
	
//	초기화 생성자(productName, productPrice, productStock);
//	alt + shift + s -> o
	public Market(String productName, int productPrice, int productStock) {
		this.productName = productName;
		this.productPrice = productPrice;
		this.productStock = productStock;
	}
	
//	판매 메서드 구현하기
	void sell(Customer customer) {
		customer.money -= productPrice - productPrice * (customer.discount / 100.0);
		productStock--;
	}
}

class Customer {
	String name;	
	String phone;
	int money;
	int discount;

//	기본 생성자
	public Customer() {;}

//	초기화 생성자(name, phone, money, discount)
	public Customer(String name, String phone, int money, int discount) {
		super();
		this.name = name;
		this.phone = phone;
		this.money = money;
		this.discount = discount;
	}
}

public class ClassTask3{
	public static void main(String[] args) {
//		마켓 구현 emart ("감자", 7000, 300);
		Market emart = new Market("감자", 7000, 300);
		Customer ksh = new Customer("김세환", "01047099813", 10000, 30);
//		구매자 ksh ("김세환", "01047099813", 10000, 30);
		emart.sell(ksh);
//		출력 마트의 재고
//		출력 구매자의 남은 돈
		System.out.println(emart.productStock);
		System.out.println(ksh.money);
	}
}













