import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) { //행
//			for(int j=i; j<5; j++) { //열
			for(int j=0; j<5-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}