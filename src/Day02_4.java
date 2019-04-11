import java.util.Scanner;

public class Day02_4 {
	
	public static void main(String[] args) {
		
//		int age = 20;
//		if (age > 19) {
//			System.out.println("성년 입니다.");
//		}
//		System.out.println("프로그램 종료");

		// ex1
		// 기말시험
		// 국어, 영어, 수학
		// 평균이 90점 이상이면 우등상 수여

		int kor, eng, math, sum;
		double avg;

		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수 입력 : ");
		kor = sc.nextInt();

		System.out.println("영어 점수 입력 : ");
		eng = sc.nextInt();

		System.out.println("수학 점수 입력 : ");
		math = sc.nextInt();

		sum = kor + eng + math;
		avg = sum / 3.0;

		if (avg >= 90) {
			System.out.println("우등상 수여");

			if (avg >= 95) {
				System.out.println("장학금 수여");

//			} else if (avg <= 60) {
//				System.out.println("우등상 취소");
			}
		}
		System.out.println("졸업 축하합니다");
	}
}