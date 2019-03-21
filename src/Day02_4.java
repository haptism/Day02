import java.util.Scanner;

public class Day02_4 {
	public static void main(String[] args) {
		int age = 10;
		if (age > 19) {
			System.out.println("성년 입니다.");
		}
		System.out.println("프로그램 종료");

		// ex1
		// 기말시험
		// 국어, 영어, 수학
		// 평균이 90점 이상이면 우등상 수여

		Scanner sc1 = new Scanner(System.in);
		System.out.println("국어 점수 입력 : ");
		int kor = sc1.nextInt();

		Scanner sc2 = new Scanner(System.in);
		System.out.println("영어 점수 입력 : ");
		int eng = sc2.nextInt();

		Scanner sc3 = new Scanner(System.in);
		System.out.println("수학 점수 입력 : ");
		int math = sc3.nextInt();

		int total = kor + eng + math;
		int avg = total / 3;

		if (avg > 89) {
			System.out.println("우등상 수여");
			int num = 100;
			System.out.println(num);

			if (avg > 94) {
				System.out.println("장학금 수여");
			}
		}
		System.out.println("졸업 축하합니다");
	}

}