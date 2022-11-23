
public class Test {

	public static void main(String[] args) {
		
		String name="건용";
		int age=20;
		double ki=177.7;
		char blood='O';
		
		/*
		 * printf와 println을 이용해 출력하여라.
		 * 건용의 나이는 20살이다.
		 * 건용의 혈액형은 O형
		 */
		
		System.out.println(name+"의 나이는 " +age+ "살이다");
		System.out.printf("%s의 나이는 %d살이다\n", name, age); // "\n" 은 엔터 역할
		
		System.out.println(name + "의 나이는 " + age + "살이다. \n키는 " 
		+ ki + "cm이며 " + name +"의 혈액형은 " + blood + "형이다.");
		
		System.out.printf("%s의 나이는 %d이다.%n%s의 혈액형은 %c형%n",name,age,name,blood);
	}	

}
