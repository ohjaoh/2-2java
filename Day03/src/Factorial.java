import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		long fact = 1;
		int n;
		System.out.print("정수를 입력하시오: ");
		n = s.nextInt();
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.printf("%d!는 %d입니다.", n, fact);

	}

}
