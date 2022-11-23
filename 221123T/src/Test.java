import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("정수입력:");
		//정수로 입력받아라.
		
		int n = s.nextInt();
		System.out.println("정수는 " + n);
		
		if (n%2==0) {
			System.out.println("짝수, 2의 배수이다");
		}
		else {
			System.out.println("홀수, 2의 배수가 아니다");
		}
		

	}	

}
