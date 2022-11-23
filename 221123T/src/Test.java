import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("자바 점수 입력해라:");
		//정수로 입력받아라.
		
		int score = s.nextInt();
		System.out.println("자바 점수는 " + score);
		
		if (score >= 90) {
			System.out.println("합격!");
		}
		System.out.println("불합격!");
		
		
	}	

}
