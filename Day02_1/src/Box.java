import java.util.Scanner;

public class Box {

	public static void main(String[] args) {
		double w;
		double h;
		double area;
		double perimeter;

		Scanner scan = new Scanner(System.in);

		System.out.print("사각형의 가로를 입력하세요:");
		w = scan.nextInt();
		System.out.print("사각형의 세로를 입력하세요:");
		h = scan.nextInt();
		area = w * h;
		perimeter = 2 * (w + h);
		System.out.println("넓이 : " + area);
		System.out.println(" 길이 :" + perimeter);
		
		scan.close();
		
	}

}
