//사용자에게 1~ 12까지의 월 정보를 받고 아닌경우에는 반복인 do while

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {
		int month = 1;
		Scanner s = new Scanner(System.in);

		do {
			System.out.println("월입력");
			month = s.nextInt();
		} while (month < 0 || month > 12);
		System.out.println("사용자가 입력한 값은"+month);
		s.close();
	}
}