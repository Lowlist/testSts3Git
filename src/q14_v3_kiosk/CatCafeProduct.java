package q14_v3_kiosk;


public class CatCafeProduct {
	
	int price;
	String name;
	
	CatCafeProduct(int price,String name){
		this.name = name;
		this.price = price;		
	} 
	CatCafeProduct(String name,int price){
		this.name = name;
		this.price = price;		
	}
	CatCafeProduct(String name){
		this.name = name;
//		this.price = price;		
	}
	CatCafeProduct(){}

	public void info() {
		System.out.println(name+" 가격:"+price+"원");
	}




}

