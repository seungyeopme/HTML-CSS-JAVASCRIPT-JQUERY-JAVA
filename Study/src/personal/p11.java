package personal;
/*
class Data {int x;}

public class p11 {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d);
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);
	}
	
	static void change(Data d) {	//������ �Ű�����
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
	}

}
*/
/*
main() : x = 10
change() : x = 1000
After change(d)
main() : x = 1000
*/

//���� ������ �޸� change�޼ҵ带 ȣ���� �Ŀ� d.x�� ���� ����Ǿ���. change�޼ҵ���
//�Ű������� �������̶� ���� �ƴ϶� '���� ����� �ּ�'�� change�޼ҵ忡�� �Ѱ��־���
//������ ���� �о���� �ͻӸ� �ƴ϶� �����ϴ� �͵� �����ϴ�.