import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		//5개 실수 입력할 배열을 생성하여
		double a[] = new double[5];
		int sum = 0;
		
		//5개 실수를 입력해 총합을 출력해라.
		for (int i=0; i<a.length; i++) { //한계를 숫자로 지정해주기보다 배열.length
			a[i] = s.nextDouble();
			sum += a[i];
		}
		System.out.println(a.length);
		
		//길이를 변수에 저장할 수도 있음.
		int size = a.length;
		System.out.println(size);

	}
}
