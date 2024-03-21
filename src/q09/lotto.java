package q09;

public class lotto {

	void run2(){
		
		int rottoP[] = {1,2,3,4,5,6}; 
		int rottoCom[] = new int[6];
		rottoCom[0] = (int)(Math.random()*45+1);
		while(true) {
			rottoCom[1] = (int)(Math.random()*45+1);
			if(rottoCom[0] != rottoCom[1]) {
				break;
			}
		}
		while(true) {
			rottoCom[2] = (int)(Math.random()*45+1);
			if(rottoCom[0] != rottoCom[2] && rottoCom[1] != rottoCom[2]) {
				break;
			}
		}
		while(true) {
			rottoCom[3] = (int)(Math.random()*45+1);
			if(rottoCom[0] != rottoCom[3] && rottoCom[1] != rottoCom[3] && rottoCom[2] != rottoCom[3]) {
				break;
			}
		}
		while(true) {
			rottoCom[4] = (int)(Math.random()*45+1);
			if(rottoCom[0] != rottoCom[4] && rottoCom[1] != rottoCom[4] && rottoCom[2] != rottoCom[4]
					&& rottoCom[3] != rottoCom[4]) {
				break;
			}
		}
		while(true) {
			rottoCom[5] = (int)(Math.random()*45+1);
			if(rottoCom[0] != rottoCom[5] && rottoCom[1] != rottoCom[5] && rottoCom[2] != rottoCom[5]
					&& rottoCom[3] != rottoCom[5] && rottoCom[4] != rottoCom[5]) {
				break;
			}
		}
		
		System.out.println("=== 당첨 번호 ===");
		System.out.print(rottoCom[0]+" ");
		System.out.print(rottoCom[1]+" ");
		System.out.print(rottoCom[2]+" ");
		System.out.print(rottoCom[3]+" ");
		System.out.print(rottoCom[4]+" ");
		System.out.print(rottoCom[5]+" ");
	
		int win = 0;
		String a = "";
		for(int i=0 ; i<6 ; i++) {
				for(int x=0 ; x<6 ; x++) {
					if(rottoP[i] == rottoCom[x]) {
						win++;
					}if(win < 2) {
						a = "꽝";
					}else if(win == 3) {
						a = "5등";
					}else if(win == 4) {
						a = "4등";
					}else if(win == 5) {
						a = "3등";
					}else if(win == 6) {
						a = "1등";
					}
				}
		}
		
		System.out.println("\n"+a);
	}
}