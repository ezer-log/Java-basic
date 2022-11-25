import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String str; //변수 선언
		
		do {
			System.out.println("문자열 입력:");
			str = s.next();

			if (str.equals("exit")) {
				System.out.println("프로그램 종료");
			}
			else {
				System.out.println(str);
			}

		}while(!str.equals("exit"));
		

	}
}
