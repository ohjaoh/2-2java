public class Lotto {
	public static void main(String[] args) {
		// 경우의 수 = 45*44*43*42*41*40= 5864443200
		// 6! = 720, 5864443200/720 = 8145060 -:>
		// 결과가 거시기함 나중에 논리오류찾기
		int odds = 1;
		final int n = 45;
		final int k = 6;
		for (int i = 1; i < k; i++) {
			odds = odds * (n - i + 1) / i;
		}
		System.out.println("로또 1등 확률 : 1/" + odds);
	}
}