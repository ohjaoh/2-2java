import java.util.Scanner;

public class SimpleSwitch {

	public static void main(String[] args) {
		int num;
		Scanner s = new Scanner(System.in);
		System.out.print("1 ~ 3 사이의 숫자를 입력하세요");
		num = s.nextInt();
		switch(num) {
		case 1:
			System.out.println("숫자 1을 입력하셨습니다.");
			break;
		case 2:
			System.out.println("숫자 2를 입력하셨습니다.");
			break;
		case 3:
			System.out.println("숫자 3을 입력하셨습니다.");
			break;
		default:
			System.out.println("1 ~ 3사이의 숫자가 아닌 다른 수가 입력되었습니다.");
				
		}

	}

}
