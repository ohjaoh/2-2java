import java.util.Scanner;

public class BreakExam {
	public static void main(String[] args) {
		int num = 1, sum = 0, nu = 0;
		Scanner s = new Scanner(System.in);
		System.out.println("수입력");
		nu = s.nextInt();
		while (true) {
			sum += num;
			num++;
			if (num > nu) {
				break;
			}
		}
		System.out.println("1부터 총합은 " + sum);
	}

}
