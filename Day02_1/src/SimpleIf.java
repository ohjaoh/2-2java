import java.util.Scanner;

public class SimpleIf {

	public static void main(String[] args) {
		int num;
		Scanner  s = new Scanner(System.in);
		System.out.print("점수입력 : ");
		num=s.nextInt();
		if (num > 90) {
			System.out.println("우수한 성적입니다.");
		}
		System.out.println("당신의 점수는 " + num + "점입니다.");
		s.close();
	}

}
