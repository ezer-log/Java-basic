import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in); //표준 입력스트림
		
		System.out.println("정수 5개 입력");
		int sum = 0;
		
//		int n=s.nextInt(); 이걸 5번 할 필요가 없다! for문 사용하자.
		
		for(int i=0; i<5; i++) {    //횟수
			int n=s.nextInt();      //5번 입력됨
			if(n<0) {
				continue;           //다시 올라가기 때문에 sum제외. (올라가서 반복문 다시실행)
			}
			else {                  //n>=0
				sum+=n;
			}
		}
		System.out.println(sum);
		
		
		
		
		
	}
}
