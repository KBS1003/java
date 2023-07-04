package ex01;

import java.util.Scanner;

public class test {
	public static void run() {
		Student[] students = new Student[5];
		
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		while (true) {
			System.out.println("....................................");
			System.out.println("1. 정보 입력 2. 정보 열람 3. 정보 검색 0. 종료");
			System.out.println("메뉴 입력: ");
			int menu = sc.nextInt();

			if (menu == 1) {
				Student s1 = new Student();
				
				
				System.out.print("이름 입력: ");
				s1.setSname(sc.next());
				
				System.out.print("주소 입력: ");
				s1.setAddress(sc.next());
				System.out.println();
				System.out.print("전공 입력: ");
				s1.setDept(sc.next());
				
				s1.setSno("2023"+(cnt+1));
				System.out.println("학번: "+s1.getSno());
				students[cnt] = s1;
				
				cnt++;
			} else if (menu == 2) {
				System.out.println("=====================");
				for (int i = 0; i < cnt; i++) {
					System.out.println(students[i].toString());
				}
			} else if (menu == 0) {
				break;
			}else if(menu == 3) {
//				Student s1 = new Student();
				System.out.println("찾을 이름 입력");
				String searchname = sc.next();
				boolean find = false;
				
				for(int i = 0; i<cnt; i++) {
					if(searchname.equals(students[i].getSname())) {
						System.out.println(students[i].toString());
						find = true;
					}
				}
				if(!find) {
					System.out.println("잘못된 정보입니다.");
				}
				break;
			}else {
				System.out.println("잘못된 입력입니다.");
			}
		}System.out.println("프로그램 종료");
	}
}