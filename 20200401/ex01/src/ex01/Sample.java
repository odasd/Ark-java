package ex01;
// ��Ű������ Ŭ������ ����Ϸ��� import�� �ϰ� ���� ����Ϸ��� *�� ����(����-��ȣ�� �Ϲ�Ÿ�̾�� ����̵� Ÿ�̾� ���� ��밡��)
import hyndai.Engine;
import hankook.*;// import + ��Ű���� Ŭ���� �̸�
import kumho.*;

//public�� �ٸ� ��Ű��(��𿡼���)���� ����Ҽ� �ְ� ���ְ� private�� ���� ��Ű�������� ��� ������
public class Sample {

	public static void main(String[] args) {
		SnowTire st=new SnowTire();
		hankook.Tire t =new hankook.Tire(); //�ѱ� �Ϲ�Ÿ�̾� --�ΰ��� Ŭ������ �ϳ��� ��� ����Ʈ��(�ΰ��� �ϰ������ ��Ű������ ���������)
		kumho.Tire t2=new kumho.Tire();  //��ȣ �Ϲ�Ÿ�̾� -- �̸��� Tire�� ���� ��Ű������ ��� � Ÿ�̾����� �˼� ����
		Engine e=new Engine(); //���� ����
		BigWidthTire bt=new BigWidthTire(); //��ȣ  ����̵� Ÿ�̾�
	}

}
