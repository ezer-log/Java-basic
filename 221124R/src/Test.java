import java.util.Scanner;

public class Test {

	public static void main(String[] args) { 
		
		//81~100중에 정수 랜덤으로 뽑기
		int score = (int) (Math.random()*20) +81;
		System.out.println(score);
		
		String grade; //변수선언 (grade)
		
		if(score>=90) {
			if(score>=95) {
				grade="A+";
			}
			else { //90점 이상이면서 95점 미
				grade="A";
			}
		}
		else {
			if(score>=85) {
				grade="B+";
			}
			else {
				grade="B";
			}
		}
		System.out.println("학점 : " +grade);
		
	}
}