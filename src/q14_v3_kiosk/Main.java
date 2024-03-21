package q14_v3_kiosk;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("==========================");
		System.out.println("========고양이 카페!!!=======");
		System.out.println("==========================");
		CatCafeProduct p1 = new CatCafeProduct(1000,"아이스 아메리카노");
		CatCafeProduct p2 = new CatCafeProduct(1500,"뜨거운 아메리카노");
		CatCafeProduct p3 = new CatCafeProduct(5000,"마카롱");
	Scanner sc = new Scanner(System.in);
	String cmd;
	loop_a:
		while(true) {
			System.out.println("주문을 선택하세요!");
			System.out.println("[1.음료/2.디저트/e.종료]");
			cmd = sc.next();
			switch(cmd) {
			case "1":
				System.out.println("1번");
			loop_b:
				while(true) {
					System.out.println("[1.아아/2.뜨아/x.이전메뉴]");
					p1.info();
					p2.info();
					cmd = sc.next();
					switch(cmd) {
					case "1":
						System.out.println("아아를 1개 선택하셨습니다.");
						break;
					case "2":
						System.out.println("뜨아를 1개 선택하셨습니다.");
						break;
					case "x":
						System.out.println("메인 메뉴로 돌아가겠습니다.");
						break loop_b;
					}
				}
					break;
				case "2":
					System.out.println("2번");
					System.out.println("==================================");
					System.out.println("============= 디저트 리스트    =======");
					System.out.println("==================================");
					p3.info();	
					break;
				case "e":
					break loop_a;
				}
			}
			System.out.println("프로그램을 종료하겠습니다.");
	}
	
	
}