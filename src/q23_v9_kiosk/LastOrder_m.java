package q23_v9_kiosk;

public class LastOrder_m extends MenuInfo {
	//마지막 계산후 담아뒀던 장바구니 표기
	public static void LastOrderrun() {
		
		if(!dessert.isEmpty()) {
		for (int i = 0; i < dessert.size(); i++) {
			LastOrder.add(dessert.get(i));
		}
		}
		else {System.out.println("디저트 없음.");
		}
		
		if(!drink.isEmpty()) {
		for (int i = 0; i<drink.size(); i++) {
			LastOrder.add(drink.get(i));
			LastOrder.add(drinksize.get(i));
		}
		}
		else{System.out.println("드링크 없음.");
		}
		
		if(!LastOrder.isEmpty()) {
		for (int i = 0; i < LastOrder.size(); i++) {
			Product b = LastOrder.get(i);
			b.showbarket();
		}
		}
		else {System.out.println("주문하지않았습니다.");
		}
	}
}
