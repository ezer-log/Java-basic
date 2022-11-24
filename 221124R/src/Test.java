import java.util.Scanner;

public class Test {

	public static void main(String[] args) { 
		

		for(int i = 1; i <= 15; i++) {
			System.out.print("*");
			if(i%5==0) {
				System.out.println(); //별 찍은다음 enter (줄바꿈)의 역할
			}
		}
		
	}
}