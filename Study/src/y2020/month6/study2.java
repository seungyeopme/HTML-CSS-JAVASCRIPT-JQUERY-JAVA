import java.util.Scanner;

public class study2 {

	public static void main(String[] args) {

		/*
		System.out.println((int)2.9+1.7);	// 3.7
		
		int a=3, b=3, c=3;
		a+=3;
		b*=3;
		c%=2;
		
		System.out.println(a+" "+b+" "+c);	// 6 9 1
		*/
		
		/*
		System.out.println(3>=2);
		System.out.println(3==2);
		System.out.println((3>2)&&(3>4));
		// && and �Ѵ� ���̾�� ��
		System.out.println((3!=2)||(-1>0));
		// || or �� �� �ϳ��� ���̾ ��
		*/
		
		/*
		int a=100;
		boolean b=(a!=0);
		System.out.println(b);  //true
		*/
		
		/*
		Scanner s=new Scanner(System.in);
		// ��ĳ�� ��ü ����!!!
		System.out.println("���� ������?");
		String study=s.next(); // ���ڿ� �Է��ؼ� study�� ����
		
		System.out.println("�� �ÿ� ������?");
		int time=s.nextInt();	// ���� �Է��ؼ�  time�� ����
		
		System.out.println("Ű�� ���ε�?");
		double ki=s.nextDouble();	// �Ǽ� �Է� ���� ki�� ����
		
		System.out.println("���� tv �þ�?");
		boolean y=s.nextBoolean();	// yes or no ���� y�� ����
		*/
		
		/*
		Scanner s=new Scanner(System.in); // ��ĳ�� ��ü ����
		// ����, ��ǻ������ �Է¹޾�
		System.out.println("����, ��ǻ�� ���� �Է���!");
		// �Ǽ��� ����
		double math_score = s.nextDouble();
		double com_score = s.nextDouble();
		// ��� ���
		System.out.println((math_score+com_score)/2.0);
		
		//String next();
		//boolean nextBoolean();
		*/
		
		/*
		// �ΰ� ������ �Է��Ͽ�
		// �������� ����Ͻÿ�.
		Scanner s=new Scanner(System.in);
		System.out.println("�� �� �� �Է����ּ���");
		int a = s.nextInt();
		int b = s.nextInt();
		
		System.out.println(a%b);
		*/
		
		/*
		Scanner s=new Scanner(System.in);
		System.out.println("�̸�==>");
		String name =s.next();
		System.out.println("����==>");
		int age = s.nextInt();
		System.out.println("Ű==>");
		double ki = s.nextDouble();
		
		System.out.println(name+" "+age+" "+ki);
		*/
		
		/*
		// 3���� Ű�� �Է¹޾�
		// Ű�� ��� ���(�Ҽ��� ù°�ڸ����� ���)
		Scanner s=new Scanner(System.in);
		System.out.println("Ű�� �Է����ּ���");
		double a = s.nextDouble();
		double b = s.nextDouble();
		double c = s.nextDouble();
		System.out.printf("%.1f",(a+b+c)/3);
		*/
		
		/*
		// �� ���� �Է¹޾�
		Scanner s=new Scanner(System.in);
		double a=s.nextDouble();
		double b=s.nextDouble();
		// a/b -> �Ҽ��� ����
		//System.out.println((int)a/(int)b);
		System.out.println((int)(a/b));
		*/
		
		// ���� ���̴� ( ����   )�Դϴ�.
		// �� �������� (  ����-����  )�����Դϴ�.
		// �� ��������( ���ڿ�   )�Դϴ�.
		
		/*
		System.out.printf("���� ���̴� %d�Դϴ�\n", 40);
		System.out.printf("�� �������� %d-%d�Դϴ�\n",187,4);
		System.out.printf("�� �������� %s�Դϴ�\n", "����");
		*/
		
		/*
		// 5.5 + 5.5 = 11
		System.out.printf("%.1f + %.1f = %d", 5.5,5.5,11);
		*/
		
		/*
		//24�� �Ǽ��� �����ϴ� �ڵ�
		int a = 24;
		System.out.println((double) a);
		double c = (double)a;
		System.out.println(c);
		int d =(int)c;
		System.out.println(d); // �ٽ� ������ ��ȯ
		*/
		
		/*
		int a=99;
		if(a<100) {
			System.out.println("100���� �۱���");
		}
		*/
		
		/*
		//ctrl+shift+O <IMPORT �� ����ϴ� ����Ű>
		//a�� �� ũ�� a�� b�� ������ ���� ��
		//                      ������
		Scanner s = new Scanner(System.in);
		System.out.println("���� a�� �Է����ּ���=> ");
		int a = s.nextInt();
		System.out.println("���� b�� �Է����ּ���=> ");
		int b = s.nextInt();
		
		if(a>b)
			System.out.println(a/b);
		else
			System.out.println(a%b);
		*/
		/*
		//���̸� �Է��Ͽ� �������� �ƴ��� �Ǻ��ϴ� ���Ϸ�
		Scanner s = new Scanner(System.in);
		System.out.println("���̰� ��� �Ǽ���?");
		int a = s.nextInt();
		if(a<20)
			System.out.println("������ �ƴմϴ�");
		else
			System.out.println("�����Դϴ�.");
		*/
		
		/*
		int a=0, b=0;
		
		if(a>0) {	//1��° ����
			b=1;
		}
		else if(a==0) { //2��° ����
			b=2;
		}
		else {	// 3��° ����
			b=3;
		}
		System.out.println(b);
		*/
		
		/*
		// Ű�� 187.5�̻��̰� �����԰� 80.0�̸��̸�
		// OK ���
		// �� �̿� CANCEL ���
		double ki=179.5;
		double kg=75.0;
		
		if (ki>=187.5 && kg<80.0) {
			System.out.println("OK");
		}
		else {
			System.out.println("CANCEL");
		}
		*/
		
		/*
		int a=1,b=2,c=3;
		
		if(a<b && c>b && b==2) {
			System.out.println("��");
		}
		*/
		
		/*
		Scanner s = new Scanner(System.in);
		System.out.println("ù��° ���� �Է��ϼ��� : ");
		int a = s.nextInt();
		System.out.println("����� �����ڸ� �Է��ϼ���: ");
		String c = s.next();
		System.out.println("�ι�° ���� �Է��ϼ���: ");
		int b = s.nextInt();
		
		// ���ڿ� ���� �� ���� �Լ�: equals
		if(c.equals("+")) {
			System.out.println(a+b);
			
		}
		else if (c.equals("-")) {
			System.out.println(a-b);
		}
		else if (c.equals("*")) {
			System.out.println(a*b);
		}
		else if (c.equals("/")) {
			System.out.println(a/b);
		}
		else if (c.equals("%")) {
			System.out.println(a%b);
		}
		else
			System.out.println("...");
		 */
		
		
	}

}
