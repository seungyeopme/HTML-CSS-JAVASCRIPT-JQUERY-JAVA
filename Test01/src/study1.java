import java.util.Scanner;

public class study1 {

	public static void main(String[] args) {
		
		//sysout => control + space bar ==> System.out.println();
		
		/*
		// ����ϴ� ���α׷�
		System.out.println("�ȳ�!");	// ���ڿ�
		System.out.println("�ϼ���~");
		System.out.println("�� ���̴�"+39+"��");
		System.out.println("�ڹٴ� ��ճ׿�");
		*/
		/*
		System.out.println("�ȳ��ϼ���");
		System.out.println("���� ȫ�浿�Դϴ�");
		System.out.println("�� ���̴� 20�̰�");
		System.out.println("���￡ �ֽ��ϴ�.");
		*/
		
		/*
		// ���Ĺ��� �ʿ�!!
		//%d ����
		//%f �Ǽ�
		//%s ���ڿ� -> ū ����ǥ
		//%c �ϳ��� ���� -> ���� ����ǥ
		//\n -> enter
		System.out.printf("����: %d��\n", 10);
		System.out.printf("Ű:%.1fcm\n",176.6);
		System.out.printf("�̸�: %s\n","ȫ�浿");
		System.out.printf("����: %c\n", 'A');
	*/
		
		// 2*3=6
		// 2*4=8 -> printf
		/*
		System.out.printf("%d*%d=%d\n",2,3,6);
		System.out.printf("%d*%d=%d\n",2,4,2*4);
		*/
		
		//���ڿ��϶��� +�� ���������ڰ� �ȴ�.
		/*
		System.out.println("100"+"100");
		System.out.printf("\n");	//enter
		System.out.printf("%d\n",100+100);
		System.out.printf("%d",100);
		*/
		
		//System.out.printf("%d/%d=%.1f\n",100,200,0.5);
		
		/*
		  ����   int 		%d
		  �Ǽ�   double		%f
		  	  float
		 
		 ���ڿ�  String 	%s
		 �� ���� char 		%c
		 */
		
		//int age;	// ���� ����
		// �ڷ��� ������
		// �޸� ������ Ȯ���� �Ŀ� �ڵ� �ۼ� ����
		//1. �޸� ������ Ȯ���ϱ� ����
		//2. age��� �������� ���� ����
		
		/*
		int age = 43; // = ���Կ�����
		// ������ ���� ���ʿ� �����Ѵ�. (����)
		
		double height = 177.7; //�Ǽ�
		char grade = 'A'; // �� ����
		String name = "tom";	// ���ڿ�(�ѱ��� �̻�)
		
		//printf����ؼ� ���
		
		System.out.printf("%d\n", age);
		System.out.printf("%f\n", height);
		System.out.printf("%c\n", grade);
		System.out.printf("%s\n", name);
		*/
		
		/*
		int a=3, b=5;
		// ���� �ڷ����� �� ���ٷ� ����
		// �ٸ� �ڷ����� �� ������ ����
		int c=4; String d ="aa";
		*/
		
		/*
		int a,b;
		double c,d;
		
		//a�� ���� 100�� ����
		a = 100;
		b = a;	 //a�� b�� ����
		
		System.out.println(b);
		
		c = 111.1;	// �ʱ�ȭ: ó������ ���� �����Ҷ�
		d = c+1;
		System.out.println(d);
		*/
		
		/*
		 
		String name = "jack";
		// ���ڿ� Ŭ����
		int id=123;
		//jack id�� 123(������ ���)
		
		System.out.printf(name+" id�� "+id);
		// ���ڿ��� ������ ���� : +
		
		*/
		
		/*
		double a=1.2;
		char b='B';
		String name = "juli";
		int age=40;
		
		// juli�� 40��
		// juli �÷��� 1.2�̸� b��
		
		System.out.println(name+"�� "+age+"��");
		System.out.println(name+" �÷��� "+a+"�̸� "+b+"��");
		*/
		
		/*
		//Scanner sc = new Scanner(System.in);
		Scanner s = new Scanner(System.in);
		// Ŭ������ ��ü = new Ŭ������(System.in);
		
		System.out.println("���� ����̼���?");
		int age = s.nextInt();		// ���� �Է�
		// ������ �Է��ؼ� age�� ����
		
		// . : ���ٿ�����(����)
		System.out.println("Ű�� ������?");
		double ki = s.nextDouble();	// �Ǽ� �Է�
		
		System.out.println("�̸�����?");
		String name=s.next();	//���ڿ� �Է�
		
		System.out.println(age);
		System.out.println(ki);
		System.out.println(name);
		// ��ü ����
		// int a; double b; <==����
		// �ڷ���(int, double, char)
		// Ŭ������ 	��ü��
		// Ŭ����(String)
		// String name="jack";  ���⼭ name�� ��ü�̴�.
		*/
		
		/*
		Scanner s = new Scanner(System.in);
		//java.util�� �ؾ���.
		System.out.println("�� �� �Է��ض� ");
		
		double a = s.nextDouble();
		int b = s.nextInt();
		System.out.println(a+b);
		*/
		
		/*
		Scanner s = new Scanner(System.in);
		
		System.out.println("�����߾��?");
		boolean a = s.nextBoolean();
		System.out.println(a);
		//true or false
		// 1   or   0
		*/
		
		/*
		System.out.printf("%d\n",123);
		System.out.printf("%15d\n",123);	//            123	
		System.out.printf("%05d\n",123);	// 5�� ���� �ȿ��� ������ ����(������� ������ 0���� ä��ڴ�)
		System.out.printf("%-5d\n",123);	// 5�� ���� �ȿ��� ���� ����
		
		
		System.out.printf("%f\n",123.45);
		// �Ҽ��� ���� ° �ڸ�����
		System.out.printf("%7.1f\n",123.45);	//7�� ���� �� ���� ù° �ڸ����� ���
		System.out.printf("%7.3f\n",123.45);	//7�� ���� �ȿ��� ��° �ڸ����� ���
		*/
		
		/*
		int a = 100;
		double c=5.5;
		float b=123.45f; //f�� ����ϸ� �ڿ� f �ٿ��� �Ѵ�.
		*/
		
		/*
		int a=(int)123.45f;//�� ��ȯ
		float b=200;
		System.out.println(a);
		System.out.printf("%f",b);
		*/
		
		/*
		float a = 123.45f;
		System.out.printf("%08.3f",a); // a = 0123.450
		*/
		
		/*
		float a=123.45f, b;
		int c;
		c=(int)a; //c=123
		b=c; 	//b=123
		System.out.printf("%6.2f",b); //123.00
		*/
		
		/*
		float c= 111.1f;
		System.out.printf("%5.1f",c);
		// 111.100000
		// 111.1 (5����) (�Ҽ��� ù°�ڸ�)
		 */
		
		/*
		float c=111.1f;
		c=12.5f;
		System.out.println(c); //c=12.5
		*/
		
		/*
		int a=100, b=200;
		float result=a/b;
		System.out.printf("%f\n",result);
		*/
		
		/*
		int eng=95, kor=100;
		// ����� ����(�Ҽ��� ù°�ڸ����� ���)
		double avg = (eng+kor) /2.0 ;
		
		System.out.printf("%.1f\n",avg);		//avg = 97.5
		
		// ��, ������ ���
		System.out.println((double)eng/kor); // ��
		System.out.println(eng%kor);  // ������
		*/
		
		/*
		int a=5, b=2;
		System.out.println(a/(double)b);
		*/
		
		/*
		int a=5,b;
		
		//b=++a;  //���� 1�� ������Ų �Ŀ� b�� �־��
		//System.out.println(b);
		
		b=a++;	//������ �� ���Ŀ� 1�� �������Ѷ�.
		System.out.println(b);
		*/
		
		/* �ڽ��� �й�, �̸�, ������ ����ϴ� ���α׷�
		������)
		  �й�: 201231
		 �̸�: ȫ�浿
		 ����: A
		 
		 �Ǽ� 3.8 �Ҽ����� �����ּ���.
		*/
		
		
		/*Scanner s = new Scanner(System.in);
		System.out.println("�й��� �Է����ּ���");
		*/
		
	}
}
