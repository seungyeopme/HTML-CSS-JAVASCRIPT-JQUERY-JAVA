package y2020.month7.contact;

import java.util.Scanner;

public class FriendNum {

	public static void main(String[] args) {
		
		Arr ar=new Arr(5);	//��ü �迭 5��
		while(true) {
			System.out.println("A.�б� ģ�� ����");
			System.out.println("B.���� ���� ����");
			System.out.println("C.����");
			System.out.println("D.���");
			System.out.println("���� �Է�");
			
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
				System.out.println("����");
				return;
			case 'D':
				ar.all();
			}
			
		}
		
		
	}

}
