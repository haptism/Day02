import java.util.Scanner;

public class Day02_11 {

	public static void main(String[] args) {
		
		// 국어, 영어, 수학 입력
		// 평균이 90점 이상이면 A
		// 평균이 80점 이상이면 B
		// 평균이 70점 이상이면 C
		// 평균이 60점 이상이면 D
		// 그 외 F

		Scanner sc1 = new Scanner(System.in);
		System.out.println("국어 점수 입력 : ");
		int kor = sc1.nextInt();

		Scanner sc2 = new Scanner(System.in);
		System.out.println("영어 점수 입력 : ");
		int eng = sc2.nextInt();

		Scanner sc3 = new Scanner(System.in);
		System.out.println("수학 점수 입력 : ");
		int math = sc3.nextInt();
		String str = null;

		int total = kor + eng + math;
		int avg = total / 3;

		switch (avg / 10) {
		case 10:
		case 9:
			str = "A";
			break;
		case 8:
			str = "B";
			break;
		case 7:
			str = "C";
			break;
		case 6:
			str = "D";
			break;
		case 5:
			str = "F";
			break;
		default:

			break;

		}

		System.out.println("학점 : " + str);

	}

}
