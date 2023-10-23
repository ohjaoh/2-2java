import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		int num;
		Scanner s = new Scanner(System.in);
		System.out.print("숫자를 입력하시오: ");
		num = s.nextInt();
		if(num > 100) {
			System.out.println("369게임은 100 이하의 숫자로 운영됩니다.");
		}else if((num%3==0) || (num%10==3) || (num/10==3)) {
			System.out.println("짝!");
		}else {
			System.out.println(num);
		}
		
	}

}
