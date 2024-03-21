package q06Array;

public class main {
	public static void main(String[] args) {
		
		/*
		 *  배열을 만들겠다 선언. 문자열에 몇개인지
		 *  선언조건 (변수)이름[] = new (변수)[갯수]; 
		 *  
		 *  배열 선언 법 - 2.바로 값도 주는 선언(방식1)
		 *	(변수) m[] = new (변수)[] {1,2};
		 *  
		 *  배열 선언 법 - 3.바로 값도 주는 선언(방식2)
		 *	(변수) x[] = {1,2};
		 *  
		 *  		주의사항 
		 *  java script와 동일하게 0,1,2,3,4,5 순임.
		 *  문자열은 문자배열만(String) 
		 *  정수는 정수로 표기 (int,long ...etc)
		 *  ex) 1,2,3 etc...
		 *  실수는 정수를 적어도 실수처럼 표기됨 (float,double) 
		 *  ex) 1.0 2.0 3.0 etc....
		 *  
		 */ 
		
		int n[] = new int[2]; 
		System.out.println(n[1]);
		n[0]=1;
		n[1]=2;
		System.out.print(n[0]);
		System.out.println(n[1]);
		
		String s[] = new String[2]; // null 로 초기화됨.
		System.out.println(s[1]);
		s[0]="개";
		s[1]="괭이";
		System.out.print(s[0]);
		System.out.println(s[1]);
		
		System.out.println("=============");
		
		float b[] = new float[3];
		System.out.println(b[1]);
		b[0]=1;
		b[1]=2;
		b[2]=3;
		System.out.println(b[0]);
		System.out.println(b[2]);

		
		
		System.out.println("=============");
		//배열 선언 법 - 2.바로 값도 주는 선언(방식1)
		int m[] = new int[] {1,2};

		System.out.print(m[0]);
		System.out.println(m[1]);
		
		System.out.println("=============");
		//배열 선언 법 - 3.바로 값도 주는 선언(방식2)
		int x[] = {1,2};

		System.out.print(x[0]);
		System.out.print(x[1]);
	
	}
	
	
	
	
}
