package y2020.month8;

import java.util.Scanner;
//ù��° ���
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
class rand {
	int d;
	String a;

	rand(String a) {
		this.a = a;
		for (int i = 0; i < a.length(); i++) {
			d = (int) (Math.random() * 3 + 1);
		}
	}
}
public class study1 {
	static int n = 1;
	static String str = "";
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		rand r[] = new rand[3];
		while (true) {

		if (n % 2 == 1) {
		str = "ȫ�浿";
		}
		if (n % 2 == 0) {
		str = "��浿";
		}
		System.out.println(str + "�����̿� �ƹ�Ű�� �Է��ض�");
		String str1 = s.next();
		
		for (int i = 0; i < 3; i++) {
			r[i] = new rand(str1);
			System.out.print(r[i].d+" ");
		}
		if(r[0].d==r[1].d&&r[0].d==r[2].d) {
			System.out.println(str+"�� �¸��ߴ�.");
			break;
		}
		n++;
		}
	}
}
/*
ȫ�浿�����̿� �ƹ�Ű�� �Է��ض�
ee
2 1 3 ��浿�����̿� �ƹ�Ű�� �Է��ض�
ee
1 3 3 ȫ�浿�����̿� �ƹ�Ű�� �Է��ض�
ee
3 2 3 ��浿�����̿� �ƹ�Ű�� �Է��ض�
ee
3 1 2 ȫ�浿�����̿� �ƹ�Ű�� �Է��ض�
ee
2 3 3 ��浿�����̿� �ƹ�Ű�� �Է��ض�
ee
1 1 3 ȫ�浿�����̿� �ƹ�Ű�� �Է��ض�
ee
1 1 3 ��浿�����̿� �ƹ�Ű�� �Է��ض�
ee
3 2 1 ȫ�浿�����̿� �ƹ�Ű�� �Է��ض�
ee
3 2 1 ��浿�����̿� �ƹ�Ű�� �Է��ض�
ee
2 3 2 ȫ�浿�����̿� �ƹ�Ű�� �Է��ض�
ee
2 1 2 ��浿�����̿� �ƹ�Ű�� �Է��ض�
ee
1 1 1 ��浿�� �¸��ߴ�.
*/