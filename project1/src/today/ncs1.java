package today;

import java.util.Scanner;

class A{
	private int id;
	private String name;
	private String addr;
	private String dept;
	private String birth;
	
	A(int id, String name, String addr, String dept, String birth){}
	
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
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	
}
public class ncs1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a= new A(11,"AA","BB","CC","DD");
		Scanner s= new Scanner(System.in);
		
		while(true) {
			System.out.println("��� ���� ���α׷�");
			
			System.out.println("1.������� �Է�");
			System.out.println("2.������� ��ȸ");
			System.out.println("3.������� ����");
			
			int r= s.nextInt();
			
			switch(r) {
			
			case 1: 
				System.out.println("����� �Է����ּ���");
				int id=s.nextInt();
				a.setId(id);
			
				System.out.println("�̸��� �Է����ּ���");
				String name=s.next();
				a.setName(name);
				
				System.out.println("�ּҸ� �Է����ּ���");
				String addr=s.next();
				a.setAddr(addr);
				
				System.out.println("�μ��� �Է����ּ���");
				String dept=s.next();
				a.setDept(dept);
				
				System.out.println("������ �Է����ּ���");
				String birth=s.next();
				a.setBirth(birth);
			
			case 2:
				System.out.println("�˻��ϰ��� �ϴ� �����ȣ��?");
				int b= s.nextInt();
				
				if(b==a.getId()) {
					System.out.println("�����"+a.getId());
					System.out.println("�̸���"+a.getName());
					System.out.println("�ּҴ�"+a.getAddr());
					System.out.println("�μ���"+a.getDept());
					System.out.println("������"+a.getBirth());
				}
		
			case 3:
				System.out.println("���α׷� ����");
				System.exit(0);
			
			}
		}
	}

}
