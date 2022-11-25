import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//2단부터 9단까지
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
				if (i%2!=0) {
					System.out.println(i*j);    
				}
				else {
					continue;       //짝수인 경우 제외
				}
				
			}
		}
		
		
	}
}
