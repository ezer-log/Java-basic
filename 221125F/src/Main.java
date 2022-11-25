import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
//		4. while문을 이용해서 1부터 100까지 정수 중 5의 배수의 총합을 출력
		
		int i=0;
		int total=0;
		
		while (i<=100) {
			if (i%5==0) {
				total+= i;
				i++;
			}
		}
		System.out.println(total);
	

	}
}
