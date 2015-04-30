package net.hb.day30;

public class First {
	public static void main(String[] args) {
		double rate = 78.9;
		int kor;//초기값이없는데 
		final double PI = 3.1415;//상수
		final int SIZE=20 ; //상수
		final String com = "SM회사";//상수
	
		//클래스앞에 final class String {  }상속하지못함 
		kor=45;//값대입할당 변수=variable=값고정이 아니라 변경
		//PI= 6.7;상수는 값변경하면 에러발생
		//SIZE=100;
		//com="한빛ENI교육센타";
		System.out.println("국어=" + kor);
		System.out.println("크기=" + SIZE);
	}//main end
}//class END



