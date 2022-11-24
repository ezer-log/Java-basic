import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		for(int i=0; i<=4; i++) { //행
//			for(int j=0; j<=i; j++) { //열
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}