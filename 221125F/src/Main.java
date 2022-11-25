import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
//		5. while, random()을 이용해서 (x,y)형태로 출력하는데 x+y합이 5이면 실행을 멈추는 코드를 작성. 
//		5가 아니면 난수 계속 발생시키고출력 (x,y 범위는 1부터 5까지)
		
		
		while (true) {
			int x = (int) (Math.random()*5)+1;
			int y = (int) (Math.random()*5)+1;
			
			System.out.println("(" + x + " , " + y + ")");
			
			if (x+y ==5) {
				break;
			}
		}
		
	

	}
}
