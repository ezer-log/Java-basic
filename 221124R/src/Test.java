import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		for (int i=0; i<10; i++) {
			
			if (i<5) {
				
				for (int j=0; j<4-i;j++) {
					System.out.print(" ");
				}
				for (int j=0; j<i+1; j++) {
					System.out.print("*");
				}
			System.out.println();
			}
			else {
				for (int j=0; j<i-5;j++) {
					System.out.print(" ");
				}
				for (int j=0; j<10-i; j++) {
					System.out.print("*");
				}
			System.out.println();
			}

	}
}
}