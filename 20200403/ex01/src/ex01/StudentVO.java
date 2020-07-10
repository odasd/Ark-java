package ex01;

public class StudentVO { //VO = value object 이게 있으면 데이터를 넣어주는 자바빈이라고 생각하자
	private String sno;
	private String sname; //오라클 테이블 컬럼명과 같게 지정함, 헷갈리지 않게 하기위해
	private String tel;
	
	
	
	public String getSno() {
		return sno;
	}
	public void setSno(String sno) {
		this.sno = sno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
}
