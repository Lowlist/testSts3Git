package q23_v9_kiosk;

public class Kiosk extends MenuInfo{
	//메인 키오스크 정보 출력란
	void run() {
		System.out.println("디저트 카페 ABC에 오신걸 환영합니다!!!");
		start:
			while(true) {
				System.out.println("선택해주세요[1.드링크][2.디저트][3.계산 및 프로그램종료]");
				cmd = sc.next();
				switch(cmd) {
				case "1":
					Drink.drinkinfo();
					break;
				case "2":
					Dessert.dessertinfo();
					break;
				case "3":
					Lastcash.lastcashrun();
					LastOrder_m.LastOrderrun();
					System.out.println("계산하실 금액은"+sum_all+"원 입니다.");
					break start;
				}
			}

	}
	
}
