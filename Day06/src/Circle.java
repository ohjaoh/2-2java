public class Circle {
	static double PI = 3.14;
	double r, circum, area;
	void CircleCalc(double n) {
		r = n;
		circum = 2 * PI * r;
		area = PI * r * r;
		ShowResult(this);
	}

	void ShowResult(Circle c) {
		System.out.println("반지름이 " + c.r + "인 원의 둘레는 " + c.circum + "이고 면적은" + c.area + "입니다.");
	}
}
