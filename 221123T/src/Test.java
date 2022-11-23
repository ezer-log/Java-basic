
public class Test {

	public static void main(String[] args) {
		
		/*
		 * <조건 연산자>
		 * 
		 * a?b:c
		 * a라는 조건이 
		 * 참이면 b
		 * 거짓이면 c
		 * 리턴됨
		 * 
		 *     조건  ?   참  : 거짓
		 * 
		 * int s = (x>y)?1:-1;
		 * 리턴값에 따라 대입됨
		 * 
		 */

		
		int a=3, b=5;
		System.out.println( (a>b) ? (a+b) : (a-b));
		
		
	}	

}
