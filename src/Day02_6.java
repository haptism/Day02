import java.util.Scanner;

public class Day02_6 {

	public static void main(String[] args) {

		int select = 3;
		if (select == 1) {
			System.out.println("Select 1");
		} else if (select == 2) {
			System.out.println("Select 2");
		} else {
			System.out.println("Select 3");
		}

		// 국어, 영어, 수학
		// 평균
		// 평균이 90점 이상이면 A학점 출력
		// 평균이 80점 이상이면 B학점 출력
		// 평균이 70점 이상이면 C학점 출력
		// 평균이 60점 이상이면 D학점 출력
		// 그외 나머지는 F학점 출력

		int kor, eng, math, sum;
		double avg;

		boolean check = false;

		Scanner sc = new Scanner(System.in);
		System.out.println("국어 점수 : ");
		kor = sc.nextInt();

		System.out.println("영어 점수 : ");
		eng = sc.nextInt();

		System.out.println("수학 점수 : ");
		math = sc.nextInt();

		sum = kor + eng + math;
		avg = sum / 3.0;

//		int kor = 30;
//		int eng = 20;
//		imt math = 20;
//		int avg = (kor + eng + math) / 3;

		if (avg >= 90) {
			System.out.println("A");
		} else if (avg >= 80) {
			System.out.println("B");
		} else if (avg >= 70) {
			System.out.println("C");
		} else if (avg >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}
}
