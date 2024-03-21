package q23_v9_kiosk;

public class Lastcash extends MenuInfo {
    //마지막 계산 들어가는곳
	public static void lastcashrun() {
			
		for(Product a : drink) {
			sum_dr = sum_dr + a.price;
		}
		
		for(Product b : drinksize){
			sum_ds = sum_ds + b.price;
		}
		
		for(Product c : dessert) {
			sum_de = sum_de + c.price;
		}
		
		sum_all = sum_dr + sum_ds + sum_de;
		
		}	
	
	}
