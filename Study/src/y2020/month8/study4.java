package y2020.month8;
import java.util.Scanner;
/*
 Ŭ�������� profile�� �����ϰ� ��ü�迭�� ����Ͽ� �ڵ带 �ۼ��ض�.


���� ���) �˻��� �̸�:  ȫ�浿

          ȫ�浿�� ��ȣ�� 111-1111�Դϴ�.

          �˻��� �̸�: ��浿

          ��浿�� ����.

          �˻��� �̸�: stop

         ����
 */
class Profile{
	private String name, id;
	Profile(String name, String id) {
		this.name=name;
		this.id=id;
	}
	String getname() {
		return name;
	}
	String getid() {
		return id;
	}
}
public class study4 {
	public static void main(String[] args) {
		
		//��ü �迭�� ������ �Է¹޾Ƽ� ����
		Scanner s =new Scanner(System.in);
		System.out.println("��ü�迭 ����");
		int n=s.nextInt();

		Profile p[]=new Profile[n];
		for(int i=0;i<p.length;i++) {
			System.out.println(n+"�����̸��� ���̵� �������ּ���");
			
			String name=s.next();
			String id=s.next();
		
			p[i]=new Profile(name, id);
		}
		for(int j=0;j<p.length;j++) {
			System.out.println("�˻����̸�");
			String name1=s.next();
		
			if(p[j].getname().equals(name1)) {
				System.out.println(p[j].getname()+"��ȣ��"+p[j].getid()+"�Դϴ�");
			}else if(name1.equals("stop")) {
				System.out.println("����");
				break;
			}
			else {
				System.out.println(name1+"�� ����");
			}
		if(j==p.length){
			System.out.println("���̻� �����ϴ� �����ʹ� �����ϴ�");
			break;
		}
		}
	}
}