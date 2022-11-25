import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
//		1. 두 과목 점수를 입력하여 평균 출력하는 프로그램(평균은 소수점 이하 첫째자리까지 출력)
//		출력 결과) 두 과목의점수 : 70 80
//		평균 : 75.0
		
		Scanner s = new Scanner(System.in); 
		
		System.out.println("첫과목 점수 입력:");
		int a = s.nextInt();
		System.out.println("두번째과목 점수 입력:");
		int b = s.nextInt();
		
		double avg = (a+b)/2.0;
		
		System.out.printf("두 과목의 점수 : %d %d \n평균 : %.1f", a, b, avg);
		
//		System.out.println("두 과목의 점수 : " + a + " "+ b + "\n 평균 : "+avg);
		
		
		
		
		
		
		
		
		
	}
}
