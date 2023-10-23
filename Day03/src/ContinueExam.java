public class ContinueExam {

	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
			if(i%2 == 1) {
				continue;
			}
			System.out.print(i + "\t");
		}
		System.out.println("\n짝수만 출력되었구나~");
		
	}

}
