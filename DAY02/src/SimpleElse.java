import java.util.Scanner;

public class SimpleElse {

	public static void main(String[] args) {
		int num;
		Scanner s = new Scanner(System.in);
		System.out.print("점수를 입력하세요: ");
		num = s.nextInt();
		if(num>90) {
			System.out.println("우수한 성적입니다.");
		}else {
			System.out.println("좀 더 노력하세요.");
		}
			System.out.println("당신의 점수는"+num+"입니다.");
		

	}

}
