package ex03;

public class ReportVO extends StudentVO {
	//�ʵ�
	private String month1;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private double avg;
	
	
	public String getMonth1() {
		return month1;
	}
	public void setMonth1(String month1) {
		this.month1 = month1;
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

	
}