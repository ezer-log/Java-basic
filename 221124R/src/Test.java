import java.util.Scanner;

public class Test {

	public static void main(String[] args) { 
		
		
		//1~100중에 정수 랜덤으로 뽑기
		int n = (int) (Math.random()*99) +1;
		
		if(n%5==0)
			System.out.println("n은 5의 배수");
		else if(n%10==0)
			System.out.println("n은 10의 배수");
		else {
			System.out.println("위 조건 다 아님");
		}

	}

}