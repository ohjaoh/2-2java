import java.util.Scanner;

public class Array01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] a = new int[10];
		int sum = 0;
		double avg = 0;

		for (int i = 0; i < 10; i++) {
			System.out.print(i + 1 + "번째 수를 입력하세요: ");
			a[i] = scan.nextInt();
			sum += a[i];
		}
		avg = sum / a.length;
		System.out.print("입력한 수는 ");
		for (int i = 0; i < 10; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.print("이고 평균은 " + avg + "입니다.");
		scan.close();
	}

}
