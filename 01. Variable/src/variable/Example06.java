package variable;

public class Example06 {

	public static void main(String[] args) {
//		변수의 형 변환
//		형(type) 변환은 같은 형태의 값을 넣을 수 있는 변수끼리 변환하는 과정
		
		
//		short타입 변수 s에 20 값을 넣어서 초기화
//		int타입 변수 i에 20 값을 넣어서 초기화
//		long타입 변수 l에 20L 값을 넣어서 초기화
		
		byte b = 20;	//최대 127
		short s = 20;	//최대 32767
		int i = 20;		//최대 21억
		long l = 20L;	//최대 900해
		
//		byte 타입의 변수 b 에 담긴 20값을 short 타입의 변수 s 에 대입(옮겨담다)해도 short 가 더 크기 때문에 byte 에 담긴 값을 담을 수 있다.
//		자동 타입 변환
		s = b;
		i = s;
		l = i;
		
//		강제 타입 변환
		b = (byte)s;
		s = (short)i;
		i = (int)l;
		
		
		
		
	}

}
