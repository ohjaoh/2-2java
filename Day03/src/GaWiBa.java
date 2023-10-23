import java.util.*;

public class GaWiBa {
	public static void main(String[] args) {
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		int input = 0;
		while (true) {
			System.out.print("가위 0, 바위 1, 보 2 종료는 -1");
			input = s.nextInt();
			if (input < 0) {
				break;
			}
			int saram = input; // 사람이 낸 가위, 바위, 보 값
			int com = r.nextInt() % 3;
			// 랜덤으로 받은 수가 음수면 양수로 전환
			if (com < 0) {
				com = com * -1;
			}
			// 가위(0), 바위(1), 보(2) 이외의 수가 입력되면 다 시 시작
			if (saram > 2) {
				System.out.println();
				continue;
			}
			// 사람이 낸결과값
			if (saram == 0) {
				System.out.println("당신은 가위를 냈습니다.");
			} else if (saram == 1) {
				System.out.println("당신은 바위를 냈습니다.");
			} else if (saram == 2) {
				System.out.println("당신은 보를 냈습니다.");
			}

			// 컴퓨터가 낸 값
			if (com == 0) {
				System.out.println("컴퓨터은 가위를 냈습니다.");
			} else if (com == 1) {
				System.out.println("컴퓨터은 바위를 냈습니다.");
			} else if (com == 2) {
				System.out.println("컴퓨터은 보를 냈습니다.");
			}
			System.out.println("-------------------------------");
			System.out.println("게임 결과: ");
			if (saram == com) {
				System.out.println("비겼다");
			} else if (saram == (com + 1) % 3) {
				System.out.println("당신이 이겼다");
			} else {
				System.out.println("당신이 졌다");
			}
			System.out.println("-------------------------------");
			System.out.println();
		}
		System.out.println("게임 종료");
	}

}
