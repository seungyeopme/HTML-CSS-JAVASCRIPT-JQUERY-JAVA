import java.util.Scanner;

public class study6 {
public static void main(String[] args) {
	
/*
	static int[] arr() {
		int a[] = new int[4];
		int b = a.length;
		for(int i=0; i<b; i++) 
			a[i] = i;
		return a;
}


	public static void main(String[] args) {
		int a[] = arr();
		for(int i=0; i<a.length; i++)
			System.out.print(a[i] + " ");	// 0 1 2 3
	}
}
*/
		
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
		
		/*
		String str[]= {"A","B","C"};
		for(int i=0; i<3;i++) {
			if(str[i]=="A") {
				break;  // for�� Ż��! �ݺ��� Ż��!
			}
			System.out.println(str[i]);	//��� �ȵ�
		}
		*/
		
		/*
		//1
		//2
		//3
		//4
		//5
		//6
		//1.0
		//2.0
		//3.0
		//4.0
		//5.0
		//6.0
		double ary[][]=new double[2][3];
		// �Ǽ��� 2�� 3��
		Scanner s = new Scanner(System.in);
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				ary[i][j]= s.nextDouble();
				// �Ǽ��� �迭(2�� 3��)���� �Է�
			}
			
		}
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				System.out.println(ary[i][j]);
			}
		}
		*/
		
		/*
		int arr[][] = new int[2][3];
        int a, i, j;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("2���� �迭���� ���� ���������� �Է��ϼ���");
        // arr�� ��ü����
        for(i=0; i<arr.length; i++) {
            // arr[i]�� ��ü 
            for(j=0; j<arr[i].length; j++) {
                System.out.print("arr[" + i + "][" + j + "] : ");
                a = sc.nextInt();
                arr[i][j] = a;
            }
        }
        for(i=0; i<2; i++) {
            for(j=0; j<3; j++) {
                System.out.println("arr[" + i + "][" + j + "] : " + arr[i][j]);
            }
        }
		*/
	
		/*
//		aa[0][0]���� aa[2][3]���� ��� 
//
//		  1   2   3   4 
//		  5   6   7   8 
//		  9  10  11  12 

		int[][]aa=new int[3][4];
		int i, k;
		int val =1;
		
		for(i=0; i<3; i++) {
			for(k=0; k<4; k++) {
				aa[i][k] = val;
				val++;
			}
		}
		
		System.out.println("aa[0][0]���� aa[2][3]���� ��� \n");
		
		for(i=0; i<3; i++) {
			for(k=0; k<4; k++) {
				System.out.printf("%3d ", aa[i][k]);
			}
			System.out.printf("\n");
		}
		*/
	
		
/*		
//		aa[0][0]���� aa[3][5]���� ��� 
//
//		  2   4   6   8  10 
//		 12  14  16  18  20 
//		 22  24  26  28  30 

		
		int[][]aa=new int[3][5];
		int i, k;
		int val =2;
		
		for(i=0; i<3; i++) {
			for(k=0; k<5; k++) {
				aa[i][k] = val;
				val+=2;
			}
		}
		
		System.out.println("aa[0][0]���� aa[3][5]���� ��� \n");
		
		for(i=0; i<3; i++) {
			for(k=0; k<5; k++) {
				System.out.printf("%3d ", aa[i][k]);
			}
			System.out.printf("\n");
		}
*/
		/*
//		1	2	3	4	5	
//		6	7	8	9	10	
//		11	12	13	14	15	
//		16	17	18	19	20	

		int ary[][]= new int[4][5];
		int n=1;
		for(int i=0; i<4; i++) {
			for(int j=0; j<5; j++) {
				ary[i][j]=n++;
				System.out.print(ary[i][j]+"\t");
			}
			System.out.println();
		}
		*/
		
/*		
//		  1*  1=  1  2*  1=  2  3*  1=  3  4*  1=  4  5*  1=  5  6*  1=  6  7*  1=  7  8*  1=  8  9*  1=  9
//		  1*  2=  2  2*  2=  4  3*  2=  6  4*  2=  8  5*  2= 10  6*  2= 12  7*  2= 14  8*  2= 16  9*  2= 18
//		  1*  3=  3  2*  3=  6  3*  3=  9  4*  3= 12  5*  3= 15  6*  3= 18  7*  3= 21  8*  3= 24  9*  3= 27
//		  1*  4=  4  2*  4=  8  3*  4= 12  4*  4= 16  5*  4= 20  6*  4= 24  7*  4= 28  8*  4= 32  9*  4= 36
//		  1*  5=  5  2*  5= 10  3*  5= 15  4*  5= 20  5*  5= 25  6*  5= 30  7*  5= 35  8*  5= 40  9*  5= 45
//		  1*  6=  6  2*  6= 12  3*  6= 18  4*  6= 24  5*  6= 30  6*  6= 36  7*  6= 42  8*  6= 48  9*  6= 54
//		  1*  7=  7  2*  7= 14  3*  7= 21  4*  7= 28  5*  7= 35  6*  7= 42  7*  7= 49  8*  7= 56  9*  7= 63
//		  1*  8=  8  2*  8= 16  3*  8= 24  4*  8= 32  5*  8= 40  6*  8= 48  7*  8= 56  8*  8= 64  9*  8= 72
//		  1*  9=  9  2*  9= 18  3*  9= 27  4*  9= 36  5*  9= 45  6*  9= 54  7*  9= 63  8*  9= 72  9*  9= 81

		// i=0 j=0 ��� 1	
		// i=0 j=1 ��� 2 
		// i=1 j=0 ��� 2
		// i=1 j=1 ��� 4
		
		int[][]ary=new int[9][9];
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				ary[i][j] = (i+1)*(j+1);
			}
		}
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				System.out.printf("%3d*%3d=%3d", j+1, i+1, ary[i][j]);
			}
			System.out.println();
		}
*/
	
/*
//		1	2	
//		3	4	
//		5	6	
		//3�� 2��
		int ary[][] = new int[][]{
								  {1,2},
								  {3,4},
								  {5,6}
								 };
		int n=1;
		for(int i=0; i<3; i++) {
			for(int j=0; j<2; j++) {
			ary[i][j]=n++;
			System.out.print(ary[i][j]+"\t");
			}
			System.out.println();
		}
*/
/*		
//		1	5	
//		2	6	
//		3	7	
//		4	8	

		int ary[][] = {	//2�� 4��
						{1,2,3,4},
						{5,6,7,8}
			 		  };
		int ary1[][] = new int[4][2];//ary�� �����͸� ary1�� ���� (��ġ�� �ٸ�) 4�� 2��
		for(int i=0; i<2; i++) {
			for(int j=0; j<4; j++) {
				ary1[j][i]=ary[i][j];
			}
	}
		for(int i=0; i<4; i++) {
			for(int j=0; j<2;j++) {
				System.out.printf(ary1[i][j]+"\t");
				
			}
			System.out.println();
		}
*/
/*	
//		1
//		2
//		3
//		4
//		5
//		6
//		21

		// [2][3] ������ 2���� �迭
		// ���� �Է¹޾� ����
		int sum=0;
		Scanner s = new Scanner(System.in);
		int ary[][] = new int[2][3];
		for(int i=0; i<ary.length; i++) {
			for(int j=0; j<ary[i].length; j++) {
				ary[i][j] = s.nextInt();
				sum=sum+ary[i][j];
			}
		}
		System.out.println(sum);
*/
		
/*
		// 2���� �迭�϶�
		// �� -> �迭��.length
		// �� -> �迭��[��].length
		
		String s[][] = {{"java"},
						{"c","c++"},
						{"html","css","python"}};
		
		for(int i=0; i<s.length; i++) {
			for(int j=0; j<s[i].length; j++) {	//s[i].length  ���� �������� ���� �� ������; length �� �κ� ó���� ���� �� ��������!!! ���� �������ε� ���� �������� �� ����� �Ѵ�!!!
				System.out.println(s[i][j]);
			}
		}
*/
		
/*
		String str="������ ȭ����";
		System.out.println(str.length()); //7
		System.out.println(str.charAt(1)); //��
*/		
		
/*		
//		������ ȭ����
//		�����ϰ� Ƽ��!!

		String str="������ ȭ����,�����ϰ� Ƽ��!!";
		String a[]=str.split(",");
		for(String b:a) {	// for each��
			System.out.println(b);
		}
*/
/*
		String str="������ ȭ����,�����ϰ� Ƽ��!!";
		String a=str.substring(4, 7);
		System.out.println(a);			//ȭ����
*/
/*
		String str="������ ȭ����,�����ϰ� Ƽ��!!";
		String b=str.replace("����", "study");
		System.out.println(b); 			//������ ȭ����,study�ϰ� Ƽ��!!
*/
/*		
		String str="������ ȭ����";
		String str1=str.concat("������ ������");
		//���ڿ� ����
		System.out.println(str1);
*/
/*	
//		���ڿ� �Է� ==> IT CookBook Java �Դϴ�
//		��� ���ڿ� ==> IT C$$kB$$k Java �Դϴ�
		Scanner s = new Scanner(System.in);
		String str;
		
		System.out.print("���ڿ� �Է� ==> ");
		str = s.nextLine();
		
		System.out.print("��� ���ڿ� ==> ");
		for (int i=0; i< str.length(); i++) {
			if(str.charAt(i)== 'o')
				System.out.printf("%c", '$');
			else
				System.out.printf("%c", str.charAt(i));
		}
*/
		
		/*
		// 2���� �����̸��� �Է¹޾�(����)
		// ���ڿ��� �� �ܾ ���
		Scanner s = new Scanner(System.in);
		String a=s.next();
		String b=s.next();
		
		if(a.length() < b.length())
			System.out.println(b);
		else
			System.out.println(a);
		*/
		
		/*
		String a="apple";
		String b="banana";
		
		if(a.compareTo(b)>0) {	//a>b
			System.out.println(a);
		}
		else if(a.compareTo(b)<0) {	//a<b
			// b�� a���� ���߿� ����
			System.out.println(b);
		}
		else	//a.compareTo(b)==0, 0�̸� ���� ���ڿ�
			System.out.println("���� ���ڿ�!");
		*/
		
		/*
//		�� ���ڿ�1 ==> [Java Programming]
//		�� ���ڿ�2 ==> [Java IT CookBook]
//		7
//		true

		String str1 = "Java Programming";
		String str2 = "Java IT CookBook";
		
		System.out.println("�� ���ڿ�1 ==> [" + str1 + "]");
		System.out.println("�� ���ڿ�2 ==> [" + str2 + "]");
		
		System.out.println(str1.compareTo(str2));	// �� ���ڿ� ��
		System.out.println(str1.contains("Java"));	// "Java" ���ڰ� ���ԵǾ����� Ȯ��
		*/
	}
}
	
		
		

