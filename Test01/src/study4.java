import java.util.Scanner;

public class study4 {

	public static void main(String[] args) {
		//1.	5/3 �� ������� �Ҽ��� ��° �ڸ� ���� ����ض�. (printf ���)
		/*
		double num = 5/3;
		System.out.printf("%.2f",num);
		*/
		//2.	Ű(double)�� �ϳ� �Է¹޾� 160���� ������ ��small��, 170���� ������ ��medium��, 180���� ������ ��large�� ���
		/*
		Scanner s = new Scanner(System.in);
		System.out.println("Ű �Է�=>");
		double ki = s.nextDouble();
		if (ki < 160) {
			System.out.println("small\n");	
		}else if(ki < 170) {
			System.out.println("medium");
		}
		else if(ki < 180) {
			System.out.println("large");
		}
		*/
		//3.	n1�� 50, n2�� 100���� �ʱ�ȭ�Ͽ� �� �� �� ū ���� �Ǻ��Ͽ� ����ض�. (���� ������ Ȱ��)
		/*
		int n1 = 50, n2 = 100;
		char n3 = (n1>n2) ? 'o': 'x';
		System.out.println(n3);
		*/
		//4.	���̸� �������� ��øif���� ����Ͽ� ����ض�.(����, Ű, ������ ���� ������ ����)
		/*
		Scanner s=new Scanner(System.in);
		System.out.println("���̸� �Է¹ٶ��ϴ�: ");
		int age=s.nextInt();
		System.out.println("Ű�� �Է¹ٶ��ϴ�: ");
		double ki=s.nextDouble();
		if(age < 20) {
		if(ki<160) {
		System.out.println("������� S �Դϴ�.");
		}else if(ki>=160 && ki<170) {
		System.out.println("������� M �Դϴ�.");
		}else if(ki>=170) {
		System.out.println("������� L �Դϴ�.");
		}else {
		System.out.println("�ٽ� �Է� �ٶ��ϴ�.");
		}
		}else if(age >= 20){
		if(ki<165) {
		System.out.println("������� S �Դϴ�.");
		}else if(ki>=165 && ki<175) {
		System.out.println("������� M �Դϴ�.");
		}else if(ki>=175) {
		System.out.println("������� L �Դϴ�.");
		}else {
		System.out.println("�ٽ� �Է� �ٶ��ϴ�.");
		}
		}else {
		System.out.println("�ٽ� �Է� �ٶ��ϴ�.");
		}
		*/
		//5.	1���� 50������ ������ ����ض�.(for)
		/*
		for(int i = 1; i<=50; i++)
			 System.out.println(i);
		*/
		//5-1	1~50 ���� �� 6�� ����� ����ض�.(for, if)
		/*
		for(int i = 1; i<=50; i++)
			if(i%6==0) {
				System.out.println(i);
			}
		*/
		//5-2	1~50������ ���� ����ض�.
		/*
		 int sum =0;
		 for(int i = 1 ; i<=50; i++) {
		 sum+=i;
		 }
		 System.out.println(sum);
		 */
		//5-3	1~50 ������ random�Լ��� ���� ���� �� �� ������ �� �ϳ�(����)����ض�.
		/*
		 int ran = (int)(Math.random()*50)+1;
		 	System.out.println(ran);
		*/
		// 6	a=10, b=20���� �ʱ�ȭ�ϰ�, ������(+,-,*,/)�� �ϳ��� �Է¹޴´�. 
		// +�̸� �μ��� ��, -�̸� ��, *�̸� ��, /�̸� ���� ���Ͽ� ����ض�.(switch-case�� ���)
		/*
		 int a = 10, b = 20;
		 Scanner s = new Scanner(System.in);
		 System.out.println("������ +,-,/,* �ϳ��� �Է��ϼ���");
		 char op = s.next().charAt(0);
		 switch (op) {
		 case '+':
		 System.out.println(a+b);
		 break;
		 case '-':
		 System.out.println(a-b);
		 break;
		 case '*':
		 System.out.println(a*b);
		 break;
		 case '/':
		 System.out.println(a/b);
		 break;
		 }
		 */	
		
		/*
		//1,3,5,7,9 for�� ��� ���
		//ù ��° ���
		for(int i=1; i<=9; i+=2) {
			System.out.print(i);
		}
		System.out.println();
		//�� ��° ���
		for(int j=1;j<=9;j++) {
			if(j%2==1) {
				System.out.print(j);
			}
		}
		*/
		
		/*
		// $$$
		// $$$
		// $$$
		// ���
		for(int j=1;j<=9;j++) {
			System.out.print("$");
			if(j%3==0) {
			System.out.println();
			}

		}
		*/
		/*
		int score = 85;
		//char grade=(score>90)? 'A':(score>80)?'B':'C';
		//System.out.println(grade);
		
		if(score>90) {
			grade='A';
		}
		else if(score>80) {
			grade='B';
		}
		else 
			grade = 'C';
		*/
		
		/*
		int sum=0;
		for(int i=1;i<=50;i++) {
			if (i%6==0 || i%7==0) {	//i�� 6�� ����̰ų� 7�� ���
				sum=sum+i;
			}	
		}
		System.out.println(sum);
		*/
		
		//��ø for��
		//�ٱ� for���� �������� ���� for���� ����.
		
		/*
		for(int k=2; k<=9; k++) {
			for(int j=1; j<=9; j++) {
				System.out.printf("%d X %d = %d \n", k, j, k*j);
			}
			System.out.println();
		}
		*/
		
		/*
		// a=1~10, b=1~10���� (random)
		// a�� b���� ũ�� a/b
		//            a%b
		
		int a =(int)(Math.random()*10) + 1;
		int b =(int)(Math.random()*10) + 1;
		
		if(a<b)
			System.out.printf("%d/%d=%d",a,b,a/b);
		else if (a<b)
			System.out.printf("%d %% %d=%d",a,b,a%b);
		
		if (a>b) {
			System.out.println(a/b);
		}
		else {
			System.out.println(a%b);
		}
		
		double result = (a>b) ? a/b : a%b;
		System.out.printf("%.1f",result);
		
		*/
		
		/*
		//***
		//***
		//***
		for(int i=0;i<3;i++) {		//��
			for(int j=0; j<3; j++) {	//��
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		/*
		//$$$$$
		//$$$$$
		for(int i=0; i<2; i++) {			//��
			for(int j=0; j<5; j++) {
				System.out.printf("$");		//��
			}
			System.out.println();
		}
		*/
		
		/*
		//*			i=0 j=1
		//**		i=1 j=2
		//***		i=2 j=3
		//****		i=3 j=4
		//*****		i=5 j=5
		
		// i�� �̿��ؼ� j���� ��������!!!
		// �� �κ��� �������� ��, �ٱ������� i�� �̿��ؼ� ����� ������ �������� ������ �ָ� ���� © �� ����.
		for(int i=0; i<5; i++) {
			for(int j=0; j<i+1; j++) {
				System.out.print("*");	
		}
		System.out.println();
		
		}
		*/
		
		/*
		//*****
		//****
		//***
		//**
		//*
		for(int i=0; i<5; i++) {
			for(int j=0; j<5-i; j++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		*/
		
		
		/*
		
		//*
		//**
		//***
		//****
		//*****
		//****
		//***
		//**
		//*
		for(int i=0; i<9; i++) {
			if(i<5) {
				for(int j=0; j<i+1; j++) {
					System.out.print("*");
				}
			}
			else if (i>=5) {
				for(int j=0; j<9-i;j++ ) {
					System.out.print("*");
				}
				
			}
			System.out.println();

		}
		
		*/
		
		
		
/*	     
//	     *
//	    **
//	   ***
//	  ****
//	 *****

		for (int i=1; i<=5; i++) {
			for(int j=4; j>=i; j--) {
				System.out.print(" ");
			}
		for(int k=1; k<=i; k++) {
			System.out.print("*");
		}
		System.out.println();
		}
*/	
		
/*		
//			*
//		   **
//		  ***
//		 ****
//		*****
//		 ****
//		  ***
//		   **
//		    *
		  for (int a = 0; a < 9; a++) {
		   if (a < 5) {
		    for (int s = 0; s < 4 - a; s++) {
		     System.out.print(" "); // ���� ����4,3,2,1�����
		    }
		    for (int d = 0; d < a + 1; d++) {// ������ ��1,2,3,4�����
		     System.out.print("*");
		    }
		   } else {		//a>=5
		    for (int s = 0; s < a - 4; s++) {
		     System.out.print(" "); // ���� ����1,2,3,4�����
		    }
		    for (int d = 0; d < 9 - a; d++) {
		     System.out.print("*");
		    }
		   }
		   System.out.println();
		  }
	*/		
		
/*		
//	     1
//	    123
//	   12345
//	  1234567
//	 123456789
	 
		for (int i= 0; i<5; i++) {
			for(int j=0; j<4-i; j++){	// ����
				System.out.print(" ");
			}
			int n=1;
			for(int j=0;j<(i*2)+1;j++) {	//����
				System.out.print(n);
				n++;
			}
			System.out.println();
		}
*/
		
		//��ĳ�� ��ü ����
		/*Scanner s = new Scanner(System.in);
		System.out.println("���ϴ� �� �Է�");
		int dan = s.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.println(dan+"*"+i+"="+dan*i);
		}*/
		/*
		���ϴ� �� �Է�
		2
		2*1=2
		2*2=4
		2*3=6
		2*4=8
		2*5=10
		2*6=12
		2*7=14
		2*8=16
		2*9=18
		*/

/*
//		������ �Ųٷ� ���
//		9 x 9 = 81	8 x 9 = 72	7 x 9 = 63	6 x 9 = 54	5 x 9 = 45	4 x 9 = 36	3 x 9 = 27	2 x 9 = 18	
//		9 x 8 = 72	8 x 8 = 64	7 x 8 = 56	6 x 8 = 48	5 x 8 = 40	4 x 8 = 32	3 x 8 = 24	2 x 8 = 16	
//		9 x 7 = 63	8 x 7 = 56	7 x 7 = 49	6 x 7 = 42	5 x 7 = 35	4 x 7 = 28	3 x 7 = 21	2 x 7 = 14	
//		9 x 6 = 54	8 x 6 = 48	7 x 6 = 42	6 x 6 = 36	5 x 6 = 30	4 x 6 = 24	3 x 6 = 18	2 x 6 = 12	
//		9 x 5 = 45	8 x 5 = 40	7 x 5 = 35	6 x 5 = 30	5 x 5 = 25	4 x 5 = 20	3 x 5 = 15	2 x 5 = 10	
//		9 x 4 = 36	8 x 4 = 32	7 x 4 = 28	6 x 4 = 24	5 x 4 = 20	4 x 4 = 16	3 x 4 = 12	2 x 4 = 8	
//		9 x 3 = 27	8 x 3 = 24	7 x 3 = 21	6 x 3 = 18	5 x 3 = 15	4 x 3 = 12	3 x 3 = 9	2 x 3 = 6	
//		9 x 2 = 18	8 x 2 = 16	7 x 2 = 14	6 x 2 = 12	5 x 2 = 10	4 x 2 = 8	3 x 2 = 6	2 x 2 = 4	
//		9 x 1 = 9	8 x 1 = 8	7 x 1 = 7	6 x 1 = 6	5 x 1 = 5	4 x 1 = 4	3 x 1 = 3	2 x 1 = 2	

		
		 for (int j=9;j>=1;j--){
			   for (int i=9;i>=2;i--){
			   System.out.print(i +" x "+ j +" = "+ i * j + "\t");
			  }
			  System.out.println();
			  }
		*/
		
		/*
		int n=1;	// �ʱⰪ ����
		
		while(n<=5) {	// ���ǽ�
			System.out.println(n);
			n++;		// ������
		}
		*/
		
/*		
		0
		2
		4
		6
		8
		10

		int i=0;
		while(i<=10) {
			System.out.println(i);
			i += 2;
		}

		
		int i =0;
		while(i<=10) {
			if(i%2==0) {
			System.out.println(i);
		}
			i++;
		}
*/
/*		
		1
		2
		3
		4
		5
		6
		7
		8
		9
		10
		
		//1���� 10���� ���
		int i = 0;
		while(i<10) {
			i++;
			System.out.println(i);
		}
		*/
		
		/*
		//1���� 10���� ��
		int sum=0;
		int n=1;
		while(n<=10) {
			sum+=n;
			n++;
		}
		System.out.println(sum); //55
		*/
		
		/*
		Scanner s=new Scanner(System.in);
		System.out.println("����(2~4)�ϳ� �Է���!");
		int n= s.nextInt();
		//�Է��� ������ �� ���
		switch(n) {
		case 2:
			for(int i=1; i<=9; i++) {
				System.out.printf("%d*%d=%d\n",2,i,2*i);
			}
			break;
		case 3:
			for(int i=1; i<=9; i++) {
				System.out.printf("%d*%d=%d\n",3,i,3*i);
			}
			break;
		case 4:
			for(int i=1; i<=9; i++) {
				System.out.printf("%d*%d=%d\n",3,i,3*i);
			}
			break;
		default:
			System.out.println("�߸��Է�");
			break;
		}
		*/
		/*
		int n=10;
		while(true) {
			if(n>9) {
				break;	// �ݺ��� Ż��!! if�� Ż���� �ƴ� while���� ����������.
			}
			System.out.println(n);
			n++;
		}
		*/
		
		/*
		int sum=0,n=100;
		Scanner s = new Scanner(System.in);
		
		while(n!=0) { // 0�� �ƴ� ������
			System.out.println("�Է����ּ���");
			n=s.nextInt();	//���� �Է�
			sum+=n; //�Է��� �� ����
		}
		System.out.println(sum);
		*/
		
		/*
		Scanner s = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("�̸��Է�:");
			String name=s.next();
			if(name.equals("����")) {
				break;
			}
			else {
				System.out.println(name);
			}
		}
		*/
		
		/*
		int hap=0;
		int i=1;
		while(i<=100) {
			hap=hap+i;
			if(hap>=1000) {
				break;
			}
			i++;
		}
		System.out.println(i);
		*/
		
		/*
		//continue Ȱ���
		for(int i=0; i<=20; i++) {
			if(i%2==0 || i%3==0) {
				continue;
			}	//2,3�� ����� ����
			System.out.println(i);
		}
		*/
		
		/*
		//1���� 6���� ���������ؼ�(math.random)
		//���� 6�� ������ ���α׷� �����ϰ�
		// �ƴ� ������ �� �� (������) ���
		while(true) {
			int num = (int)(Math.random()*6)+1;
			if(num==6) {
				break;
			}else {
				System.out.printf("%d\n", num);
			}
		}
		*/
		
		/*
		Scanner s=new Scanner(System.in);
		System.out.println("���� 5�� �Է�");
		
		int sum=0;
		for(int i=0; i<5; i++ ) { // Ƚ��
			int n=s.nextInt(); // 5�� �Էµ�
			if (n<0) {
				continue;	// ����(�ö󰡼� �ݺ��� �ٽ� ����)
			}
			else { 	// n>=0
				sum+=n;
			}
		}
		System.out.println("��� ��:" + sum);
		*/
		
	}
}

			
	
		

