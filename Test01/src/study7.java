import java.util.Scanner;

public class study7{
	static int coffee_machine(int button) {
		
		System.out.printf("\n#1.(�ڵ�����) �߰ſ� ���� �غ��Ѵ�\n");
		System.out.printf("#2.(�ڵ�����) �������� �غ��Ѵ�\n");
		
		switch (button) {
		case  1:
			System.out.printf("#3.(�ڵ�����) ����Ŀ�Ǹ� ź��\n"); break;
		case 2:
			System.out.println("#3.(�ڵ�����) ����Ŀ�Ǹ� ź��"); break;
		case 3:
			System.out.println("#3.(�ڵ�����) ��Ŀ�Ǹ� ź��"); break;
		default:
			System.out.println("#3.(�ڵ�����) �ƹ��ų� ź��"); break;
		}
		
		System.out.printf("#4.(�ڵ�����) ���� �״´�\n");
		System.out.printf("#5.(�ڵ�����) ��Ǭ���� ��� ���δ�\n\n");
		
		return 0;
		}
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int coffee;
		int ret;
		
		System.out.println("A��, � Ŀ�� �帱���? (1:����, 2:����, 3:��) ");
		coffee = s.nextInt();
		ret = coffee_machine(coffee);
		System.out.print("A�� Ŀ�� ���� �ֽ��ϴ�.\n");
		
		System.out.println("B��, � Ŀ�� �帱���? (1:����, 2:����, 3:��) ");
		coffee = s.nextInt();
		ret = coffee_machine(coffee);
		System.out.print("B�� Ŀ�� ���� �ֽ��ϴ�.\n");
		
		System.out.println("C��, � Ŀ�� �帱���? (1:����, 2:����, 3:��) ");
		coffee = s.nextInt();
		ret = coffee_machine(coffee);
		System.out.print("C�� Ŀ�� ���� �ֽ��ϴ�.\n");
	}
}

/*		
//�迭 ÷�ڰ� �迭 ũ�⺸�� Ŀ��!!

int []aa=new int[3];
try {
	aa[3]=100;	// ���ܰ� �� �� �ִ� �ڵ�
	System.out.println("aa"); //��� �ȵ�
} catch(Exception e) {
	System.out.println("�迭 ÷�ڰ� �迭 ũ�⺸�� Ŀ��!!");
}
 */

/*
public class study7{
static int in() {
	  Scanner s=new Scanner(System.in);
	  int n=s.nextInt(); 
	  return n;
	 }
	public static void main(String[] args) {
	  System.out.println(in());
	 }
}
//15415151 (�Է�)
//15415151 (���)
*/

//��ȯ���� void�� �ַ� ����Լ�
//�Ű������� void�� �� �ַ� �Է� Ŭ����
/*
public class study7{
	static int in(int p) {
		return p;	
	}
	public static void main(String[] args) {
		//���� �ϳ� �Է¹޾� �Է��� ������ �״�� ���
		//�Լ����� in
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		System.out.println(in(num));
	}
}
//15415151 (�Է�)
//15415151 (���)
*/

/*
public class study7{
	static void cal(char a, int b, int c) {
		switch(a) {
		case '+':
			System.out.println(b+c); break;
		case '-':
			System.out.println(b-c); break;	
		}
	}
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	char a=s.next().charAt(0);	//+,-
	int b=s.nextInt();
	int c=s.nextInt();
	cal(a,b,c);
	}
}
-
9
6
3
*/

/*
public class study7{
	static double big(double a, double b) {
		return a>b ? a:b;
	}
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int c=s.nextInt();
	int d=s.nextInt();
	System.out.print(big(c,d));	//
		// �� �� �� ū �� ����ϴ� �Լ�
	}	
}
5
56
56.0
*/

/*
public class study7{
	static double big(double a, double b) {
		double max;
		if (a> b) {
			max = a;
		} else {
			max = b;
		}
		System.out.println("ū���� " + max);
		return max;	
	}
	public static void main(String[] args) {
	big(5.5,6.5);
		// �� �� �� ū �� ����ϴ� �Լ�
	}
}
*/

/*
public class study7{
	static double big(double a, double b) {
		return a>b ? a:b;
	}
	public static void main(String[] args) {
	System.out.println(big(5.5,7.5));
		// �� �� �� ū �� ����ϴ� �Լ�
	}
}
*/

/*
public class study7{
static int big(int ary[]) {
	int max=0;
	for(int i=0;i<ary.length;i++) {
		if(max<ary[i]) {
			max=ary[i];
		}
}
	return max;
}

public static void main(String[] args) {
	int a[]=new int[7];
	Scanner s = new Scanner(System.in);
	
	for(int i=0;i<a.length;i++) {
		System.out.println("����7�� �Է�: ");
		a[i]=s.nextInt();	
	}
	System.out.println(big(a));
	//�Ű����� �迭���϶�, 
	//�迭�� ȣ����  �� �迭�� ������ ��
	}
}
����7�� �Է�: 
1
����7�� �Է�: 
2
����7�� �Է�: 
3
����7�� �Է�: 
4
����7�� �Է�: 
8
����7�� �Է�: 
55
����7�� �Է�: 
2
55
*/

/*
public class study7{
public static void main(String[] args) {
	 
    String name = "lee sun shin";
    
    // sun�� soon���� �����ϱ� 
    if (name.contains("sun")) { //contains�� "sun" �� name ������ �ִ��� ������ true, ������ false ��ȯ!
        name = name.replace("sun", "soon");
        System.out.println(name);
    }else {
        System.out.println("sun �̶�� ���ڿ��� �����ϴ�.");
    }
    
    // ���� �̸��� �и��ϱ� 
    String firstName = "";
    String lastName = "";
    
    firstName = name.substring(0, 3); // 0~3 
    lastName = name.substring(4);      // 4~last character
    
    System.out.println("��: " + firstName);
    System.out.println("�̸�: " + lastName);
	}
}
*/
	/*
	static int multi(int a, int b) {
		int mul=1;
		for(int i=1; i<=b; i++) {
			//i=1 1*2=2
			//i=2 2*2=4
			//i=3 4*2=8
			mul=mul*a;
		}
		return mul;
	}
	
	public static void main(String[] args) {
		//2�� 10��
		//2*2*2*2*2*2*2*2*2*2
		System.out.println(multi(2,10));	//1024
	}
	*/


	/*
	static int a;	//��������
	static void aa() {
		a=10;
	}
	static void bb() {
		int a;		// ��������
		a=20;
	}
	
	public static void main(String[] args) {
		aa();
		bb();
		System.out.println(a);	//10
	}
	*/
	

	/*
	static void in() {
		int a=10;	//��������
		System.out.println(a); //10
		
	}
	public static void main(String[] args) {
		
		int a=0;	//��������
		in();		//�Լ�ȣ��
		System.out.println(a);	//0
	}
	*/


/*
//30
//15
//60
//30

public class study7{
	public static void main(String[] args) {
        study7.sum(10, 20);
        study7.avg(10, 20);

        study7.sum(20, 40);
        study7.avg(20, 40);
    }
	 public static void sum(int left, int right){
	        System.out.println(left+right);
	    }

	 public static void avg(int left, int right){
	        System.out.println((left+right)/2);
	    }
	}
*/
	

	

	/*
	static void star(char a, int b) {
		int i = 0;
		while(i<=b) {
			System.out.print("*");
			i++;
		}
	}
	
	public static void main(String[] args) {
		star('*',10);	// **********(while)
	}
	*/


/*	
//	55
//	5050

	static void total(int a, int b) {
		int sum=0;
		for (int i=a; i<=b; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		//1���� 10���� �� ���
				//1���� 100���� �� ���
		
		total(1,10);
		total(1,100);
	}
}
*/
	
//1. ����� ��𿡼� �� ����
//2. main���� �ҰŸ� �Լ����� ����
//	 ->�Լ� ȣ��� ���ÿ� ���
//	 ->������ �ָ鼭 ���� ���� ������ ������!
//3. �Լ����� �ҰŸ� return�� �ʿ���� (void)

/*
{
	public static double meter(int n) {
		return n/100.0;
	}
	public static void main(String[] args) {
		double a;
		a=meter(176);
		System.out.println(a);	//1.76
	}
}
*/
/*
	{
	public static double meter(int n) {
	return n/100.0;
	}
	public static void main(String[] args) {
	System.out.println(meter(176)); //1.76

	
	}
}
*/
	/*
	public static void meter(int n) {
		System.out.println(n/100.0);
	}	// �Լ� ������ �� �ִ��� �Է°�(�Ű�����)�� Ȱ���ؼ� �����ؾ� �Ѵ�!!
	
	public static void main(String[] args) {
		
		
		meter(176);	// �Լ� ȣ��  1.76�� ��Ÿ���� �ʹ�
	*/
	
	/*	
	String ary[][] = {{"book","å"},
					  {"water","��"},
					  {"note", "��Ʈ"}};
	
	Scanner s = new Scanner(System.in);
	//book?
	//water?
	for(int i=0; i<ary.length; i++) {
		System.out.println(ary[i][0]+"�� ����?");
		String str=s.next();	//�ѱ۷� ���� �Է���
		
		if(str.equals(ary[i][1])) {
			System.out.println("����!");
		}
		else {
			System.out.println("������ "+ary[i][1]);
			}
	  }
	  */
	
	
	



/*
public class study7 {
	public int sum(int a, int b) {
		return a+b;
	}
	
	public static void main(String[] args) {
		 int a = 3;
	     int b = 4;

	     study7 myTest = new study7();
	     int c = myTest.sum(a, b);

	     System.out.println(c);	//7
	     
	}
}
*/	

/*	
//	���� ����: 94.985
//	���� �ѷ�: 20.096000000000004

	static double area(double r) {
		return 3.14*r*r;
	}
	static double round(double r) {
		return 3.14*r*2;
	}
	public static void main(String[] args) {
		System.out.println("���� ����: "+area(5.5));	//�Լ�ȣ��� ���ÿ� ��� area()
		System.out.println("���� �ѷ�: "+round(3.2));
		//����: 3.14 * ������ * ������
		//�ѷ�: 3.14 * ������ * 2
*/		

/*
//	123
//	Ű��156.6
//	125
//	Ű��164.5
//	�׷� �̸�..
	
public static void pr(int id, double ki) {
	System.out.println(id);
	System.out.println("Ű��"+ki);
}
public static void show() {
	System.out.println("�׷� �̸�..");
}
public static void main(String[] args) {
	double k=164.5;
	pr(123,156.6);
	pr(125,k);
	show();
*/	
	
/*	
//	����
//	�ȳ�!
//	���̴�52�̴�
//	�ȳ�!
//	���̴�23�̴�
//	��

	public static void pro(int age) {	// void ��ȯ�� ����. return �ʿ� ����.
		System.out.println("�ȳ�!");
		System.out.println("���̴�"+age+"�̴�");
	}
	public static void main(String[] args) {
		System.out.println("����");
		pro(52);	// �Լ�ȣ��
		pro(23);	// �Լ�ȣ���� Ƚ���� ������ ����!
		System.out.println("��");
	}
*/
	
	/*
	public static int plus(int v1, int v2) {	//v1:100, v2:200
		int result;
		result=v1+v2;	// result => 300
		return result;
	}
	
	public static void main(String[] args) {
		//�Լ� ȣ���� ������ 
		int hap;
		hap=plus(100,200);	// �Լ�ȣ��!! �Լ��� �����ش�!!
		System.out.println(hap);	//300

		 
		// ��ȯ��
		// int, double, char, String, boolean, void
		// void -> return Ű���� �ʿ����.
	*/	
		/*
		String str[]={"JAVA", "C++"};		// ��ü �迭
		System.out.println(str); 			// [Ljava.lang.String;@23d2a7e8
		System.out.println(str[0]);			//JAVA
		
		String b ="java,c++";
		b.split(" ");
		
		String a="java";
		System.out.println(a);		//java
		*/
		
		
/*	
//		java
//		c++

		String a="java,c++";
		String str[];
		
		str=a.split(",");
		for(int i=0; i<str.length;i++)
			System.out.println(str[i]);
*/
		
//		1. 50+11.8�� ����� �Ҽ����� ������ ����ض�.
		/*
		double a=50, b=11.8;
		System.out.printf("%.0f",a+b);
		*/
//		2. 0~20���� �� �߿��� 3�� ����� �����ϰ� ����ض�.
//		(���� �ݺ����� break, continue�� �� ����Ͽ� ���)
		
/*		
//		1
//		2
//		4
//		5
//		7
//		8
//		10
//		11
//		13
//		14
//		16
//		17
//		19
		
		int i=0;
		while(true) {
			i++;
			if(i>=20) {
				break;
			}
			if(i%3==0) 
				continue;
			System.out.println(i);	
			
		}
*/	

		/*
//		���� 10���� �Է����ּ��� 0/10
//		100
//		���� 10���� �Է����ּ��� 1/10
//		50
//		���� 10���� �Է����ּ��� 2/10
//		100
//		���� 10���� �Է����ּ��� 3/10
//		50
//		���� 10���� �Է����ּ��� 4/10
//		100
//		���� 10���� �Է����ּ��� 5/10
//		50
//		���� 10���� �Է����ּ��� 6/10
//		100
//		���� 10���� �Է����ּ��� 7/10
//		50
//		���� 10���� �Է����ּ��� 8/10
//		100
//		���� 10���� �Է����ּ��� 9/10
//		50
//		[100, 50, 100, 50, 100, 50, 100, 50, 100, 50]
//		���=75.0

		
		
		
//		3. ���� 10���� �Է¹޾� ��� ���(�迭, length�ʵ� ���)
		int input =0,sum=0;
		Scanner s = new Scanner(System.in);
		int userdata[] = new int[10];
		double avg = 0;
		
		//�Է¹ޱ�
		for (int i=0; i<userdata.length;i++) {
			System.out.println("���� 10���� �Է����ּ��� "+i+"/"+userdata.length);
			input = s.nextInt();
			userdata[i]=input;
		}
		
		//��� ���ϱ�
		for(int i=0; i<userdata.length;i++) {
			sum = sum +userdata[i];
		}
			avg= sum/userdata.length;
			
		//��� ���
			System.out.println(Arrays.toString(userdata));
			System.out.println("���=" + avg);
*/

		

/*		
//		���� 10���� �Է����ּ��� 0/10
//		35
//		���� 10���� �Է����ּ��� 1/10
//		63
//		���� 10���� �Է����ּ��� 2/10
//		56
//		���� 10���� �Է����ּ��� 3/10
//		42
//		���� 10���� �Է����ּ��� 4/10
//		1
//		���� 10���� �Է����ּ��� 5/10
//		3
//		���� 10���� �Է����ּ��� 6/10
//		5
//		���� 10���� �Է����ּ��� 7/10
//		79
//		���� 10���� �Է����ּ��� 8/10
//		101
//		���� 10���� �Է����ּ��� 9/10
//		152
//		35 63 56 42 		

		//		3.1) ���� 10���� �Է¹޾� 7�� ����� ��� (�迭)
		try {
		int input =0;
		Scanner s = new Scanner(System.in);
		int userdata[] = new int[10];
		 
		//�Է¹ޱ�
		for (int i=0; i<userdata.length;i++) {
			System.out.println("���� 10���� �Է����ּ��� "+i+"/"+userdata.length);
			input = s.nextInt();
			userdata[i]=input;
		}
		
		//7�� ���
		for(int i=0; i<10; i++) {
			if(userdata[i]%7==0) {
				if(userdata[i]==0)continue; // ���� 0�� ���� ��� �ݺ��� �ѱ��
				System.out.print(userdata[i]+" "); // �� �� 7�� ��� ���
			}
		}
		
		s.close();
	}

		catch(InputMismatchException e) {	//int���� �ƴ϶�� ���α׷� ����
			System.out.println("������ �ƴմϴ�. ó������ �ٽ� �������ּ���");
		}
*/		
		
//		4. ���� �ڵ带 ���� 3������ �����Ͽ� ����ض�.
//		 double sum=0.0;

//		 double ary[]={1.0, 1.5, 2.0, 2.5};

//		 for(int i=0; i<4 ;i++)

//		    sum+=ary[i];

//		 System.out.println(sum);	//7.0


		 
/*
//		4.1)while������ �ٲپ� ����ض�.
		double sum=0.0;
		double ary[]={1.0, 1.5, 2.0, 2.5};
		
		int i=0;
		while(i<4) {
			sum+=ary[i];
			i++;
		}
		System.out.println(sum);	
*/

/*		
//		4.2)do~while������ �ٲپ� ����ض�.

		double sum=0.0;
		double ary[]={1.0, 1.5, 2.0, 2.5};
		
		int i=0;
		do{
			sum+=ary[i];
			i++;
		}while(i<4);
		System.out.println(sum);
*/
/*		
//		4.3)for~each������ �ٲپ� ����ض�.
		double sum=0.0;
		double ary[]={1.0, 1.5, 2.0, 2.5};
		
		for(double a:ary) {
			sum+=a;
		}
		System.out.println(sum);
*/
		/*
		//���3.783333333333333

		double score[][]= {{3.3,2.3},
							{4.4,3.2},
							{4.2,5.3}};	//3�� 2�� �ʱ�ȭ
				
							
		double sum=0.0;
		for(int i=0;i<score.length;i++) {			//��
			for(int j=0;j<score[i].length;j++) {	//��
				sum+=score[i][j];
			}	

		}
		int a=score.length;//3
		int b=score[0].length;//2	// �� �࿡ ���� ���� ����
		System.out.println("���"+sum/(a*b));
		*/
		
		/*
		//abcdefghijklmnopqrstuvwxyz
		//����ȯ ����ؼ� ���
		char a='a';
		System.out.println((int)(a));	//97
		while(a<='z') {
			System.out.print(a);
			a=(char)(a+1);	//a++;
		}
		*/
/*		
//		5.1) 3�� 3�� �迭�� 0~8���������� �ʱ�ȭ�ض�.
		int ary[][] = {{0,1,2},
				  	  {3,4,5},
				      {6,7,8}};
*/

/*
//		5.2) 2�� 3�� �迭�� a~f�������ڷ� �ʱ�ȭ�ض�.
		char ary1[][]=new char[][]
				{{'a','b','c'},{'d','e','f'}};
*/

/*
//		���� 6��
//		3�� 4���������� �迭�� �����Ͽ�  0~9 ������������ �����ϰ� �����Ѵ�.
//		������ 2���� �迭�� ���� ����ض�.

//	������) 5 4 1 5

//	       0 5 3 5

//		   7 8 1 4

//		    ���� 48
			
		int ary[][]=new int[3][4];
		int sum=0;
		for(int i=0; i<ary.length;i++) {
			for(int j=0; j<ary[i].length; j++) {
				ary[i][j] = (int)(Math.random()*10);
				sum+=ary[i][j];
				System.out.print(ary[i][j]+ " ");
				
			}
			System.out.println();
			
		}
		System.out.println("���� "+sum);
*/
		
		//�޼ҵ�
		//��ȯ�� �Լ���(�Ű�����)		
		//�Լ�ȣ���� ������ �Լ� ���� �ȵȴ�!!
	
	
