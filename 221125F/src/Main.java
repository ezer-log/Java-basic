import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
//		3. 중첩 반복문으로 5단부터 9단까지 출력
//		
		for(int i=0; i<10; i++) {
			for (int j=5; i<=9; j++) {
				System.out.printf("%d * %d = %d", j, i, i*j);
			}
		}

	}
}
