public class CalTime {
	public static void main(String[] args) {
		// final은 상수 정의
		// (40e12/30e4)/(60.0*60.0*24.0*365.0)=지구에서 가장 가까운별까지 가는 시간을 계산하는 공식
		final double light_speed = 30e4;
		double distance = 40e12;
		double secs;
		secs = distance / light_speed;
		double light_year = secs / (60.0 * 60.0 * 24.0 * 365.0);
		System.out.println("지구에서 가장 가까운 별까지 걸리는 시간은 " + light_year + "광년입니다.");

	}

}
