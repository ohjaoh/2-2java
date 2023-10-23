import java.util.Scanner;

public class Musium {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] seats = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		int select = 0;

		for (int i = 1; i <= seats.length; i++) {
			// 출력부분
			System.out.println("---------------");
			for (int j = 1; j <= seats.length; j++) {
				System.out.print(j + " ");
			}
			System.out.println("\n---------------");
			for (int j = 0; j < seats.length; j++) {
				System.out.print(seats[j] + " ");
			}
			System.out.println("\n---------------");

			System.out.print("원하시는 좌석번호를 입력하세요 (종료는 -1):");
			select = scan.nextInt() - 1;
			if (select > 10) {
				System.out.println("잘못된 값입력 1~10의 값입력하세요");
			}
			if (select < 0) {// 0포함 음수입력이면 종료
				System.out.println("종료");
				break;
			}
			if (seats[select] == 1) {
				System.out.println("이미 예약된 자리입니다.");
			}
			if (seats[select] == 0) {
				seats[select] = 1;
				System.out.println("예약성공!");
			}
		}
		scan.close();
	}
}