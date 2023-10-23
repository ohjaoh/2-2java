import java.util.Scanner;

public class Forex {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = 0;
		System.out.println("반복횟수입력:");
		num = s.nextInt();
		for (int i = 0; i < num; i++) {
			System.out.println("for 문을 이용하여 반복실행됩니다.");
		}
		s.close();
	}

}
