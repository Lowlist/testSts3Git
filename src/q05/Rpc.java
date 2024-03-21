package q05;

import java.util.Scanner;

public class Rpc {

	void run() {
		while (true) {
			int n = procRps();
			if (n == 1) {
				System.out.println("게임끝!!!");
				break;
			}
		}
	}

	int procRps() {

		System.out.println("가위바위보 게임");

		int com = (int) (Math.random() * 3 + 1);

		System.out.println("가위바위보 게임!! [종료:x]");
		Scanner sc = new Scanner(System.in);
		String cmd = sc.next();

		String result = "";
		String resultCOM = "";
		
		
		switch (cmd) {
		case "가위":
			switch (com) {
			case 1:
				System.out.println("컴퓨터가 가위를 냈음");
				result = "draw";
				break;
			case 2:
				System.out.println("컴퓨터가 바위를 냈음");
				result = "lose";
				break;
			case 3:
				System.out.println("컴퓨터가 보를 냈음");
				result = "win";
				break;
			}
			break;

		case "바위":
			switch (com) {
			case 1:
				System.out.println("컴퓨터가 가위를 냈음");
				result = "win";
				break;
			case 2:
				System.out.println("컴퓨터가 바위를 냈음");
				result = "draw";
				break;
			case 3:
				System.out.println("컴퓨터가 보를 냈음");
				result = "lose";
				break;
			}

			break;

		case "보":
			switch (com) {
			case 1:
				System.out.println("컴퓨터가 가위를 냈음");
				result = "lose";
				break;
			case 2:
				System.out.println("컴퓨터가 바위를 냈음");
				result = "win";
				break;
			case 3:
				System.out.println("컴퓨터가 보를 냈음");
				result = "draw";
				break;
			}

			break;

		case "x":
			return 1;

		default:
			System.out.println("가위,바위,보 중 하나만 내주세요");
			break;
		}

		System.out.println("결과:" + result);
		return 2;
	
	}

}

