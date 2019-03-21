import java.util.Scanner;

public class Day02_3 {
	public static void main(String[] args) {
		// 조건식 - 결과물이 boolean
		// 조건식 ? A : B;
		// 조건식이 true라면 A를 실행
		// 조건식이 false라면 B를 실행
		int num = 3;
		String result = num % 2 == 0 ? "짝수" : "홀수";
		System.out.println(result);

		Scanner sc = new Scanner(System.in);
		System.out.println("나이를 입력");
		int age = sc.nextInt();
		// 10대냐 아니냐
		// 17 20, 5
		// 나이가 10 ~ 19
		// 나이가 10살 이상이고 19살 이하

		String str = age >= 10 && age <= 19 ? "10대" : "10대가 아님";
		System.out.println(str);

	}
}
