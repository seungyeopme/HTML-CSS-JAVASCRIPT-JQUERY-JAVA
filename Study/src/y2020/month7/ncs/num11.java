package y2020.month7.ncs;

import java.util.Scanner;

class B{
	public int num;
	public String name;
	public String dept;
	public String addr;
	public String birth;
	
	B(int num, String name, String dept, String addr, String birth){}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
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
public class num11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B(11,"aa","bb","cc","dd");
		Scanner s=new Scanner(System.in);
		
		
		
		while(true) {
			System.out.println("<��� ���� ���� ���α׷�>");
			System.out.println("1.��� ���� ���");
			System.out.println("2.��� ���� ��ȸ ");
			System.out.println("3.���α׷� ����");
			
			int r=s.nextInt();
			switch(r) {
			case 1:
				System.out.println("����� �Է����ּ���");
				int num=s.nextInt();
				b.setNum(num);
				
				System.out.println("�̸��� �Է����ּ���");
				String name=s.next();
				b.setName(name);
				
				System.out.println("�μ��� �Է����ּ���");
				String dept=s.next();
				b.setDept(dept);
				
				System.out.println("�ּҸ� �Է��ϼ���");
				String addr=s.next();
				b.setAddr(addr);
				
				System.out.println("������ �Է��ϼ���");
				String birth=s.next();
				b.setBirth(birth);
			
			case 2:
				System.out.println("�˻��ϰ��� �ϴ� �����ȣ��?");
				int sn= s.nextInt();
				if(sn==b.getNum()) {
					System.out.println("����� "+ b.getNum());
					System.out.println("�̸��� "+ b.getName());
					System.out.println("�μ��� "+ b.getDept());
					System.out.println("�ּҴ� "+ b.getAddr());
					System.out.println("������ "+ b.getBirth());
				}
				break;
				
			case 3:
				System.out.println("���α׷� ����");
				return;
			}
		}

	}

}
