package ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sungjuk {
	public static void run() {
		Scanner s = new Scanner(System.in);
		List<Grade> array = new ArrayList<Grade>();
		Grade g = new Grade();
		g = new Grade("2023-1", "홍길동", 90, 77, 80);
		g.setTotal(0);
		array.add(g);
		g = new Grade("2023-2", "심청이", 98, 96, 88);
		array.add(g);
		g = new Grade("2023-3", "강감찬", 89, 92, 97);
		array.add(g);
		int cnt = 3;

		boolean run = true;
		while (run) {
			System.out.println("\n*********성적관리**********");
			System.out.println("----------------------------------------");
			System.out.println("1.입력 |2.조회 |3.목록 |4.수정 |5.삭제 |0.종료");
			System.out.println("----------------------------------------");
			System.out.print("선택: ");
			String menu = s.nextLine();

			switch (menu) {

			case "1":
				g = new Grade();
				g.setNo("2023-" + (cnt + 1));
				System.out.println("학번: " + g.getNo());
				System.out.println("성적을 입력합니다.");
				g.setNo("2023" + (array.size()) + 1);
				System.out.print("이름: ");
				g.setName(s.nextLine());
				System.out.print("국어점수: ");
				g.setKor(s.nextInt());
//				g.setKor(Integer.parseInt(s.nextLine()));
				System.out.print("수학점수: ");
				g.setMat(s.nextInt());
//				g.setMat(Integer.parseInt(s.nextLine()));
				System.out.print("영어점수: ");
				g.setEng(s.nextInt());
//				g.setEng(Integer.parseInt(s.nextLine()));
				s.nextLine();
				cnt++;
				array.add(g);

				break;
			case "2": // 조회
				System.out.print("조회할 이름: ");
				String Search = s.nextLine();
				g = search(array, Search);
				if (g.getName() == null) {
					System.out.println(Search + "학생이 없습니다.");
				} else {
					g.print_port();
				}

//				for (Grade grade : array) {
//					if (Search.equals(grade.getName())) {
//						grade.setTotal(grade.getKor() + grade.getEng() + grade.getMat());
//						grade.setAvg(grade.getTotal() / 3);
//						grade.setGrade(getGrade(grade.getAvg()));
//						grade.print_port();
//					}
//				}

				break;
			case "3": // 목록
				for (Grade grade : array) {
					grade.setTotal(grade.getKor() + grade.getEng() + grade.getMat());
					grade.setAvg(grade.getTotal() / 3);
					grade.setGrade(getGrade(grade.getAvg()));
					grade.print_port();
					System.out.println("------------------------");
				}
				break;
			case "4":
				break;
			case "5":
				System.out.print("삭제할 이름을 입력하세요 : ");
				String delete = s.nextLine();
				g = search(array, delete);
				if (g.getName() == null) {
					System.out.println("학생이 없습니다.");
				} else {
					array.remove(g);
					System.out.println("삭제완료!!");
				}
				break;
			case "0":
				System.out.println("프로그램 종료");
				run = false;
				break;
			default:
				System.out.println("다시입력하세요");
			}
		}
	}

	public static String getGrade(double avg) {
		String grade = "";
		if (avg >= 90) {
			if (avg >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else if (avg >= 80) {
			if (avg >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		} else if (avg >= 70) {
			if (avg >= 75) {
				grade = "C+";
			} else {
				grade = "C";
			}
		} else if (avg >= 60) {
			if (avg >= 65) {
				grade = "D+";
			} else {
				grade = "D";
			}
		} else {
			grade = "F";
		}
		return grade;
	}

	// 검색
	public static Grade search(List<Grade> array, String name) {
		Grade vo = new Grade();
		for (Grade sch : array) {
			if (sch.getName().equals(name)) {
				sch.setTotal(sch.getKor()+sch.getMat()+sch.getEng());
				sch.setAvg(sch.getTotal()/3.);
				sch.setGrade(getGrade(sch.getAvg()));
				vo=sch;
			}
		}
		return vo;
	}
}
