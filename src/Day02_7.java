import java.util.Scanner;

public class Day02_7 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("영어와 한글자를 입력하세요");
		String str = sc.next();
		char ch = str.charAt(0);

		// 입력된 글자가 대문자 인지, 소문자 인지, 알파벳이 아닙니다.

		if (ch >= 97 && ch <= 122) {
			System.out.println(ch + "는 소문자");
		} else if (ch >= 65 && ch <= 90) {
			System.out.println(ch + "는 대문자");
		} else {
			System.out.println(ch + "는 알파벳이 아닙니다");
		}

		// 아스키 코드를 이용한 예제
		// 숫자를 문자로
		// 문자를 숫자로

	}

}
