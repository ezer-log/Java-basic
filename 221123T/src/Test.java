
public class Test {

	public static void main(String[] args) {
		
		int a,b = 4;
		a = b++;

		System.out.println(a); //4
		System.out.println(b); //5
		
		/* 
		 <증감연산자>
		 1증가가 먼저냐, 대입이 먼저냐를 봐야한다
		 후위 연산자이기 때문에, 대입을 먼저 한 후 나중에 증가시키겠다는 뜻.
		*/
		
		int c,d = 4;
		c = ++d;
		
		System.out.println(c); //5
		System.out.println(d); //5
		
		/* 
		 전위 연산자이기 때문에, 증가 시키고 대입.
		*/
		
	}

}
