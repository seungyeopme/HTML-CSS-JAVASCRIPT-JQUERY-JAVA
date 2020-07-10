package y2020.month7.contact;

import java.util.Scanner;

//2020.07.10
//study14
public class Arr {
	
	PhoneNum [] ary;	//객체 배열
	int n;
	
	Arr(int n){	//생성자 안에
		ary=new PhoneNum[n];	//배열 생성코드
		n=0;
	}
	void add(PhoneNum p) {		//클래스 객체
		ary[n++]=p;				//객체 배열	//친구 추가
	}
	void friend(char ch) {
		Scanner s=new Scanner(System.in);
		System.out.print("이름");
		//이름, 번호 추가
		String name=s.next();
		System.out.print("번호: ");
		String num=s.next();
	
		switch (ch) {
		case 'A': 
			System.out.print("전공: ");
			String major=s.next();
			//PhoneNum p = new School(name,num,major)
			add(new School(name,num,major));	//학교 친구 추가
			break;
		case'B':
			System.out.print("직급: ");
			String grade=s.next();
			add(new Worker(name,num,grade));	//학교 친구 추가
			break;
		}
				
			
			
		}
		void all() {
			for(int i=0; i<n;i++) {
				ary[i].show();
			}
		}
}
