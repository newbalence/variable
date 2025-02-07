package variable;

public class Example02 {
	public static void main(String[] args) {
//		변수
//		정수, 문자, 실수, 문자열, 논리
//		변수의 생성 단계
//		1. 변수의 선언
//		변수타입 변수이름
		int a;
		
//		2. 변수의 초기화
//		변수이름= 값
//		등호 오른쪽에 있는 값을 왼쪽 변수에 대입한다.
		a = 500;
		System.out.println(a);
		
//		1. 정수
//		5가지 종류의 타입이 있다.
//		1-1. byte
		byte b;
//		1byte -> 8bit
//		-128 ~ 127
		b = 20;
		System.out.println(b);
		
//		1-2. short
		short s;
//		2byte -> 16bit
//		-32768 ~ 32767
		s = 150;
		System.out.println(s);
		
//		1-3. char
		char c;
//		2byte -> 16bit
//		0 ~ 65535
		c = 66;
		System.out.println(c);
		
		c = 'C';
		System.out.println((int)c);
		
//		1-4. int
		int i;
//		4byte -> 32bit -> 2^32
//		-21억 ~ 21억
		i = 2000;
		System.out.println(i);
		
//		1-5. long
		long l;
//		8byte -> 64bit -> 2^64
//		-900해 ~ 900해
		l = 222222222222L;
		System.out.println(l);
		
		
		
	}

}
