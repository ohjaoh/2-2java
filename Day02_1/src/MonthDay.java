import java.util.Scanner;

public class MonthDay {
	public static void main(String[] args) {
		// 1년의 각 월의 일수를 출력하는 프로그램을 작성하자.2월으 28일
		int month;
		Scanner s = new Scanner(System.in);

		System.out.print("일수를 알고싶은 월을 입력");
		month = s.nextInt();
		System.out.print("연도를 입력하세요: ");
		int year = s.nextInt();
		switch (month) {
		case 1, 3, 5, 7, 8, 10, 12:
			System.out.println(month + "월은 31일입니다.");
			break;
		case 2:
			if (year % 400 == 0 || year % 100 != 0 && year % 4 == 0) {
				System.out.println(year + "윤년입니다. 29일입니다.");
			} else {
				System.out.println(year + "평년입니다. 28일입니다.");
			}
			break;
		case 4, 6, 9, 11:
			System.out.println(month + "월은 30일입니다.");
			break;
		default:
			break;
		}

		s.close();

	}

}
