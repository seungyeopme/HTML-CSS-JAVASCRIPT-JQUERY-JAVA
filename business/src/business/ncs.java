package business;

import java.util.Scanner;
/*
business ������Ʈ�� �����Ѵ�.
business ��Ű���� �ۼ��� �� ��ü Ŭ������ �ۼ��Ѵ�.
�ٸ� Ŭ�������� ������ �Ұ����ϵ��� ���� �����ڸ� �����Ѵ�.
�� �ʵ��� Ÿ���� Ŭ���� ���̾�׷��� �����ϵ��� �Ѵ�.
�ʵ���ü�� ���ڷ� �޴� �����ڸ� �ۼ��Ѵ�.
�� �ʵ��� ���� �����ϱ� ���� setter �޼ҵ带 �ۼ��Ѵ�.
�� �ʵ��� ���� �������� ���� getter �޼ҵ带 �ۼ��Ѵ�.
while���� ����Ѵ�.
����ڿ��� �޴��� �����ְ� ����ڰ� �ܼ� �󿡼� Ư�� �޴��� �Է��Ͽ� ��û�ϸ� �ش� ��û�� ó���ϴ� ����� ������ �ִ� Ŭ������ �ۼ��ϵ��� �Ѵ�.
�޴����� �� ȭ���� �Է¹��� �� �����ϱ�
<��� ���� ���� ���α׷�>

������� �Է�
������� ���� ��ȸ
���α׷� ����
<������� �Է� ȭ���� ������ ����.>

���: 123

�̸�: ȫ�浿

�μ�: ���ߺμ�

�ּ�: ����� ��걸

����: 10/26

��������� �ԷµǾ���.

<������� ���� ��ȸ ȭ���� ������ ����>

�˻��ϰ��� �ϴ� ����� �����? 123(�Է�)

�̸�: ȫ�浿

�μ�: ���ߺμ�

�ּ�: ����� ��걸

����: 10/26

 - ���α׷� ���� ȭ���� �����α׷� ���ᡱ�� ����ϰ� �����Ų��.
*/

class sowon{
	private int id;
	private String name;
	private String dept;
	private String addr;
	private String birth;
	
	sowon(int id, String name, String dept, String addr, String birth){}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
}

public class ncs {
	public static void main(String[] args) {
		
		sowon sw=new sowon(1,"a","b","c","d");
		Scanner s=new Scanner(System.in);
		
		while(true) {
			System.out.println("<��� ���� ���� ���α׷�>");
			System.out.println("1.������� �Է�");
			System.out.println("2.������� ���� ��ȸ");
			System.out.println("3.���α׷� ����");
			
			int a = s.nextInt();
			
			switch(a) {
			
			case 1:
				System.out.println("��� �Է�");
				int id=s.nextInt();
				sw.setId(id);
				
				System.out.println("�̸� �Է�");
				String name=s.next();
				sw.setName(name);
				
				System.out.println("�μ� �Է�");
				String dept=s.next();
				sw.setDept(dept);

				System.out.println("�ּ� �Է�");
				String addr=s.next();
				sw.setAddr(addr);
				
				System.out.println("���� �Է�");
				String birth=s.next();
				sw.setBirth(birth);
			
			case 2:
				System.out.println("�˻��ϰ��� �ϴ� ����� �����? ");
				
				int b=s.nextInt();
				if(b==sw.getId()) {
					System.out.println("�̸�: "+sw.getName());
					System.out.println("�μ�: "+sw.getDept());
					System.out.println("�ּ�: "+sw.getAddr());
					System.out.println("����: "+sw.getBirth());
				}
			case 3:
				System.out.println("���α׷� ����");
				System.exit(0);
			}
		}
	}
}
