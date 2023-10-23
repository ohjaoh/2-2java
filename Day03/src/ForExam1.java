import java.util.Scanner;

public class ForExam1 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("어디까지 계산?");
		int to = s.nextInt();
		int num = 0;
		
		for (int i = 1; i <= to; i++) {
			num += i;
		}
		System.out.println("1부터 " + to + "까지의 합은 " + num + "입니다.");
		s.close();
	}

}
