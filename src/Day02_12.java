import java.util.Scanner;

public class Day02_12 {
	public static void main(String[] args) {

		/*
		 * Scanner sc = new Scanner(System.in); System.out.println("몇번 출력 할까요?");
		 * 
		 * int count = sc.nextInt(); int i = 0; for (i = 0; i < count; i++) {
		 * System.out.println("Qu"); System.out.println("King"); }
		 * 
		 * System.out.println(i);
		 */

		/*
		 * int i = 2;
		 * 
		 * while (i < 10) { int j = 1; while (j < 10) {
		 * 
		 * System.out.print(i + "*" + j + "=" + i * j); System.out.print("\t"); j++; }
		 * 
		 * System.out.println(); i++;
		 */

		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {

				System.out.print(i + "*" + j + "=" + i * j);
				System.out.print("\t");

			}
			System.out.println();

			// 1부터 100사이의 숫자 중애서
			// 1, 10, 5, 7, 9...출력
			// 1. if를 사용
			// 2.if를 사용 하지 않고

			for (i = 0; i < 101; i += 2) {
				if (i % 2 != 0) {
					System.out.println(i);

				}

			}
		}
	}
}
