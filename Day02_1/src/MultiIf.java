import java.util.Scanner;

public class MultiIf {
	public static void main(String[] args) {
		int muge;
		Scanner scan = new Scanner(System.in);
		System.out.print("체중을 입력하세요 : ");
		muge = scan.nextInt();

		if (muge > 100) {
			System.out.println("고도비만");
		} else if (muge > 80) {
			System.out.println("비만");
		} else if (muge > 60) {
			System.out.println("표준입니다.");
		} else {
			System.out.println("미달입니다.");
		}

		System.out.println("당신의 체중은 " + muge + "킬로그램입니다.");
		scan.close();
	}

}
