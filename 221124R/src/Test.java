import java.util.Scanner;

public class Test {

	public static void main(String[] args) { 
		
		//하나씩 올라가는 for문
		for(int i=1; i<=100; i++) {
			System.out.println(i);
		}
		
		//하나씩 감소하는 for문
		for(int y=10; y>=0; y--) {
			System.out.println(y);
		}
		
		
		//1부터 100까지 for문
		for(int x=1; x<=100; x++) {
			if (x%5==0 && x%6==0) { //5와 6의 배수 둘다 해당할떄 = 30의 배수
				System.out.println(x);
			}
		}
		
	}
}