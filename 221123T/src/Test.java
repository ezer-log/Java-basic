import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("무슨 요일이죠?");
		String day = s.next();
		
		//내가 입력한 요일을 조건으로 인식
		
		switch(day) { //입력값이 문자열
		case "수요일" :
			System.out.println("수");
			break; //break 없다면 다음 case문으로 계속 넘어감
		case "목요일" :
			System.out.println("목");
			break;
		default: //case의 값이 다 없을때 실행되는 default문
			System.out.println("수,목 아님");
			break;
		}
	}
}