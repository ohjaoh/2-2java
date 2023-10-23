import java.util.*;

public class NumberGame {
	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);

		int com, user, num = 1;

		com = ran.nextInt(100);
		while (true) {
			System.out.println("값을 입력하세요");
			user = scan.nextInt();
			if (com > user) {
				System.out.println("제시한 정수가 낮습니다.");
			} else if (user > com) {
				System.out.println("제시한 정수가 높습니다.");
			} else {
				System.out.println("정답입니다.");
				System.out.println("시도횟수: " + num);
				break;
			}
			num += 1;
		}
		scan.close();
	}

}
