import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
//		1. 숫자를 입력하여 정답 숫자 맞추는 게임
//		정답을 18로 설정
//		입력한 숫자가 정답(18)이 아닐 경우 크거나 작은지 알려준다.
//		정답을 맞출 때까지 숫자 입력을 반복하고 정답을 맞춘 후에는 시도한 횟수 출력
//		
//		실행결과)
//		숫자 입력: 25
//		25보다 작다!!
//
//		숫자 입력: 10
//		10보다 크다!!
//		
//		숫자 입력: 18
//		정답이다!!
//		
//		시도한 횟수는 3번이다.
		
		Scanner s = new Scanner(System.in);
		int answer=18;
		
		int count = 0;
		
		while(true) {
			System.out.println("숫자 입력: "); //입력을 반복해야 하니까 while문 안에다 넣어야 한다
			int n = s.nextInt();
			
			if (n==answer) {
				System.out.println("정답!!");
				count += 1;
				break;
			}
			else if (n<answer) {
				count += 1;
				System.out.println(n + "보다 크다!!");
			}
			else if (n>answer) {
				count += 1;
				System.out.println(n + "보다 작다!!");
			}
		}
		System.out.println("시도한 횟수는 " + count + "번이다."); //while문 종료 이후에
		
		
		
		
		
		
		

//		2. JDK에는JRE가 포함되는가?
//		JVM은 무엇인가?
		
		

	}
}