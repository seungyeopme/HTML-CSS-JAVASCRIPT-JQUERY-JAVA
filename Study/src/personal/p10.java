package personal;
/*
class Data {int x;}

public class p10 {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
	}
	
	static void change(int x) {	//�⺻�� �Ű�����
		x = 1000;
		System.out.println("change() : x = " + x);
	}

}
*/
/*
main() : x = 10
change() : x = 1000
After change(d.x)
main() : x = 10
*/

//change�޼ҵ忡�� main�޼ҵ�κ��� �Ѱܹ��� d.x�� ���� 1000���� �����ߴµ���
//main �޼ҵ忡���� d.x�� ���� �״���̴�.

//'d.x'�� ���� ����� ���� �ƴ϶�, change�޼ҵ��� �Ű����� x�� ���� ����� ���̴�. 
//��, ������ �ƴ� ���纻�� ����� ���̶� �������� �ƹ��� ������ ��ġ�� ���Ѵ�.
//��ó�� �⺻�� �Ű������� ������ ����� ���� ���� ���� ���� �� ������ ���� ����.