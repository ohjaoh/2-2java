public class ArgMethod2 {
	// 값1 더하기 값2 는 더하기값 입니다.
	static void add(int a, int b) {
		int c;
		c = a + b;
		System.out.println(a + " 더하기 " + b + "는 " + c + "입니다.");
	}

	public static void main(String[] args) {
		System.out.println("함수를 이용한 더하기 기능입니다.");
		add(5, 12);
		add(27, 35);

	}

}
