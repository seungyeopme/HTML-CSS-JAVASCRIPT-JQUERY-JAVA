package y2020.month7.contact;
//2020.07.10
//study14
class PhoneNum {

	String name;
	String phone;
	PhoneNum(String n, String p){
		name=n;
		phone=p;
	}
	void show() {
		System.out.println("�̸� : "+name);
		System.out.println("��ȣ : "+phone);
	}	
}


class School extends PhoneNum{
	
	String major;
	School(String n, String p, String major){
		super(n,p);
		this.major=major;
	}
	void show() {	//�������̵� //�θ� ������ �ͼ� �ڽĿ��� ������
		super.show();	//�̸�, ��ȣ
		System.out.println("����: "+major);
	}
}

class Worker extends PhoneNum{
	
	String grade;
	Worker(String n, String p, String g){
		super(n,p);
		grade=g;
	}
	void show() {	//�������̵� //�θ� ������ �ͼ� �ڽĿ��� ������
		super.show();	//�̸�, ��ȣ
		System.out.println("����: "+grade);
	}
}