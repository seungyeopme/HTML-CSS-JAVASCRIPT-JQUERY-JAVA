import java.util.Arrays;

public class study6 {

	public static void main(String[] args) {
		
		/*
		 while���� �̿��ؼ� ���� ���� �� �Է� �޴´�
		-1�� �ԷµǸ� �Է�����!
		�Է¹��� �� �� ���
		Scanner s = new Scanner(System.in);
		int n;
		while((n=s.nextInt())!=-1) {
			System.out.println(n);
		}
		*/
		
		
		
		//1.	1~10���� ���� ���ض�. (for, while, do~while)
		
		//for
		/*int sum=0;
		for(int i = 1; i<=10; i++) {
			sum=sum+i;
		}
		System.out.println(sum);
		*/
		
		//while
		/*
		int i=1,sum=0;
		while(i<=10) {
			sum+=i;
			i++;
		}
	
		System.out.println(sum);
		*/
		
		/*
		//do~while
		int i=1, sum=0;
		do {
			sum+=i;
			i++;
		}while(i<=10);
		System.out.println(sum);
		*/
		
		//2.	while���� �̿��Ͽ� ������ ���� �� �Է¹ް� ��� ����ض�. (0�� �ԷµǸ� �Է��� ����ȴ�.)
		/* ù��° ���
		Scanner s = new Scanner(System.in);
		int num, sum =0; 
		int count =0;
		while(true) {
			System.out.println("������ ���� �� �Է����ּ���(���� 0)");
			num = s.nextInt();
			if(num==0) {
				System.out.println("���α׷� ���� \n");
				break;
			}
			count++;
			sum+=num;
		}
		System.out.printf("�� %d���� ���� ����� %.1f�Դϴ�.",count, sum/(double)count);
		*/
		
		/* �ι�° ��� (Ŭ�� �ڵ�)
		Scanner s = new Scanner(System.in);
		int i, sum=0, count=0;
		while((i=s.nextInt())!=0) {
			count++;
			sum+=i;
		}
		System.out.println(sum/count);
		*/
		
		//3. ���� while���� ���� �������� �����ϰ� �������� 2���� �������� �ٲ��.
		/*
		int i=0, sum=0;
		while(i<10){
		i=i+2;
		sum +=i;
		}
		System.out.println(sum); //30
		*/
		
		//3.1) while(true)�� break�� ����Ͽ� �ٲ��.
		/* ù��° ���
		int i=0, sum=0;
		while(true) {
			if(i<10) {
			i=i+2;
			sum+=i;
			}
			else {
				System.out.println(sum);
				break;
			}
		}
		*/
		/* �ι�° ��� (Ŭ�� �ڵ�)
		int i=0, sum=0;
		while(true) {
			i=i+2;
			sum+=i;
			if(i>=10) {
				break;
			}
		}
		System.out.println(sum);
		*/
		
		//3.2) do~while��, continue�� ����Ͽ� �ٲ��.
		/* 
		int i=0, sum=0;
		do {
			i++;
			if(i%2==1) {
				continue;
			}
			sum+=i;
		}while(i<10);
		System.out.println(sum);
		*/
		

		//4-1) 10���� ���ڸ� ������ �迭 a�� �����ϰ� �����ض�.
		//char[] a = new char[10];
		
		//4-2) 0~4���� ���������� �ʱ�ȭ�� �迭 b�� �����ϰ� �����ض�.
		//int[] b = {0,1,2,3,4}; 
		//int b[] = new int[] {0,1,2,3,4};
		
		//4-3) ��java��, ��c��, ��c++���� �ʱ�ȭ�� �迭 c�� �����ϰ� �����ض�.
		//String[] c = {"java", "c", "c++"};
		//String [] c = new String[] {"java", "c", "c++"};
		
		//4-4) �ε����� �ִ밪�� 9�� ������ �迭 d�� �����ϰ� �����ض�.
		//int [] d = new int[10];
		
		//1~100 �߿��� 5�� ����̰�
		//10�� ����� �ش��ϴ� ���� ���� ��� 
		/*
		//while��
		int i=0,sum=0;
		while(i<=100) {
			if(i%5==0 && i%10==0) {
				sum+=i;
			}
			i++;
		}
		System.out.println(sum);
		*/
		/*
		//do while��
		int i=0,sum=0;
		do {
			if(i%5==0 && i%10==0) {
				sum+=i;
			}
			i++;
		}while(i<=100);
		System.out.println(sum);
		*/
		/*
		//for��
		int sum=0;
		for(int n=0;n<=100;n++) {
		   if(n%5==0 && n%10==0) {
		    sum+=n;
		   }
		  }
		  System.out.println(sum);
		 */
		
		/*
		int [] a = {0,1,2,3,4}; 
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		int a[] = {0,1,2,3,4};
		int b[] = new int[] {0,1,2,3,4};
		int c[];
		c=new int[] {0,1,2,3,4};
		for(int i=0;i<5; i++) {
			System.out.println(a[i]);
		}
		*/
		/*
		//������ �迭 5�� ����
		//���� 5�� �Է¹޾� ��� ���
		//(length �ʵ� ���)
		 
		int []a= new int[5];
		Scanner s = new Scanner(System.in);
		double sum=0;
		
		for(int i=0; i<5;i++) {
			a[i] = s.nextInt();
			sum += a[i];
		}
		System.out.println(sum/5);
		*/
		/*
		//���� 5���� �Է¹޾� ���� ū �� ���
		int []a= new int[5];
		Scanner s = new Scanner(System.in);
		
		int big=0; //���� ū ��
		for(int i=0; i<5; i++) {
			a[i]=s.nextInt();
			if(big < a[i]) {
				big=a[i]; 
			}
			
		}
		System.out.println("�ִ밪"+big);
		*/
		
		/*
		//for-each�� Ȱ��
		//1���� 5���� �迭 �ʱ�ȭ
		//1
		//2
		//3
		//4
		//5
		int sum=0;
		int ary[] = {1,2,3,4,5};
		for(int i:ary) { // ���������� ����
			sum+=i;
		}
		System.out.println(sum);  //15
		*/
		
		/*
		//��ǻ��
		//�ڹ�
		//DB
		String str[]= {"��ǻ��","�ڹ�","DB"};
		//for-each
		for(String s : str) {
			System.out.println(s);
		}
		*/
		
		/*
		//5
		//8
		//6
		//2
		//2���� �迭
		//2,2
		int ary[][] = new int[][] {{5,8},
									{6,2}};
		
		//ary[0][0]=5;
		//ary[0][1]=8;
		//ary[1][0]=6;
		//ary[1][1]=3;
		
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				System.out.println(ary[i][j]);
			}
		}
		*/
		
		/*
		//���� 10�� �Է¹޾� �迭�� ���� �� ��
		//5�� ��� ������ ���
		int a[] = new int[10];
		Scanner s=new Scanner(System.in);
		for(int i=0; i<10; i++) {
			a[i] = s.nextInt();
			if(a[i]%5==0) {
				System.out.println(a[i]);
			}	
		}
		*/
		
		/*
		//[0, 1, 2]
	    //[3, 4, 5]
		int[][]scores = new int[2][3]; 
		int k = 0; for(int i = 0; i < scores.length; i++) { 
			for(int j = 0; j < scores[i].length; j++) { 
				scores[i][j] = k++; 
			} 
			System.out.println(Arrays.toString(scores[i])); }
		*/
			

	
		
		
		
	}
}