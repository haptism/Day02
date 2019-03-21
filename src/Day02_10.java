import java.util.Scanner;

public class Day02_10 {

	public static void main(String[] args) {

		// 급여를 입력
		// 1. 정규직 (switch case 입력하라는 뜻)
		// 의료 보험 1.2%
		// 고용 보험 0.5%
		// 산재 보험 0.3%
		// 국민 연금 2%

		// 2. 계약직
		// 원청징수 3.3%

		// 3. 일용직
		// 소개비 10%

		// 실급여를 출력

		Scanner sc = new Scanner(System.in);

		int sal = 0; // 급여를 담을 변수
		int select = 0;
		double result = 0;
		System.out.println("급여를 입력하세요");
		sal = sc.nextInt();

		System.out.println("1.정규직");
		System.out.println("2.계약직");
		System.out.println("3.일용직");
		select = sc.nextInt();

		switch (select) {
		case 1:
			result = sal - sal * 0.03;
			break;
		case 2:
			result = sal - sal * 0.033;
			break;
		case 3:
			result = sal - sal * 0.1;
			break;
		default:
		}

		System.out.println("실급여 : " + result + "원");
	}

}
