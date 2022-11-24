import java.util.Scanner;

public class Test {

	public static void main(String[] args) { 
		
		int n = (int) (Math.random()*9) +4;
		//4~12까지의 수 중에서 랜덤으로 값을 뽑아냄
		
		
		//1이 뽑아지면 "one"
		//5가 뽑아지면 "five"
		//6이 뽑아지면 "six"
		
		switch(n) {
		case 1:
			System.out.println("one");
			break;
		case 5:
			System.out.println("five");
			break;
		case 6:
			System.out.println("six");
			break;
		}
		System.out.println(n);
	}

}
