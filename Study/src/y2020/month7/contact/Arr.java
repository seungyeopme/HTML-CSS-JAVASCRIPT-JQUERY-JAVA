package y2020.month7.contact;

import java.util.Scanner;

//2020.07.10
//study14
public class Arr {
	
	PhoneNum [] ary;	//��ü �迭
	int n;
	
	Arr(int n){	//������ �ȿ�
		ary=new PhoneNum[n];	//�迭 �����ڵ�
		n=0;
	}
	void add(PhoneNum p) {		//Ŭ���� ��ü
		ary[n++]=p;				//��ü �迭	//ģ�� �߰�
	}
	void friend(char ch) {
		Scanner s=new Scanner(System.in);
		System.out.print("�̸�");
		//�̸�, ��ȣ �߰�
		String name=s.next();
		System.out.print("��ȣ: ");
		String num=s.next();
	
		switch (ch) {
		case 'A': 
			System.out.print("����: ");
			String major=s.next();
			//PhoneNum p = new School(name,num,major)
			add(new School(name,num,major));	//�б� ģ�� �߰�
			break;
		case'B':
			System.out.print("����: ");
			String grade=s.next();
			add(new Worker(name,num,grade));	//�б� ģ�� �߰�
			break;
		}
				
			
			
		}
		void all() {
			for(int i=0; i<n;i++) {
				ary[i].show();
			}
		}
}
