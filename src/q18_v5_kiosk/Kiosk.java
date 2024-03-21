package q18_v5_kiosk;

import java.util.ArrayList;
import java.util.Scanner;

public class Kiosk {

	ArrayList<Product> amout = new ArrayList<Product>();
	Scanner sc = new Scanner(System.in);
	Product p1 = new Product("아아", 2000);
	Product p2 = new Product("뜨아", 2000);
	Product p3 = new Product("스무디", 3000);
	String cmd;

	void run() {
		start:
			while (true) {
			System.out.println("[1.음료선택/2.디저트선택/e.프로그램종료 및 계산하러가기]");
			cmd = sc.next();
			switch (cmd) {
			case "1":
				loop_1: 
					while (true) {
					p1.info();
					p2.info();
					p3.info();

					System.out.println("[1.아아/2.뜨아/3.스무디/x.이전메뉴로]");
					System.out.println("");
					cmd = sc.next();
					switch (cmd) {
					case "1":
						System.out.println("아아 선택됨");
						amout.add(p1);
						break;
						
					case "2":
						System.out.println("뜨아 선택됨");
						amout.add(p2);
						break;
						
					case "3":
						System.out.println("스무디 선택됨");
						amout.add(p3);
						break;
						
					case "x":
						System.out.println("이전 메뉴 이동");
						amout.add(p2);
						break loop_1;
					}
				}
				case "2":
					System.out.println("2번");
					break;
				case "e":
					System.out.println("프로그램종료.");
					
					int count = amout.size();
					System.out.println("장바구니에 담긴 상품갯 수"+count);

					int sum = 0;
					for(Product p : amout) {
						sum = sum + p.price;
					}
					System.out.println("계산하실 금액은 :"+sum+"원 입니다.");

					break start;
			}
		}

	}
}