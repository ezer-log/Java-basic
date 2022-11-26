import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		//최대값 출력
		
		int a[] = new int[5];
		int max=0;
		
		for (int i=0; i<a.length; i++) {
			a[i] = s.nextInt();
			if (max<a[i]) {
				max = a[i];
			}
		}
		System.out.println(max);


		//pull request 1
		//javajava

	}
}
