package ex02;

public class Grade {
	private String no;
	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int total;
	private double avg;
	private String grade;

	public Grade() {

	}

	public Grade(String no, String name, int kor, int eng, int mat) {
		super();
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public void print_land() { // 성적표를 가로로 출력하는 것
		System.out.printf("%s\t%s\t%d\t%d\t%d\t%d\t%.2f\t%s\n", no, name, kor, eng, mat, total, avg, grade);
	}

	public void print_port() {
		System.out.println("학번: " + no);
		System.out.println("이름: " + name);
		System.out.println("국어: " + kor);
		System.out.println("영어: " + eng);
		System.out.println("수학: " + mat);
		System.out.println("총점: " + total);
		System.out.printf("평균:%.2f\n", avg);
		System.out.println("학점: " + grade);

	}
}
