import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
//		1. 정수 5개 저장할 배열 만들기
		int [] = new int[5];
		
		//int a[];     = 선언
		//new int[5];  = 생성 (공간 확보). type 똑같아야 한다
		
//		2. 실수 10개 저장할 배열 만들기
		double []a = new double[10];
		//이름이 뒤쪽, 인덱스가 앞쪽에 있어도 된다. a[] = []a
		
//		3. 배열 요소 수가 세개인 int형 배열
		int a[] = new int[3];
		
//		4. 인덱스의 최대값이 4인 char형 배열
		char a[] = new char[5];
		
//		5. 정수 5개 저장할 수 있는 배열
		int ary[] = new int[5];
		
//		- 초기화
		int ary[] = {4,7,89,3,2};   //초기화 할때는 new 안붙여줘도 된다. 생성과 동시에 초기화
		System.out.println(ary[0]); //4
		
//		6. 다르게 초기화 하는 방법
		int ary[] = new int[] {4,7,89,3,2};
		
//		7. for문으로 배열 생성
		for(int i=0; i<5; i++) {
			System.out.println(ary[]);
		}
		
		
		/*
		 * 	int intArray[];    //declaring array
			intArray = new int[20];  // allocating memory to array
			OR 
			
			int[] intArray = new int[20]; // combining both statements in one
		 */
		
	}
}
