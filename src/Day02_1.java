import java.util.Scanner;

public class Day02_1 {

	public static void main(String[] args) {
		int num = 10;
		int num2 = 10;
		System.out.println(num == num2);
		System.out.println(num != num2);

		double d = 10;
		System.out.println(d == num);
		String str1 = "10";
		String str2 = "10";

		// 문자열을 비교할때는 ==를 쓰지 말자

		// System.out.println(str1 == num);

		// String은 레퍼런스 타입이라 성립이 안됨

		System.out.println(str1 == str2);
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 입력");
		String str3 = sc.next();
		System.out.println(str1 == str3);
		
		System.out.println(sc);

		// String은 워낙 개발자가 많이쓰는 타입이라 프리미티브 타입으로 비교연산자를 이용하여 비교

		char ch = 'a';
		System.out.println(ch == 96);
		// 96은 int타입
		
		int n1 = 3;
		int n2 = 5;
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

	}
}
