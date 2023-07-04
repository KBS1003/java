package ex01;

import java.util.Scanner;

public class Dimension {
	public static void run() {
		String[] names = new String[22];
		String[] addressess = new String[22];
		Scanner s = new Scanner(System.in);
		boolean run = true;
		int index = 0;

		while (run) {
			System.out.println("-----------------------------");
			System.out.println("1.주소등록 | 2.주소목록 | 0.종료");
			System.out.println("-----------------------------\n");
			System.out.print("선택 : ");
			String menu = s.nextLine();
			switch (menu) {
			case "1":
				System.out.print("이름을 입력하세요 : ");
				String name = s.nextLine();
				names[index] = name;
				System.out.print("등록할 주소를 입력하세요 : ");
				String adress = s.nextLine();
				addressess[index] = adress;

				index++;
				System.out.print(index + "명 입력완료\n");
				break;

			case "2":
				System.out.println("주소목록을 출력합니다.");
				for (int i = 0; i < index; i++) {
					System.out.printf("%d\t%s\t%s\n", (i+ 1), names[i], addressess[i]);
				}
				break;

			case "0":
				run = false;
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				break;
			}
		}
	}
}
