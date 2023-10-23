import java.util.Scanner;

public class LeapYearCheck {
	public static void main(String[] args) {
		System.out.print("연도를 입력하세요: ");
		Scanner s = new Scanner(System.in);
		int year = s.nextInt();
		if (year % 400 == 0 || year % 100 != 0 && year % 4 == 0) {
			System.out.println(year + "윤년입니다.");
		} else {
			System.out.println(year + "평년입니다.");
		}
		s.close();
	}

}
