import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("점수 입력:");
		
		int kor = s.nextInt();
		char grade;
		
		if (kor>=90) {
			grade = 'A';
		}
		else if (kor>=80) {
			grade = 'B';
		}
		else if (kor>=70) {
			grade = 'C';
		}
		else {
			grade = 'F';
		}
		
		System.out.println("성적: " + grade);
	}
	

}
