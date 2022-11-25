
public class Main {

	public static void main(String[] args) {
		
		for(int i=0;i<5;i++) {
			for(int j=0;j<4-i;j++) {
				System.out.print(" ");
			}
			int n=1;
			for(int j=0;j<(2*i)+1;j++) { //개수
				System.out.print(n);
				n++; //1을 기준으로 개수만큼 하나씩 증가
			}
			System.out.println();
		}
		
		
//		for(int i = 0; i < 5; i++) {
//			for(int j = 1; j < 10; j++) {
//				System.out.print((j >= 5 - i) && (j <= 5 + i) ? "*" : " ");
//			}
//			System.out.println();
//		}
	}

}


//i*2 -1