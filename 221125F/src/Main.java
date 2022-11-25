import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		//실수 3개 배열 생성
		double a[] = new double[3];
		
		//for문 돌리면서 입력
		
		for(int i=0; i<3; i++) {
			a[i] = s.nextDouble();
			System.out.println(a[i]);
		}
	

	}
}
