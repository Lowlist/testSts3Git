package q21_v8_kiosk;

public class Product {
	//1.변수들
	String name;
	int price;
	// 생성자함수 보통은 멤버변수에 채우는게 
	Product(String xx, int yy){
		name = xx;
		price = yy;
	}
	
	//2.함수들 (메인 말고)
	void info() {
		System.out.println("상품명:"+name+" 가격:"+price);
	}
	
}

