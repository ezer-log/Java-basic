
public class Test {

	public static void main(String[] args) {
		
		int age=30; //정수
		double ki=177.7; //실수
		String name="jack"; //문자열
		char grade='A'; //하나의 문자열
		
		/*
		 * 다음 중 기본타입이 아닌 것은?
		 * String! 
		 * String은 클래스에 대한 레퍼런스로, 기본 타입이 아니다
		 */
		
		System.out.println(age + ki + name + grade); //207.7jackA
		
		//나열연산자를 쓰면 숫자일때 합이 나온다. (30 + 177.7)
		
		System.out.println(age + " " + ki + name + grade); //207.7jackA
		
		// 공백을 넣어주면 따로따로 출력되긴 한다
	}	

}
