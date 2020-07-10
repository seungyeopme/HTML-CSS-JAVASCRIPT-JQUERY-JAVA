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
		System.out.println("이름 : "+name);
		System.out.println("번호 : "+phone);
	}	
}


class School extends PhoneNum{
	
	String major;
	School(String n, String p, String major){
		super(n,p);
		this.major=major;
	}
	void show() {	//오버라이딩 //부모 가지고 와서 자식에서 재정의
		super.show();	//이름, 번호
		System.out.println("전공: "+major);
	}
}

class Worker extends PhoneNum{
	
	String grade;
	Worker(String n, String p, String g){
		super(n,p);
		grade=g;
	}
	void show() {	//오버라이딩 //부모 가지고 와서 자식에서 재정의
		super.show();	//이름, 번호
		System.out.println("직급: "+grade);
	}
}