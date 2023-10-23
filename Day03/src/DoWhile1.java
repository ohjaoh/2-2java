import java.util.Scanner;

public class DoWhile1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = 0;
		System.out.println("반복할 횟수를 입력하시오");
		num = s.nextInt();
		do {
			System.out.println("do-while 문을 이용한여 반복실행 됩니다.");
			num--;
		} while (num > 0);
		s.close();

	}

}
