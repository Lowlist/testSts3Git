package q04;

import java.util.Scanner;

public class Rpc {

	void run() {
		Scanner sc = new Scanner(System.in);
		int r = 0;
		String cmd = "";
		String result = "";
		String resultCom = "";
		String gameExit ="";

		xx: while (true) {
			System.out.println("가위바위보 게임!! [종료:x]");
			cmd = sc.next();
			r = (int) (Math.random() * 3 + 1);
			switch (cmd) {
			case "가위":
				switch(r) {
				case 1:
					result = "draw";
					resultCom = "가위";
					break;
				case 2:
					result = "lose";
					resultCom = "바위";
					break;
				case 3:
					result = "win";
					resultCom = "보";
					break;
				}
				break;
			
			case "바위":
				switch (r) {
				case 1:
					result = "win";
					resultCom = "가위";
					break;
				case 2:
					result = "draw";
					resultCom = "바위";
					break;
				case 3:
					result = "lose";
					resultCom = "보";
					break;
				}

				break;
			case "보":
				switch (r) {
				case 1:
					result = "lose";
					resultCom = "가위";
					break;
				case 2:
					result = "win";
					resultCom = "바위";
					break;
				case 3:
					result = "draw";
					resultCom = "보";
					break;
				}

				break;
			case "x":
				
				
				break xx;
			}


			{
				System.out.println("컴퓨터:"+resultCom +"\n 결과:"+result);
			}

		}

	}

}
