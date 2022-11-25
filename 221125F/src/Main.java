import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		//5개 실수 입력할 배열을 생성하여
		double a[] = new double[5];
		int sum = 0;
		
		//5개 실수를 입력해 총합을 출력해라.
		for (int i=0; i<5; i++) {
			a[i] = s.nextDouble();
			sum += a[i];
		}
		System.out.println("합: "+sum);
	

	}
}
