
public class Test {

	public static void main(String[] args) {
		
		int age=30; //정수
		double ki=177.7; //실수
		String name="jack"; //문자열
		char grade='A'; //하나의 문자열
		
		/*
		 * println : 줄바꿈
		 * printf :
		 * print : 줄바꿈 없이 출력
		 * 
		 * <printf 로 출력할때 쓰이는 서식문자들>
		 * 정수 %d
		 * 실수 %f, %lf
		 * 문자열 %s
		 * 문자 %c
		 */
		
		System.out.println(age + " " + ki + name + grade);
		System.out.printf("%d %f %s %c", age, ki, name, grade);

		//실수는 6자리가 기본이라 몇자리까지 하고싶은지 설정가능
		System.out.printf("%d %.2f %s %c", age, ki, name, grade);
		
	}	

}
