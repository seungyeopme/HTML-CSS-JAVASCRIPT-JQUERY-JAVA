package y2020.month7.ncs;

import java.util.Scanner;

//ncs ���� ����
class Worker{
	private int id;
	private String name;
	private String dept;
	private String addr;
	private String birth;

	
	Worker(int id, String name, String dept, String addr, String birth) {}
	
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
public class num1 {
	public static void main(String[] args) {
		
		Worker w=new Worker(123,"aa","bb", "cc","dd");
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
				int id=s.nextInt();
				w.setId(id);
				
				System.out.println("�̸��� �Է����ּ���");
				String name=s.next();
				w.setName(name);
				
				System.out.println("�μ��� �Է����ּ���");
				String dept=s.next();
				w.setDept(dept);
				
				System.out.println("�ּҸ� �Է����ּ���");
				String addr=s.next();
				w.setAddr(addr);
				
				System.out.println("������ �Է����ּ���");
				String birth=s.next();
				w.setBirth(birth);
				break;
			case 2:
				System.out.println("�˻��ϰ��� �ϴ� �����ȣ��?");
				int st=s.nextInt();	//123
				if(st==w.getId()) {
					System.out.println("����� "+w.getId());
					System.out.println("�̸��� "+w.getName());
					System.out.println("�μ��� "+w.getDept());
					System.out.println("�ּҴ� "+w.getAddr());
		            System.out.println("������ "+w.getBirth());
				}
				break;
			case 3:
				System.out.println("���α׷� ����");
				return;
			}
		}	
	}
}