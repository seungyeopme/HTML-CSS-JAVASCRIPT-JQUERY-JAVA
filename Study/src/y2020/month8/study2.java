package y2020.month8;

import java.util.Scanner;
//�ι�° ���
/*
�� ����� ������ �Ѵ�.
1~3 ������ ������ �����ϰ� �߻����� �� ���� ���� ������ �¸� �Ѱ�.

��ü�迭�� ����.

���� ���)
�̸�: ȫ�浿
�̸�: ��浿

ȫ�浿: �����̿� �ƹ�Ű�� �Է��ض�: ee
1 0 1

��浿: �����̿� �ƹ�Ű�� �Է��ض�: ee
1 1 1

��浿�� �̱�.
*/
class game{
	public game(int ary[],int ary2[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("�÷��̾� 1 �̸� �Է�");
		String n=s.next();
		System.out.println("�÷��̾� 2 �̸� �Է�");
		String n1=s.next();

		System.out.println(n+"�����̿� �ƹ�Ű�� �Է��ض� !");
		
		for(int i=0; i<ary.length;i++) {
			int ran=(int)(Math.random()*2);
			ary[i]=ran;
			System.out.println(ary[i]);
		}

		System.out.println(n1+"�����̿� �ƹ�Ű�� �Է��ض� !");
		for(int i=0; i<ary.length;i++) {
			int ran1=(int)(Math.random()*2);
			ary2[i]=ran1;
			System.out.println(ary2[i]);
		}
		
		if(ary[0]==ary[1]&&ary[1]==ary[2]) {
			System.out.println(n+"�� �̱�");
		}else if(ary2[0]==ary2[1]&&ary2[1]==ary2[2]) {
			System.out.println(n1+"�� �̱�");
		}else {
			System.out.println("�ٰ������� ���»���� �����ϴ� ");
		}
	}
}
public class study2 {
	public static void main(String[] args) {
		
		int[] ary= new int[3];
		int[] ary2=new int[3];

		game g =new game(ary,ary2);
	}
}
/*
�÷��̾� 1 �̸� �Է�
ȫ�浿 
�÷��̾� 2 �̸� �Է�
������
ȫ�浿�����̿� �ƹ�Ű�� �Է��ض� !
1
1
1
�����������̿� �ƹ�Ű�� �Է��ض� !
1
0
0
ȫ�浿�� �̱�
*/
/*
�÷��̾� 1 �̸� �Է�
aaa
�÷��̾� 2 �̸� �Է�
bbb
aaa�����̿� �ƹ�Ű�� �Է��ض� !
0
1
1
bbb�����̿� �ƹ�Ű�� �Է��ض� !
1
1
0
�ٰ������� ���»���� �����ϴ� 
*/