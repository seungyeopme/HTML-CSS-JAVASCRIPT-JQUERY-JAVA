import java.util.Scanner;

public class study3 {

	public static void main(String[] args) {
		
		/*
		//���� 70��, ���� 80��, ���� 90������ �ʱ�ȭ�ؼ� ������ ������ ������ ���
		double kor = 70, eng = 80, mat = 90;
		
		System.out.printf("����: %.1f\n����: %.1f\n����: %.1f\n", kor, eng, mat);
		System.out.printf("����: %.1f", kor+eng+mat);
		*/
		
		/*
		// 2*3=6
		// 2*4=8 ��� printf��
		System.out.printf("%d*%d=%d\n",2,3,6);
		System.out.printf("%d*%d=%d\n",2,3,2*4);
		*/
		
		// �� ������ �Է¹޾� ���� ���Ͽ� ����ϴ� ���α׷�
		/*
		Scanner s = new Scanner(System.in);
		System.out.println("���� a���� �Է����ּ���=>");
		int a = s.nextInt();
		System.out.println("���� b���� �Է����ּ���=>");
		int b = s.nextInt();
		System.out.println("���� a+b =>");
		System.out.println(a+b);
		*/
		
		/*
		Scanner s = new Scanner(System.in);
		System.out.println("�� ���� �Է�");
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println(a+b);
		System.out.printf("%.2f", (a+b)/2.0);
		
		// �� ������ �Է¹޾� ��� ����ϴ� ���α׷�
		Scanner sa = new Scanner(System.in);
		double c = sa.nextDouble();
		double d = sa.nextDouble();
		System.out.println((c+d)/2);
		*/
		

//1.	10/4 �� ������� �Ҽ������� ����ض�
		/*
		double a = 10, b = 4;
		System.out.printf("10 ������ 4�� �����:%.1f",a/b);
		
		//System.out.println(10/4.0);
		*/
		
//2.	�ϳ��� ������ �Է¹޾� �� ���� ������ ���ض�.
		/*
		Scanner s = new Scanner(System.in);
		System.out.println("�ϳ��� ������ �Է����ּ���");
		int a = s.nextInt();
		System.out.printf("�Է��� ���� ������ �����:%d", a*a);
		*/
		
//3. 	a�� 4.0, b�� 1.2�� �ʱ�ȭ�Ͽ� 4.0+1.2�� printf�� ����ض�.
//		���� ���) 4.0+1.2=5.2
		/*
		double a = 4.0 , b = 1.2;
		System.out.printf("%.1f+%.1f=%.1f",a,b,a+b);
		*/
		
//3-1.  �տ��� ����� 5.2�� �Ҽ����� ������. 
		/*
		double c = 5.2;
		System.out.println((int)c);
		*/

//4.	ScannerŬ������ �̿��Ͽ� �̸�, ��� ��, ����, ü���� �Է¹ް�, ����ϴ� ���α׷� �ۼ��ض�.
//		���� ���) �Է��ض�: kim seoul 29 65.5
//        �� �̸��� kim�̴�.
//        ��� ���� seoul�̰�, ���̴� 29���̴�.
//        �����Դ� 65.5kg�̴�.
		/*
		Scanner s = new Scanner(System.in);
		
		System.out.println("�̸��� �Է����ּ���=> ");
		String name = s.next();
		System.out.println("�� �̸��� "+name+"�̴�");
		
		System.out.println("��� ���� �Է����ּ���=> ");
		String address = s.next();
		System.out.println("��� ���� "+address+"�̴�");
		
		
		System.out.println("ü���� �Է����ּ���=> ");
		double weight = s.nextDouble();
		System.out.println("�� ü���� "+weight+"�̴�");
		*/
		
		/*
		// �������� �̸�, ����, Ű, ������ �ʱ�ȭ�ؼ� printf�� ���
		String name = "sy";
		int age=20;
		double ki = 171.1;
		char blood = 'A';
		
		System.out.printf("%s %d %.1f %c", name, age, ki, blood);
		//System.out.println("�̸��� "+name+" Ű�� "+ki+" �������� "+blood+"�Դϴ�.");
		*/
		
		/*
		// 6 + 2.5 �� ��� ���� 1)�Ҽ��� ������ 2)�ݿø�
		//double a =6, b=2.5;
		//System.out.printf("1)�Ҽ��� ������=>%.1f+%.1f=%f\n",a,b,a+b);
	 
	    System.out.println((int)(6+2.5));
	    System.out.println(8.5+0.5);
	    */
		
		/*
		int a=10,b=4;
		if(a==10) {
			System.out.println("A");
		}
		else if(a<b) {
			System.out.println("B");
		}
		else if(a>b) {
			System.out.println("C");
		}
		*/
		
		/*
		Scanner s = new Scanner(System.in);
		System.out.println("���� �Է���!");
		int kor= s.nextInt();
		char grade;
		
		if(kor>90)
		{
			grade = 'A';
		}
		else if(kor>=80) {
			grade = 'B';
		}
		else if(kor>=70) {
			grade = 'C';
		}
		else 
			grade = 'F';
		
		System.out.println("����: "+grade);
		*/
		
		/*
		int a=20,b=10;
		
		if (a>10) {
			if(b>=0) {
				b=1;
			}
			else {
				b=-1;
			}
		}
		System.out.println(a+ " " +b);
		*/
		
		/*
		int age = 25, kg = 60;
		char size;
		
		if(age<20) {
			if(kg<50) {
				size = 'S';
			}
			else if(kg<60) {
				size = 'M';
			}
			else 
				size='L';
		}
		else {	//age>=20
			if(kg<60)
				size='S';
			else if(kg<70) {
				size='M';
			}
			else {
				size='L';
			}
			
		}
		System.out.println(size);
		*/
		
		/*
		//�� ������ ������ 300�� ��, ���� ���ǿ� ���� ��� ���� ����ض�
		//����� 90�� �̻��̸� A
		//     90�� �̸� 80�� �̻��̸� B
		//     80�� �̸� 70�� �̻��̸� C
		//     �� �̿� F
		int total = 300;
		double avg = 300/3.0;
		
		if(avg>=90) {
			System.out.println("A");
		}
		else if(avg>=80) {
			System.out.println("B");
		}
		else if(avg>=70) {
			System.out.println("C");
		}
		else {
			System.out.println("F");
		}
		*/
		
		/*
		Scanner s= new Scanner(System.in);
		System.out.println("���� ��������?");
		String day=s.next();
		
		//���� �Է��� ���� �������� �ν�
		switch(day) {
		case "�����":
			System.out.println("��");
			break;
		case "�ݿ���":
			System.out.println("��");
			break;
		default:
			System.out.println("��, �� �ƴ�");
			break;
		}
		*/
		
		//������ A,B�̸� "Excellent", C,D�̸� "Good", F�̸� "Bad"��� ���
		/*
		Scanner s= new Scanner(System.in);
		System.out.println("������ �Է����ּ���!");
		String score = s.next();
		
		switch(score) {
		case "A":
			System.out.println("Excellent");
			break;
		case "B":
			System.out.println("Excellent");
			break;
		case "C":
			System.out.println("Good");
			break;
		case "D":
			System.out.println("Good");
			break;
		default:
			System.out.println("Bad");
		}
		*/
		/*
		Scanner s= new Scanner(System.in);
		System.out.println("������ �Է��ض�");
		String grade=s.next();
		
		switch(grade) {
		case "A":
		case "B":
			System.out.println("Excellent");
			break;
		case "C":
		case "D":
			System.out.println("Good");
			break;
		case "F":
			System.out.println("F");
			break;
		}
		*/
		
		/*
		Scanner s= new Scanner(System.in);
		System.out.println("������ �Է��ض�");
		char grade=s.next().charAt(0);
		//next() ���ڿ���
		switch(grade) {
		case 'A':
		case 'B':
			System.out.println("Excellent");
			break;
		case 'C':
		case 'D':
			System.out.println("Good");
			break;
		case 'F':
			System.out.println("F");
			break;
		}
		*/
		
		// switch~case���� ����ؼ� ������ �Է¹޾� m�Է��ϸ� movie, s�Է��ϸ� sing, b �Է��ϸ� book,
		// �������� etc�� ���
		
		/*
		Scanner s = new Scanner(System.in);
		System.out.println("��ȭ�� ���� ������ m, �뷡�� �θ��� ������ s, å�� ���� ������ b�� �Է�");
		char hobby = s.next().charAt(0);
		
		switch(hobby) {
		case 'm':
			System.out.println("movie");
			break;
		case 's':
			System.out.println("sing");
			break;
		case 'b':
			System.out.println("book");
			break;
		default:
			System.out.println("etc");
			break;
		}
		*/
		
		/*
		// 60�� �̻��̸� �հ��ε�,
		// 4�г��� 70�� �̻��̾�� �հ�
		Scanner s = new Scanner(System.in);
		System.out.println("���� �Է�:");
		int score = s.nextInt();
		
		System.out.println("�г� �Է�: ");
		int year = s.nextInt();
		
		if (score>=60) {
			if(year != 4) {
				System.out.println("�հ�");
			}
			else if (score>=70) {
				//4�г��̸鼭 70�� �̻��� ��
				System.out.println("�հ�");
				
			}
			else {
				//4�г��� 70�� �̸��϶�
				System.out.println("���հ�");
			}
		}
		else {	// 60�� �̸��� ��
			System.out.println("���հ�");
		}
		*/
		
		
		/*
		//static double	random()
		//Returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0.
		
		// 0.0 <= (Math.random()) < 1.0;
		// 0.0   <= (Math.random()) < 6.0;
		// 1.0   <= (Math.random()) < 7.0;
		// 1     <= (Math.random()) < 7;
		int n = (int)(Math.random()*6)+1;
		System.out.println(n);
		//1, one
		//2, five
		//6, six
		
		switch(n) {
		case 1: 
			System.out.println("one");
			break;
		case 2:
			System.out.println("two");
			break;
		case 3:
			System.out.println("three");
			break;
		case 4:
			System.out.println("four");
			break;
		case 5:
			System.out.println("five");
			break;
		case 6:
			System.out.println("six");
		}
		*/
		
		/*
		//2~8���� ���� �Լ�
		int n = (int)(Math.random()*7)+2;	//2���� 8����
		System.out.println(n);
		*/
		
		// ? : 
		// ���� ���� ������
		
		/*
		int score=85;
		char grade=(score>90)? 'A' : 'B'; // ���� ���� ������
										  // ���ǽ� ? TURE : FALSE
		System.out.println(grade); //grade = B
		*/
		
		
		/*
		//10~13�ñ��� random���� ������ ��
		//10,11 -> ���νð�
		//12,13 -> ���ɽð� ���
		int n = (int)(Math.random()*4)+10;	
		
		switch(n) {
		
		case 10:
		case 11:
			System.out.println("���νð�");
			break;
		
		case 12:
		case 13:
			System.out.println("���ɽð�");
			break;
		}
		*/
		
		/*
		// 1~100���� ��
		int n = (int)(Math.random()*100)+1;
		//Returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0.
		// 0.0 <= (Math.random()) < 1.0;
		// 0.0 <= (Math.random()) < 100.0
		// 1.0 <= (Math.random()) < 101.0
		
		if(n%5==0)
			System.out.println("5�� ���");
		else if(n%10==0)
			System.out.println("n�� 10�� ���");
		else {
			System.out.println("�� ���� �� �ƴ�");
		}
		*/
		
		/*
		// 81~100��
		int score = (int)(Math.random()*20)+81;
		// 0.0 <= (Math.random()) < 1.0;
		// 0.0 <= (Math.random()) < 20.0
		// 81.0 <= (Math.random()) < 101.0
		System.out.println(score);
		
		String grade;  //���ڿ� ��������
		
		if(score>=90) {
			if(score>=95) {
				grade="A+";
			}
			else { 
				grade="A";
			}
		}
		else {	//90�� �̸�
			if(score>=85)
				grade="B+";
			else
				grade="B";
		}
		System.out.println("����: "+grade);
	}
}
*/
		/*
		int a=50, b=100;
		int big;
		
		big=(a>b) ? a : b;
		System.out.println(big);
		
		}
		*/
		
		/*
		for(int i=1; i<=10; i+=2) {
			System.out.println(i);
		}
		*/
		
		/*
		//***** ���
		for(int i=1; i<=5; i++) {	// Ƚ��
			System.out.print("*");	// �� �࿡ ���
		}
		*/
		
		/*
		for(int i=5;i>=0;i--) {
			System.out.println(i);
		}
		*/
		
		/*
		//for~if�� ��ø
		//1���� 100���� �� �߿���
		for(int i=1; i<=100; i++) { //��������
			if(i%5==0 && i%6==0) {
			System.out.println(i);
			}
		}
		*/
		
		/*
		// 10���� 20���� for������ ���
		for(int i=10; i<=20; i++) {
			System.out.println(i);
		}
		*/
		
		// ���� ���� for( ; ; )
		
		/*
		// 0 2 4 6 8 10 ���
		for(int i=0; i<=10; i+=2) {
			System.out.println(i);
		}
		*/
		
		/*
		int hap = 0;
		for(int i=1; i<=10; i++) 
			hap=hap+i;	//1~10������ ��
		System.out.println(hap); //55
		*/
		
		/*
		// 1���� 100���� �� ���
		int sum = 0;
		for(int i=1; i<=100; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		*/
		
		/*
		int sum = 0;
		for(int i=1; i<=100; i++) {
			if(i % 2 == 0) { //¦���̸�
				sum+=i;		//���ϰڴ�.
			}
		}
		System.out.println(sum);
		*/
	
		/*
		//�� �� ? 7
		// �������� �Ųٷ� ���
		Scanner s = new Scanner(System.in);
		System.out.println("�� �� ? ");
		int dan = s.nextInt();
		
		for (int i=9; i>=1; i--) {
			System.out.printf("%d*%d=%d\n",dan,i,dan*i);
		}
		*/
		
		
		// *****
		// *****
		// *****
		
		/*
		for(int i=1; i<=15; i++) {
			System.out.print("*");	//println (x)
			if (i%5==0) {	// 5�� ���
				System.out.println(); // �� �ٲ�
			}
		}
		*/
	}
	
}
	
