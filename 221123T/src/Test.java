import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		/*
		 * <Scanner 클래스>
		 * 
		 * System.in 에게 키를 읽게 하고, 읽은 바이트를 문자, 정수, 실수, 불리언, 문자열 등 다양한 타임으로 변환하여 리턴
		 * Scanner a = new Scanner(System.in);
		 * 
		 * import문을 필요로 한다.
		 * import java.util.Scanner;
		 * 
		 */
		
		Scanner s = new Scanner(System.in);
		//System.in에게 키보드값을 읽게 하기 위해 Scanner객체 생성해야 함
		//클래스명 객체명 = new 클래스명
		
		System.out.println("여러분 이름 입력해주세요");
		String name = s.next(); //s는 scanner 객체
		System.out.println("내 이름은 "+ name);
		//이렇게 하면 콘솔창에 이름을 적을 수 있다!!!!!!! 엔터하면 출력됨...!!!
		//파이썬의 input 받는거랑 비슷한건가..?
		
		System.out.println("여러분 나이 입력해주세요");
		int age = s.nextInt();
		System.out.printf("내 나이는 %d살\n", age);
		
		System.out.println("여러분 키 입력해주세요");
		double height = s.nextDouble();
		System.out.println("내 키는 "+ height);
		
		Scanner s2 = new Scanner(System.in);
		System.out.println("두 정수 입력하세요");
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println(a+b);
		
	}	

}
