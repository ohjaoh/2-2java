
public class CalTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double light_speed = 30e4;
		double distance = 40e12;
		double secs;
		secs = distance/light_speed;
		double light_year = secs/(60*60*24.0*365.0);
		
		System.out.println("걸리는 시간은 "+light_year+"입니다.");
		
	}

}
