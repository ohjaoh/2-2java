import java.util.Arrays;

public class Arrays01 {
	public static void main(String[] args) {
		int[] a = new int[10];
		a[0] = 32;
		a[1] = 21;
		a[2] = 33;
		a[3] = 42;
		a[4] = 22;
		a[5] = 12;
		a[6] = 51;
		a[7] = 36;
		a[8] = 14;
		a[9] = 17;
		//sort() 메소드는 퀄정렬(Quicksort) 알고리즘을 사용함
		Arrays.sort(a);
		for(int i=0;i<10;i++) {
			System.out.println("[i="+i+"]-----["+a[i]+"]");
		}
		
	}

}
