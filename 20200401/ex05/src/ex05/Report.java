package ex05;

import java.text.DecimalFormat;

//�л� ���������� Ŭ����
public class Report { //private���̹Ƿ� �ٸ� Ŭ�������� �����Ҽ� ���� ������ �̰��� ���� Ŭ�������� setSno�� Ű���� �Է����� �������� �����ʹ� ����Ʈ Ŭ������ �޼����  ���� �ԷµǹǷ�
					  //����Ʈ �޼����� �Ű������� String sno�� ����Ǹ� �޼����� sno�� this.sno�� ���ٴ� ���� �־� this.sno�� ��������� ����Ŭ�������� set���� �Է��� ������ �����
																				
	//�ʵ� - private�� �� ������ ������� �����Ҽ� ���� �ϱ����� private�� ��
	private String sno;
	private String sname;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private double avg;
	private char grade;//���� 90���̻� A 80���̻� B 70���̻� C 70�� �̸��̸� F
	
	//������ - �⺻ �����ڶ� ������
	
	
	//�޼���
	public String getSno() { //get�� �ҷ��ö� ���
		return sno;
	}
	public void setSno(String sno) { // set�� �Է��Ҷ� ���, String sno�� �޼����� sno�� �ǹ��� ���� ����
		this.sno = sno;					// this.sno���� this�� Ŭ������ sno��� ����(���� private���� �� sno�� �ǹ���)
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
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
	public int getTot() {
		tot=kor + eng + mat;
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public double getAvg() {
		avg=(getTot())/3.;
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public char getGrade() {
		if(getAvg()>=90) {
			grade='A';
		} else if(getAvg()>=80) {
			grade='B';
		} else if(getAvg()>=70) {
			grade='C';
		} else {
			grade='F';
		}
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	
	public void printReport() { //���η� ���
		System.out.println("��ȣ : " + sno);
		System.out.println("�̸� : " + sname);
		System.out.println("���� : " + kor);
		System.out.println("���� : " + eng);
		System.out.println("���� : " + mat);
		System.out.println("���� : " + getTot());
		System.out.println("��� : " + getAvg());
		System.out.println("���� : " + getGrade());
	}
	public void printList() { //���η� ���
		System.out.print(sno + "\t");
		System.out.print(sname + "\t");
		System.out.print(kor + "\t");
		System.out.print(eng + "\t");
		System.out.print(mat + "\t");
		System.out.print(getTot() + "\t");
		//System.out.print(getAvg() + "\t");
		//System.out.println(getGrade());
		DecimalFormat df=new DecimalFormat("###.00");
		System.out.println(df.format(getAvg()) + "\t");
		System.out.println(getGrade());
	}
	
}
