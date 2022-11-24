import java.util.Scanner;

public class Test {

	public static void main(String[] args) { 
		

		Scanner s = new Scanner(System.in);
		System.out.println("몇단?");
		
		int dan = s.nextInt();
		
		for (int i=9; i>=1; i--) {
			System.out.printf("%d * %d = %d \n", dan, i, dan*i);
		}
		
	}
}