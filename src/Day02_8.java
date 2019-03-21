import java.util.Scanner;

public class Day02_8 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("암호와 숫자 입력");
		int code = sc.nextInt();
		System.out.println("영어 한글자를 입력하세요");
		String str = sc.next();
		char ch = str.charAt(0);

		int sum = (char) (ch + code);
		// a -> c
		// b -> d
		// c -> e

		int temp = ch + code;

		if (temp > 122) {
			int count = temp - 122;
			count = 96 + count;
		} else {

			ch = (char) temp;
		}
		System.out.println(ch);
	}

}
