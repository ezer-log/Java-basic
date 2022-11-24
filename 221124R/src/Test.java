import java.util.Scanner;

public class Test {

	public static void main(String[] args) { 

		Scanner s = new Scanner(System.in);

		System.out.print("글자 입력 : ");

		char ch = s.next().charAt(0);

		switch(ch) {

			case 'm':

				System.out.println("movie");

				break;

			case 's':	
			
				System.out.println("sing");

				break;

			case 'b':

				System.out.println("book");

				break;

			default:

				System.out.println("etc");

				break;

		}

		}

}
