public class ForExam {
	public static void main(String[] args) {
		int num = 1, total = 1;
		System.out.println("5단입니다.");
		// 이중배열
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 3; j++) {
				total = num * 5;
				System.out.print("5 X " + num + " =" + total + "\t");
				num++;
			}
			System.out.println(" ");
		}
		// 교수님방식
		System.out.println("5단입니다.");
		for (int i = 1; i < 9; i++) {
			System.out.print("5 X " + i + " = " + 5 * i);
			if (i % 3 == 0) {
				System.out.print("\n");
			} else {
				System.out.print("\t");
			}
		}

	}

}
