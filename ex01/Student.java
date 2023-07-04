package ex01;

public class Student {
	// 필드
	private String Sno;
	private String Sname;
	private String address;
	private String dept = "컴공과";
	
	
	public String getSno() {
		return Sno;
	}
	public void setSno(String sno) {
		Sno = sno;
	}
	public String getSname() {
		return Sname;
	}
	public void setSname(String sname) {
		Sname = sname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	@Override
	public String toString() {
		return "Student [Sno=" + Sno + ", Sname=" + Sname + ", address=" + address + ", dept=" + dept + "]";
	}
	public Student(){
		
	}
	public Student(String sno, String sname, String address) {
		super();
		this.Sno = sno;
		this.Sname = sname;
		this.address = address;
	}
	
	// 생성자  // 객체를 생성 
	
	// 메소드
	
	

}
