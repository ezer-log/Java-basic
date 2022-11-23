import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		
		//1. 10/4 한 결과값을 소수점까지 출력해라
		
		double div = (double) 10/4;
		System.out.println(div);
		
		//변수 저장 안하고
		System.out.println((double)10/4);
		
		
		//2. 하나의 정수를 입력받아 그 수의 제곱을 구해라.
		Scanner s=new Scanner(System.in);
		System.out.println("정수 입력:");
		int x = s.nextInt();
		
		System.out.println(x*x);
		
		// 3. a를 4.0, b를 1.2로 초기화하여 4.0+1.2를 printf로 출력해라.
		//    실행 결과) 4.0+1.2=5.2
		
		double a=4.0, b=1.2;
		double sum = a+b;
		System.out.printf("%.1f + %.1f = %.1f\n", a, b, sum);

		//3-1. 앞에서 출력한 5.2를 소수점을 버려라.
		System.out.println((int)(a+b));
		
		// 4. Scanner클래스를 이용하여 이름, 사는 곳, 나이, 체중을 입력받고, 출력하는 프로그램 작성해라.
		
		System.out.println("입력해라:");
		
		String name = s.next();
		String city = s.next();
		int age = s.nextInt();
		double weight = s.nextDouble();
		
		System.out.println("내 이름은 " + name +"이다.");
		System.out.println("사는 곳은 " + city +"이고, 나이는 " +age+"살이다.");
		System.out.println("몸무게는 " + weight +"kg이다.");
		
		

		
	}	

}
