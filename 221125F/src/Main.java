import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in); //표준 입력스트림
		
		while(true) {
			//무한반복문 (무한루프) 멈춤 제어문자 -> break사용
			
			System.out.println("이름 입력");
			String name = s.next();
			
			//문자열비교는 "==" 사용 못하고 equals 접근연산자(.)를 통해 사용해줘야 한다.
			if(name.equals("한희")) {
				break; //무한반복문 종료
			}
			System.out.println(name);
			
		}
		
		s.close(); //닫아야지 메모리 공간 절약 가능
		
		
		
		
		
		
	}
}
