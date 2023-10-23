import java.util.Scanner;

public class MultiIf {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int muge;
		System.out.print("체중을 입력하시오.");
		muge = s.nextInt();
		
		if(muge > 100) {
			System.out.println("고도비만입니다.");
		}if(muge > 80) {
			System.out.println("비만입니다.");
		}if(muge > 60) {
			System.out.println("표준입니다.");
		}else {
			System.out.println("미달입니다.");
		}
		System.out.println("당신의 체중은"+muge+"Kg입니다.");
		
	}

}
