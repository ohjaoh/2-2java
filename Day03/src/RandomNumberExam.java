import java.util.*;

public class RandomNumberExam {
	public static void main(String[] args) {
		Random r = new Random();
		System.out.println("난수의 개수: ");
		Scanner s = new Scanner(System.in);
		int count = s.nextInt();
		
		int sum = 0;
		for (int i = 0; i < count; i++) {
			int number = r.nextInt(100);
			sum += number;
			System.out.printf("난수 (%d)\n",number);
		}
		System.out.println("난수 " + count + "개의 합은 " + sum);
		

		s.close();
	}

}
