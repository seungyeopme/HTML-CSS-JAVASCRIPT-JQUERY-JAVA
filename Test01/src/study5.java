import java.io.IOException;
import java.util.Scanner;

public class study5 {

	public static void main(String[] args) {
		/*
		1 1
		1 2
		1 3
		1 4
		1 5
		1 6
		1 7
		1 8
		1 9
		1 10
		2 1
		2 2
		2 3
		2 4
		2 5
		2 6
		2 7
		2 8
		2 9
		2 10
		3 1
		3 2
		3 3
		3 4
		3 5
		3 6
		3 7
		3 8
		3 9
		3 10
		4 1
		4 2
		4 3
		4 4
		4 5
		4 6
		4 7
		4 8
		4 9
		4 10
		5 1
		5 2
		5 3
		5 4
		5 5
		5 6
		5 7
		5 8
		5 9
		5 10
		6 1
		6 2
		6 3
		6 4
		6 5
		6 6
		6 7
		6 8
		6 9
		6 10
		7 1
		7 2
		7 3
		7 4
		7 5
		7 6
		7 7
		7 8
		7 9
		7 10
		8 1
		8 2
		8 3
		8 4
		8 5
		8 6
		8 7
		8 8
		8 9
		8 10
		9 1
		9 2
		9 3
		9 4
		9 5
		9 6
		9 7
		9 8
		9 9
		9 10
		10 1
		10 2
		10 3
		10 4
		10 5
		10 6
		10 7
		10 8
		10 9
		10 10
*/
		/*
		for(int i=1;i<=10;i++) {
			for(int j=1;j<=10;j++) {
				System.out.println(i+" "+j);
			}
		}
		*/
		
/*		4 1
		4 2
		4 3
		4 4
		4 5
		4 6
		4 7
		4 8
		4 9
		5 1
		5 2
		5 3
		5 4
		5 5
		5 6
		5 7
		5 8
		5 9
		6 1
		6 2
		6 3
		6 4
		6 5
		6 6
		6 7
		6 8
		6 9
*/
		/*
		for(int i=4; i<=6; i++) {
			for(int j=1;j<=9;j++) {
				System.out.println(i+" "+j);
			}
		}
		*/
		/*
		Scanner s = new Scanner(System.in); //import ����Ű ctrl+shift+o
		while(true) { 	//��������
			String str=s.next();
			if(str.equals("stop")) {
				break;	// ���ѷ��� ����
			}		
		}
		*/
		/*
		int n=-1;
		do {
			System.out.println(n);
			n++; //����			
		}while(n>0);	// ������ ���߿� �˻��ϱ� ������ ���ǿ� �� �¾Ƶ� ���๮�� ����ȴ�.
		*/
		
		/*
		//do~while(1~10)
		int n = 1;
		do {
			System.out.println(n);
			n++;
		}while(n<=10);
		*/
		
		/*
		//1��. �� ���� ������ �Է��Ͽ� ��� ����ϴ� ���α׷�(������Ҽ��� ���� ù°�ڸ����� ���)

		//��� ���) �� ���������� : 70  80

		//           ��� : 75.0
		
		Scanner s = new Scanner (System.in);
		System.out.println("�� ���� ������ �Է����ּ���");
		double a = s.nextDouble();
		double b = s.nextDouble();
		System.out.printf("�� ������ ��� ������ %.1f",(a+b)/2);
		*/
		/*
		Scanner sc = new Scanner (System.in);
		System.out.println("�� ���� ����:");
		
		int c= sc.nextInt();
		int d= sc.nextInt();
		System.out.printf("���: %.1f",(c+d)/2.0);
		*/
		
		//2��.�ð��� ���� ������ �ݾ� �������ִ� ���α׷�

		//(�� �ݾ��� 10�������� ����, �ð������� ������ �Է¹ޱ�)

		//14�ÿ� ��Ʈ�� �湮�ϰ� ���� ������ 3�� �����̸� 5%�� ����

		//18�ÿ� ��Ʈ�� �湮�ϰ� ���� ������ 5�� �����̸� 10%�� ����

		//20�ÿ� ��Ʈ�� �湮�ϰ� ���� ������ 10�� �����̸� 20%�� ����
		/*
		Scanner s = new Scanner(System.in);
		System.out.println("�ð��Է�");
		int a = s.nextInt();

		System.out.println("���� �Է�");
		int b = s.nextInt();
		switch (a) {
		case 14: {
		if (b <= 3) {
		System.out.println(100000 - (100000 * 0.05));
		}

		}
		break;
		case 18: {
		if (b < 5) {
		System.out.println(100000 - (100000 * 0.1));
		}
		}
		case 20: {
		if (b <= 10) {
		System.out.println(100000 - (100000 * 0.2));
		}
		}
		break;
		default:
		System.out.println("���ξ���");
	}
}
*/	
		/*
		double total = 100000;
		Scanner s = new Scanner (System.in);
		System.out.println("�ð�, ���� �Է�");
		int time=s.nextInt();
		int num=s.nextInt();
		
		if(time==14 && num<=3) 
			total=total*0.95;
		
		else if(time==18 && num<=5)
			total*=0.9;
		else if(time==20 && num<=10)
			total*=0.8;
		System.out.println(total);
		*/
		
		/*
		//1~100 ¦�� �� ���	
		int a=1,sum=0;
		while(a<=100) {
			if(a%2==0) {
				sum+=a;
			}
			a++;
		}
		System.out.println(sum);
		*/
		
		//���� 3 ��ø �ݺ������� 5�ܺ��� 9�ܱ��� ���
		/* 
		for (int i = 5; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
			System.out.printf("%dX%d=%d\n", i, j, i * j);
			
			}
		*/
		//���� 4 while���� �̿��ؼ� 1���� 100���� ���� �� 5�ǹ���� ������ ���
			/*
			int a=0;
			int hap=0;
			while(a<=100) {
			if(a%5==0) {
			hap+=a;
			}
			a++;
			}
			System.out.println(hap);
			*/
	
		/*
		//���� 5
		//while, random()�� �̿��ؼ� (x,y)���·� ����ϴµ� x+y���� 5�̸� ������ ���ߴ� �ڵ带 �ۼ�. 
		//5�� �ƴϸ� ���� ��� �߻���Ű����� (x,y ������ 1���� 5����)
		
		while(true) {
			   int val1 = (int) (Math.random() * 5) + 1;
			   int val2 = (int) (Math.random() * 5) + 1;



			   System.out.println("(" + val1 + "," + val2 + ")");



			   if (val1 + val2 == 5) { break; }
			   */
		
		/* 
		// do while��
		//"exit"�� �ƴ� ������ ��� ���ڿ��� �Է¹޾� ���
		// exit�̸� "���α׷� ����"��� ���(do~while)
		String str;
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("���ڿ� �Է�");
			str=s.next();
			if(str.equals("exit")) {
				System.out.println("���α׷� ����");
			}
			//exit�� �ƴϸ�, else ����
			System.out.println(str);
			} while(!str.equals("exit"));
		*/
		
		/*
		// while��  �ʱ�ȭ �ʿ�!
		String str = ""; //  �ʱ�ȭ
		Scanner s = new Scanner(System.in);
		while(!str.equals("exit")) {
			System.out.println("���ڿ� �Է�");
			str=s.next();
			if(str.equals("exit")) {
			System.out.println("���α׷� ����");
		}
		//exit�� �ƴϸ�, else ����
		System.out.println(str);
		} while(!str.equals("exit"));
		*/
		//����6�� ���ڸ� �Է��Ͽ� ���� ���� ���ߴ� ����

		//������18�� ����

		//�Է��Ѽ��ڰ� ����(18)�� �ƴ� ��� ũ�ų� ������ �˷��ش�. ���������� ������ ���� �Է��� �ݺ��ϰ� ������ ���� �Ŀ��� �õ��� Ƚ�� ���

		//������) ���� �Է�: 25

		//           25���� �۴�!!

		//          ���� �Է�: 10

		//          10���� ũ��!!

		//          ���� �Է�: 18

		//          �����̴�!!

		//         �õ��� Ƚ���� 3���̴�.
		
		/* ù��° ���
		Scanner s = new Scanner(System.in);
		int answer = 18;//����
		int count=0; // �õ��� Ƚ�� 
		
		while(true) {
			System.out.println("���� �Է�");
			count++;
			int n=s.nextInt();
	
			if (answer<n) {
				System.out.println(n+"���� �۽��ϴ�.");
			}
			else if (answer>n) {
					System.out.println(n+"���� ũ��!!");
			}
			else{	// answer == n
				System.out.println("�����̴�!!");
				break;
			}
		}
		System.out.println("�õ��� Ƚ���� "+count+"�̴�");
		*/
		
		/* �ι�° ���
		 int answer=18;  //������ �� ���� ����
	     int guess; //�Է¹��� ����
	        
	     Scanner nc = new Scanner(System.in);
	     int count=0;
	        
	        do{
	            System.out.print("��������Է�=>");
	            guess=Integer.parseInt(nc.nextLine());
	            count++;
	            
	            if(guess>answer){
	                System.out.println("�Է��� ���ڰ� ����!");
	            }
	            if(guess<answer)
	                System.out.println("�Է��� ���ڰ� ����!");
	        }while(guess != answer);    //!=���� �ʴ�.
	 
	        System.out.println("�����մϴ�.�õ�Ƚ��="+count);
	     */
	
		//���� 7��
		//1.for while do~while
		// 0,2,3,4,6,8,10
		// ������ �ݺ����� ����ؼ� ���
		
		/* for�� Ȱ��
		for (int i=0; i<=10; i++) {
			if(i%2==0) {
				System.out.print(" "+i);
			}
		}
		for (int j=0; i<=10; i+=2) {
			System.out.println(i);
		*/
		
		/* while�� Ȱ��
		int j = 0;
		while(j<=10) {
			System.out.println(j);
			j+=2;
		}
		*/
		/* do~while�� Ȱ��
		int k = 0;
		do {
			System.out.println(k);
			k+=2;
		}while(k<=10);
		*/
		
		/*
		//�ƽ�Ű�� FOR���� ������ �ڵ�
		System.out.println("�� ���� �Է�");
		Scanner s = new Scanner(System.in);
		
		char c=s.next().charAt(0);
		
		int n=(int)c;	// ���� �Է��� �������� ����ϰ� �ʹ�.
		//e => 101
		for(int i=97; i<=n; i++) {
			for(int j=i; j<n; j++) { // 97~100
				char ch=(char)j;
				System.out.print(ch);
			}
			System.out.println();
		}
		*/
		
		/*
		//0�� �ƴ� ������ �Է��� ���� ���
		Scanner s = new Scanner(System.in);
		while(true) {
		int n=s.nextInt();
		if(n==0) {
				break;
		}
		else if(n!=0){
			System.out.println(n);
			}	
		}
		*/
		
		
		
		/*
		4
		5
		program and.... 

		int num = 4;
		do {
			System.out.println(num);
			num++;
		} while (num <= 5);
		System.out.println("program and.... ");
		*/
		
		/*
		// 1~20���� �� do~while
		int i=1, sum=0;
		
		do {
			sum=sum+i;
			i++;
		}while (i<=20);
		System.out.println(sum);
		*/
		
		// 1~99���̿� �ִ� ���� ��
		// 2�� ��� �Ǵ� 3�� ��� ���
		/* for ���
		   for(int i=1; i<=99; i++) {
			if(i%2==0 || i%3==0) {
				System.out.println(i);
			}
		}
		*/
		/* while ���
		int i=1;
		while(i<=99) {
			if(i%2==0 || i%3==0) {
				System.out.println(i);
			}
			i++;
		}
		*/
		
		// 1~10���� ���� ���ϴµ�
		// ���� 30�̻��̸� �Ǹ� Ż��..
		// �ݺ��� �� �ϳ� ���
		
		/*
		// for�� ���
		int sum =0;
		for(int i=1; i<=10; i++) {
			sum+=i;
			if(sum>=30) {
				break;
			}
		}
		System.out.println(sum);
		*/
		
		/* while �̿�
		int sum =0, i =1;
		while(i<=10) {
			sum=sum+i;
			if(sum>=30) {
				break;
			}
			i++;  //����
		}
		System.out.println(sum);
		*/
		/*
		// do while �̿�
		int sum =0, i=1;
		
		do {
			System.out.println();
		}
		*/
		
		//0~9���� �� �߿���
		// Ȧ���� ���(while, continue ���)
		/*
		int i =0;
		while(i<10) {
			i++;
			if(i%2==0) {
				continue;	
			}
			System.out.println(i);
		}
		*/
		
		/*
		//1~10������ random()�� �������� �� ��
		//���� 10�� ������ Ż��!
		// (10�� ���� ������ ���� ��� �߻�)
		
		for(;;) {	// ���ѷ���
			int n = (int)(Math.random()*10)+1;
			if(n==10) {
				break;
			}
			System.out.println(n);
		}
		*/
		/*
		while(true) {
			int n = (int)(Math.random()*10)+1;
			if (n==10) {
				break;
			}
			System.out.println(n);
		}
		*/
		
		/*
		//�迭: ���� �ڷ������� ���� �ִ�.
		int [] ary = new int[3]; //��������
		ary[0]=10;
		ary[1]=20;
		ary[2]=ary[0]+ary[1];
		
		System.out.println(ary[0]);
		System.out.println(ary[1]);
		System.out.println(ary[2]);
		
		//int arr [] = new int[5];
		
		// int [] ary; //�迭 ����
		// ary=new int[5]; // �迭 ����
		*/
		
		// 1. ���� 5���� ������ �迭 (�迭 ���� �������)
		//int a[] = new int[5];
		
		// 2. �Ǽ� 10���� ������ �迭
		//double []a = new double[10];
		
		// 3. �迭 ��� ���� ������ int �� �迭
		//int []a = new int[3];
		
		// 4. �ε����� �ִ밪�� 4�� char�� �迭
		//char []a = new char[5];
		
		/*
		int [] ary = new int[3]; //��������
		ary[0]=10;
		ary[1]=20;
		ary[2]=ary[0]+ary[1];
		for(int i=0; i<3; i++) {	// �ε����� ����
			System.out.println(ary[i]);
		}
		*/
		
		/*
		// �Ǽ� 3���� �迭 ����, ����
		double ary[] = new double[3];
		Scanner s = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			ary[i]=s.nextDouble();
			System.out.println(ary[i]);
		}
		*/
		/*
		int ary[] = new int[] {10, 20,  30};	// �迭 �ʱ�ȭ �Ҷ� ���� ������ ����!
		// 					  [0]  [1]  [2]
		int n=0;
		while (n<3) {
			System.out.println(ary[n]);
			n++;
		}
		*/
		/*
		30
		20
		10

		int ary[] = new int[] {10, 20,  30};	// �迭 �ʱ�ȭ �Ҷ� ���� ������ ����!
		// 					  [0]  [1]  [2]
		// �Ųٷ� ���
		for(int i=0; i<3; i++) {
			System.out.println(ary[2-i]);
		}
		*/
		
		/*
		int ary[] = new int [] {1,2,3};
							//3
		for(int i=0; i<ary.length;i++) {
			System.out.println(ary[i]);	
		}
		*/
		
		/*
		//�Ǽ� 5���� �Է¹޾� ��� ����ض�.
		double a[] = new double[5];
		Scanner s = new Scanner (System.in);
		int sum=0;
		for(int i=0; i<a.length;i++) {
			a[i]=s.nextDouble();
			sum+=a[i];	// sum=sum+a[i];
		}
		System.out.println(sum/5.0);
		*/
		
		/*
		// ���� 4���� �հ�� ���� ���ϴ� ���α׷��� �ۼ�
		Scanner s = new Scanner (System.in);
		int sum=0;	// ���պ���
		int multi=1;	// �Ѱ�����
		int ary[]=new int[4];
		for(int i=0; i<ary.length; i++) {
			System.out.println(i+1+"��° ���ڸ� �Է��ϼ��� : ");
			ary[i]=s.nextInt();
			sum+=ary[i];
			multi*=ary[i]; //multi=multi*ary[i];
			}
		System.out.println("�հ� ==> "+ sum);
		System.out.println("���� ==> "+ multi);
		*/
		
		/*
		//�迭�� ����ؼ� ���
		//2.0 4.0 6.0 8.0 10.0
		
		double a[] = {2.0, 4.0, 6.0, 8.0, 10.0};
		for(int i=0; i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		*/
		
		/*
		//1 2 3 5 8 13 21 34 55 89(�Ǻ���ġ) ������ ��ġ�� �ִ� ���� ���ϴ� ��.
		int ary[] = new int[10];
		ary[0]=1; ary[1]=2;
		for(int i=0; i<8; i++) {
			ary[i+2]=ary[i]+ary[i+1];
		}
		for(int i=0; i<10; i++) {
			System.out.print(ary[i]+" ");
		}
		*/
		
		/*
		//5�� ����Ʈ�� ����
		// ��� �� �Է� �޾�
		//1������ �� �� ���? 
		//2������ �� �� ���? 
		//3������ �� �� ���? 
		//4������ �� �� ���? 
		//5������ �� �� ���? 
		
		Scanner s = new Scanner(System.in);
		int sum = 0;
		System.out.println("�� �� ���?");
		int ary[] = new int [5];
		for(int i=0; i<ary.length; i++) {
			System.out.printf("%d���� ��� �ο�: ", i+1);
			ary[i] = s.nextInt();
			sum = sum + ary[i];
		}
		System.out.printf("5������ �α��� ����: %d", sum);
		*/
		
	}
}

