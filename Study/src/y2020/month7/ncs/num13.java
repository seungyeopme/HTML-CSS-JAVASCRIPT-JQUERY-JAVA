package y2020.month7.ncs;

import java.util.Scanner;

class Business{
	
	int id;
	String name;
	String dept;
	String addr;
	String birth;
	
	Business(){}

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
public class num13 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Business b =new Business();
		Scanner s=new Scanner(System.in);
		
		while(true) {
			
			System.out.println("<��� ���� ���� ���α׷�>");
			System.out.println("1.��� ���� ���");
			System.out.println("2.��� ���� ��ȸ ");
			System.out.println("3.���α׷� ����");
			
			int r=s.nextInt();
			switch(r) {
			
			case 1:
				System.out.println("�����ȣ�� �Է����ּ���");
				int id=s.nextInt();
				b.setId(id);
				
				System.out.println("�̸��� �Է����ּ���");
				String name=s.next();
				b.setName(name);
				
				System.out.println("�μ��� �Է����ּ���");
				String dept=s.next();
				b.setDept(dept);
				
				System.out.println("�ּҸ� �Է����ּ���");
				String addr=s.next();
				b.setAddr(addr);
				
				System.out.println("������ �Է����ּ���");
				String birth=s.next();
				b.setBirth(birth);
				
			case 2:
				System.out.println("�˻��ϰ��� �ϴ� �����ȣ��?");
				
				int c=s.nextInt();
				if(c==b.getId()) {
					System.out.println("����� "+b.getId());
					System.out.println("�̸��� "+b.getName());
					System.out.println("�μ��� "+b.getDept());
					System.out.println("�ּҴ� "+b.getAddr());
					System.out.println("������ "+b.getBirth());
				}
				break;
			case 3:
				System.out.println("���α׷� ����");
				System.exit(0);
				
			}
		}
	}
}
