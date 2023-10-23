import java.util.Arrays;

public class ArrayString {
	public static void main(String[] args) {
		String[] a = new String[11];
		a[0] = "홍길동";
		a[1] = "로빈훗";
		a[2] = "이순신";
		a[3] = "정약용";
		a[4] = "이황";
		a[5] = "정우성";
		a[6] = "고현정";
		a[7] = "박명수";
		a[8] = "홍진경";
		a[9] = "이영자";
		a[10] = "이준기";
		//sort() 메소드는 퀄정렬(Quicksort) 알고리즘을 사용함
		Arrays.sort(a);
		for(int i=0;i<11;i++) {
			System.out.println("[i="+i+"]-----["+a[i]+"]");
		}
		
	}


}
