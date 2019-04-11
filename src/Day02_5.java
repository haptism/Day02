import java.util.Scanner;

public class Day02_5 {

	public static void main(String[] args) {
		
		int score = 60;

		if (score >= 60) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}

		// 회원 가입 당시에 입력한 정보

		int id = 1234;
		int pw = 5678;

		// yId를 입력
		// yPw를 입력
		// 로그인 성공 출력, 로그인 실패

		Scanner sc = new Scanner(System.in);
		System.out.println("ID 입력 ");
		int yId = sc.nextInt();
		System.out.println("PW 입력 ");
		int yPw = sc.nextInt();

//		if (id == yId && pw == yPw) {
//			System.out.println("로그인 성공");
//
//		} else {
//			System.out.println("로그인 실패");
//		}

		// 단일 if문

//		String result = "로그인 실패";
//		if (id == yId && pw == yPw) {
//			result = "로그인 성공";
//			{
//				System.out.println(result);

		String result = yId == id && yPw == pw ? "로그인성공" : "로그인실패";
		System.out.println(result);

	}
}
