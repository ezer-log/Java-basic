import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
//		2. 시간과 물건 개수로 금액 할인해주는 프로그램
//		(총 금액은 10만원으로 설정, 시간과물건 개수는 입력받기)
//		14시에 마트를 방문하고 물건 개수가 3개 이하이면 5%로 할인
//		18시에 마트를 방문하고 물건 개수가 5개 이하이면 10%로 할인
//		20시에 마트를 방문하고 물건 개수가 10개 이하이면 20%로 할인
		
		Scanner s = new Scanner(System.in); 
		int total = 100000;
		
		System.out.println("시간 입력:");
		int time = s.nextInt();
		System.out.println("물건 개수 입력:");
		int count = s.nextInt();
		
		if (time<=14) {
			if (count<=3) {
				total *= 0.95;
			}
		}
		else if (time<=18) {
			if (count<=5) {
				total *= 0.9;
			}
		}
		else if (time<=20) {
			if (count<=10) {
				total *= 0.8;
			}
		}
		System.out.println(total);
		
		//case-switch 사용한다면
		
//		switch(time) {
//		case 14 :
//			if (count <= 3) {
//				total *= 0.95;
//			}
//			break;
//		case 18:
//			if (count <= 5) {
//				total *= 0.9;
//			}
//			break;
//		case 20:
//			if (count <= 10) {
//				total *= 0.8;
//			}
//			break;
//		default:
//			System.out.println(total);
//		}
		
		
		
	}
}
