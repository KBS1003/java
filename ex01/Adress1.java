package ex01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Adress1 {
	public static void run() {
		List<Student> array = new ArrayList<>();															//  새로운 리스트를 생성
		Student stu = new Student("20231", "홍길동", "인천 서구 경서동");										// 새로운 객체를 변수stu에 저장
		array.add(stu);																						// 배열에 저장
		stu = new Student("20232", "심청이", "인천 부평구 계산동");												// 새로운 객체 생성
		array.add(stu);
		stu = new Student("20233", "강감찬", "서울 강서구 화곡동");		
		array.add(stu);

		Scanner s = new Scanner(System.in);																	// scanner를 사용
		boolean run = true;																					// 기본 run 변수 값을 true로 지정
		int count = 3;																						// count 변수 값에 3을 지정 		

		while (run) {																						// run에 값이 ture이므로 진행ㅌ	
			System.out.println("-----------------------------");
			System.out.println("1.주소등록 | 2.주소목록 | 3.주소검색 | 4.주소수정 | 5.주소삭제 | 0.종료");
			System.out.println("-----------------------------\n");
			System.out.print("선택 : ");
			String menu = s.nextLine();
			switch (menu) {
			case "0":
				run = false;
				System.out.println("프로그램이 종료됩니다.");
				break;

			case "1":
				stu = new Student();
				stu.setSno("2023" + (array.size() + 1));
				System.out.println("학번 : " + stu.getSno());

				System.out.print("이름 : ");
				stu.setSname(s.nextLine());

				System.out.print("주소 : ");
				stu.setAddress(s.nextLine());

				array.add(stu);

				System.out.println(array.size() + "명 등록완료!");
				break;
			case "2":
				for (Student st : array) {
					System.out.println(st.toString());
				}
				break;

			case "3":
				System.out.print("검색할 이름 : ");
				String search = s.nextLine();
				boolean find = false;
				for (Student st : array) {
					if (search.equals(st.getSname())) {
						find = true;
						System.out.println(st.toString());
					}
				}
				if (!find) {
					System.out.println("존재하지 않는 학생입니다.");
				}
				break;
			case "4":
				System.out.print("수정할 이름 : ");
				String update = s.nextLine();
				find = false;
				for (Student st : array) {
					if (update.equals(st.getSname())) {
						find = true;
						System.out.println("이름 : " + st.getSname());
						System.out.println("주소 : " + st.getAddress());
						System.out.print("새로운 주소 : ");
						String newAdd = s.nextLine();
						if (newAdd != "") {
							st.setAddress(newAdd);
							System.out.println("새로운 주소로 변경되었습니다.");
						}
					}

				}
				if (!find) {
					System.out.println(update + "학생이 없습니다.");
				}
				break;
			case "5":
				System.out.print("삭제할 이름 : ");
				String delete = s.nextLine();
				find = false;
				for (Student st : array) {
					if (delete.equals(st.getSname())) {
						find = true;
						array.remove(st);
						System.out.println("삭제완료!");
						break;
					}
				}
				if (!find) {
					System.out.println(delete + "학생이 없습니다.");
				}
				break;
			default:
				System.out.println("메뉴를 다시 선택하세요.");
				break;
			}
		}
	}
}
