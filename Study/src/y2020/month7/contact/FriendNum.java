package y2020.month7.contact;

import java.util.Scanner;

public class FriendNum {

	public static void main(String[] args) {
		
		Arr ar=new Arr(5);	//객체 배열 5개
		while(true) {
			System.out.println("A.학교 친구 정보");
			System.out.println("B.직장 동료 정보");
			System.out.println("C.종료");
			System.out.println("D.출력");
			System.out.println("문자 입력");
			
			Scanner s= new Scanner(System.in);
			char c=s.next().charAt(0);
			
			switch(c) {
			case 'A':
				ar.friend(c);
				break;
			case 'B':
				ar.friend(c);
				break;
			case 'C':
				System.out.println("종료");
				return;
			case 'D':
				ar.all();
			}
			
		}
		
		
	}

}
