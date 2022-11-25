import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("한 문자 입력");
		
		char c = s.next().charAt(0); //c
		int n = (int)c; //입력한 한 글자를 정수로 강제 형변환
		
		//ASCII code 덕분에 글자->숫자 변환이 가능하다.
		
		System.out.println(n); // c -> 99

		for(int i=97; i<=n; i++) { //c
			System.out.println(i); //97, 98, 99 (97부터 c인 99까지 출력)
			System.out.println((char)(i)); //문자로 강제 형변환 => a, b, c
			
			for (int j=i; j<n; j++) {   //i=97~i<=100
				char ch=(char)j;        //j=97~j<100
				System.out.println(ch);
			}
			System.out.println();
		}
		
	}
}

/*
i=97일때, j= 내가 입력한 수 (n) 바로 전까지 돈다
so, i=97 일때 n=c=99 이면 97 98 이렇게 출력된다

A -> 65 : 인코딩
65 -> A : 디코딩
*/