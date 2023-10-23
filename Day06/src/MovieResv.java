import java.util.InputMismatchException;
import java.util.Scanner;

public class MovieResv {

	String[][] seat = new String[5][10];

	char rn; // 열이름 (A열)
	int row_int, col, system;// 좌석 좌표 row_int->열 col -> 행 system -> 시스템작동변수
	boolean confirm; // 관리자모드 확인
	String con_char, name, c_name, row, q;
	// con_char는 yes, no확인, name는 이름변수, c_name은 이름체크변수, row는 열이름변수,
	// q는 체크박스역할
	String pw = "java"; // 관리자비밀번호

	public void Interface() {// 시작
		System.out.println("안녕하세요. 좌석 예약 시스템입니다.");
		System.out.println("번호를 선택하세요");
		System.out.println("에약(1), 취소(2), 좌석조회(3), 종료(4)");
		Scanner scan = new Scanner(System.in);
		try {
			system = scan.nextInt();
			switch (system) {
			case 0:
				Admin();
				break;
			case 1:
				Reservation();
				break;
			case 2:
				Cancel();
				break;
			case 3:
				Reference();
				break;
			case 4:
				System.out.println("시스템을 종료합니다.");
				break;
			}
		} catch (InputMismatchException e) {
			System.out.println("잘못입력하셨습니다.");
		}
	}

	public void Admin() { // 관리자진입 
		System.out.println("관리자 비밀번호를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		if (scan.nextLine().equals(pw)) {
			System.out.println("관리자 로그인 되었습니다.");
			confirm = true;
			do {
				try {
					System.out.println("취소(1), 좌석조회(2), 종료(3): ");
					system = new Scanner(System.in).nextInt();
					switch (system) {
					case 1:
						AdminCancel();
						break;
					case 2:
						AdminRef();
						break;
					case 3:
						System.out.println("관리자모드 종료");
						confirm = false;
						break;
					}
				} catch (InputMismatchException e) {
					System.out.println("잘못입력하셨습니다.");
				}
			} while (confirm);
		} else {
			System.out.println("비밀번호가 일치하지 않습니다.\n");
		}
	}

	public void Initialize() { // 빈 이름칸생성
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				seat[i][j] = "_____";
			}
		}
	}

	public void AdminRef() {// 관리자 좌석조회
		rn = 'A';
		for (int i = 0; i < 5; i++) {
			System.out.print(rn + "열 ");
			col = 1;
			rn++;
			for (int j = 0; j < 10; j++) {
				System.out.print(col + seat[i][j]);
				col++;
			}
			System.out.println();
		}
	}

	public void Reference() {// 좌석확인
		rn = 'A';
		for (int i = 0; i < 5; i++) {
			System.out.print(rn + "열 ");
			col = 1;
			rn++;
			for (int j = 0; j < 10; j++) {
				q = seat[i][j].equals("_____") ? " □ " : " ■ ";
				System.out.print(col + q);
				col++;
			}
			System.out.println();
		}
	}

	public void Reservation() { // 예약프로그램
		Reference();
		do {
			confirm = true;
			System.out.println("예약자 성함을 입력해주세요 : ");
			Scanner scan = new Scanner(System.in);
			name = scan.nextLine();
			System.out.println("예약자 성함을 확인해주세요: " + name);
			System.out.print("맞으면 Y, 틀리면 N: ");
			con_char = scan.next();
			confirm = (con_char.equals("Y")) || con_char.equals("y") ? false : true;
		} while (confirm);
		do {
			confirm = true;
			System.out.println("열을 선택하세요(A~E): ");
			Scanner scan = new Scanner(System.in);
			try {
				row = scan.next();
			} catch (Exception e) {
				System.out.println("A~E만 입력해주세요");
			}
			if (row.equals("A") || row.equals("a")) {
				row_int = 0;
				confirm = false;
			} else if (row.equals("B") || row.equals("b")) {
				row_int = 1;
				confirm = false;
			} else if (row.equals("C") || row.equals("c")) {
				row_int = 2;
				confirm = false;
			} else if (row.equals("D") || row.equals("d")) {
				row_int = 3;
				confirm = false;
			} else if (row.equals("E") || row.equals("e")) {
				row_int = 4;
				confirm = false;
			} else {
				System.out.println("A~E만 입력하세요");
			}
		} while (confirm);
		do {
			confirm = true;
			Scanner scan = new Scanner(System.in);
			try {
				System.out.println("좌석 번호를 선택해주세요. 1~10: ");
				col = scan.nextInt();
				if (col >= 1 && col <= 10) {
					if (seat[row_int][col - 1].equals("_____")) {
						seat[row_int][col - 1] = name;
						confirm = false;
					} else {
						System.out.println("이미 예약된 자리입니다.");
					}
				} else {
					System.out.println("좌석은 1~10번까지 입니다.");
				}
			} catch (Exception e) {
				System.out.println("좌석은 1~10번까지 입니다.");
			}
		} while (confirm);
		System.out.println(seat[row_int][col - 1] + "님 " + row + "열" +
		col + "번으로 예약이 완료되었습니다.");
		Reference();
	}

	public void AdminCancel() { // 관리자가 취소
		System.out.println("이름을 입력하세요");
		Scanner scan = new Scanner(System.in);
		c_name = scan.nextLine();
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				if (seat[i][j].equals(c_name)) {
					seat[i][j] = "_____";
					System.out.println(c_name + "님 취소가 완료되었습니다.");
					AdminRef();
				}
			}
		}
	}

	public void Cancel() { // 예약취소
		System.out.println("이름을 입력하세요");
		Scanner scan = new Scanner(System.in);
		c_name = scan.nextLine();
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				if (seat[i][j].equals(c_name)) {
					seat[i][j] = "_____";
					System.out.println(c_name + "님 취소가 완료되었습니다.");
					AdminRef();
				}
			}
		}
	}

	public static void main(String[] args) {// 메인
		MovieResv movie = new MovieResv();
		movie.Initialize();
		while (true) {
			movie.Interface();
			if (movie.system == 4) {
				break;
			}
		}
	}

}