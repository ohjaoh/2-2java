import java.util.Scanner;

public class Game369 {
	public static void main(String[] args) {
		int num;
		Scanner scan = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {
			System.out.println("숫자를 입력하세요");
			num = scan.nextInt();
			if (num > 100) {
				System.out.println("369는 100미만에서 실행");
			} else if (num % 3 == 0 || (num % 10) == 3 || (num / 10) == 3) {
				System.out.println("박수 짝!");
			} else {
				System.out.println(num);
			}
		}
		scan.close();
	}

}
