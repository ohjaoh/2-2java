import java.util.Scanner;

public class Bigger {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int first, second;
		
		
		System.out.print("첫 번째 수를 입력하시오: ");
		first = s.nextInt();
		System.out.print("두 번째 수를 입력하시오: ");
		second = s.nextInt();
		if(first > second) {
			System.out.println(first+"가 더 큽니다.");
		}else {
			System.out.println(second+"가 더 큽니다.");
		}
		s.close();
	}

}
