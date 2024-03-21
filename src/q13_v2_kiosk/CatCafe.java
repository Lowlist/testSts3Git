package q13_v2_kiosk;

import java.util.Scanner;

public class CatCafe {

	public static void main(String[] args) {
		System.out.println("==========================");
		System.out.println("========고양이 카페!!!=======");
		System.out.println("==========================");
	
	Scanner sc = new Scanner(System.in);
	String cmd;
	loop_a:
		while(true) {
			System.out.println("주문을 선택하세요!");
			System.out.println("[1.음료/2.디저트]");
			cmd = sc.next();
			switch(cmd) {
			case "1":
				System.out.println("1번");
			loop_b:
				while(true) {
					System.out.println("[1.아아/2.뜨아/x.이전메뉴]");
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
					System.out.println("2번명령");
					break;
				case "x":
					break loop_a;
				}
			}
			System.out.println("프로그램을 종료하겠습니다.");
	}
	
}

