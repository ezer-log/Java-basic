import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in); //표준 입력스트림
		
		int sum=0, n=100;
		
		while(n!=0) { //0이 아닐때
			System.out.println("입력해라 ");
			n=s.nextInt(); //정수 입력함(0이 입력될 때까지)
			sum+=n; //sum=sum+n; //내가 입력한 수 다 더함
		}
		
		System.out.println(sum);
		
		s.close(); //닫아야지 메모리 공간 절약 가능
		
		
		
		
		
		
	}
}
