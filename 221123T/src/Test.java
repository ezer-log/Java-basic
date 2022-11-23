
public class Test {

	public static void main(String[] args) {
		
		//영어 100, 국어 95점으로 초기화
		
		int eng = 100;
		int kor = 95;
		
		System.out.println(eng);
		System.out.println(kor);
		
		//실수 float 보다는 double 많이 씀
		double avg = (eng + kor)/2;
		
		System.out.println(avg); 
		
		
		/*
		 * 소수점이 나오긴 하지만 계산이 이상하다.
		 * 정수 나누기 정수를 했고,
		 * 그런 과정에서 소수점이 버려짐
		 * 
		 * 97.5가 나와야 하는데 0.5가 버려진것.
		 * 나눗셈 둘중 하나를 실수로 바꿔줘야 한다
		 */
		
		
		//1. 뒤에 나누는 숫자를 실수로 바꾸기
		double avg1 = (eng + kor)/2.0;
		System.out.println(avg1); 
		
		//2. 앞에 나눠지는 숫자를 실수로 바꾸기 (강제 타입변환)
		double avg2 = (double)(eng + kor)/2;
		System.out.println(avg2);
		
		//printf 로 출력해보기
		double avg3 = (double)(eng + kor)/2;
		System.out.printf("두 과목 평균은 %.1f점이다\n", avg3);
		System.out.println("두 과목 평균은 " +avg3 + "점이다");
		

		
		
	}	

}
