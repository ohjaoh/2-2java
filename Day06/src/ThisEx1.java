public class ThisEx1 {
	private double n;
	public void sq(double n) {
		this.n = n * n; // 제곱
		System.out.println(n + " 의 제곱은 " + this.n + " 입니다.");
	}
}
