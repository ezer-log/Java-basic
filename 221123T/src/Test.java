
public class Test {

	public static void main(String[] args) {
		
		int a=3; //변수 선언과 동시에 변수 초기화 (4byte)
		int b; //변수 선언 (4byte)
		
		b=a; //a값 3을 b에 대입 
		System.out.println(b); //3 
		
		b=b+a; //3+3
		System.out.println(b); //6 

		b+=a; //b=b+a = 6+3
		System.out.println(b);
		
	}

}
