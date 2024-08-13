package classTask;
   
   
class SuperCarA{
//   브랜드
   String brand;
//   색상
   String color;
//   가격
   long price;
//   엔진
   boolean engine;
//   비밀번호
   String password;
//   비밀번호 오류회수
   int errorCount;
// 초기화 블럭
   {
      this.password = "0000";
   }
// 스태틱 블록 : <객체가 생성될때 무조건 1번 호출된다.>
   static {
      System.out.println("출고 축하드립니다.");
   }
   
   
   public SuperCarA() {;}
   
   public SuperCarA(String brand, String color, long price) {
      super();
      this.brand = brand;
      this.color = color;
      this.price = price;
   }


   public SuperCarA(String brand, String color, long price, String password) {
      super();
      this.brand = brand;
      this.color = color;
      this.price = price;
      this.password = password;
   }
 
//1) 시동 켜기
   SuperCarA start(SuperCarA superCar) {
      if("1234".equals(superCar.password)) {
    	  superCar.engine = true;
         System.out.println("시동 켜짐");
      }for(int i = 0; i < 2; i++) {
        System.out.println("1234".equals(superCar.password) ? "시동켜짐" : "틀림");
         }System.out.println("경찰");
         return superCar;
      }

   //문자열끼리 비교시 "ABC".equals("ABC"); 사용
//사용자가 입력한 비밀번호가 맞을 때에만 시동켜기
//연속 3회이상 실패하면 경찰 출동
   
//2) 시동끄기
//3) 비밀번호 검사
     
}

public class A {
   
   public static void main(String[] args) {
      SuperCarA sc = new SuperCarA ("소나타", "빨간색", 1000, "1234");
      
      sc.start(sc);
      
      
      
      
      
   }

}