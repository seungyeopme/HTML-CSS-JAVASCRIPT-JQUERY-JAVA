import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* ù��° ���
public class study8 {
	public static double average(int a, int b) {
		return (a+b)/2.0;
	}
	public static void main(String[] args) {
	// �� ������ �Է¹޾Ƽ� ��� ��ȯ�ϴ� �Լ�  
	//10 200
	//105.0

		Scanner s = new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		double avg=average(x,y);
		System.out.println(avg);
	}
}
*/

/* �ι�° ���
//�� ������ �Է¹޾Ƽ� ��� ��ȯ�ϴ� �Լ�  
//200 100
//150.0
public class study8 {
	public static double average() {
		Scanner s = new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		return (x+y)/2.0;
	}
	public static void main(String[] args) {
		double avg=average();
		System.out.println(avg);
	}
	
}*/

/*
//�� ��° ���
//�� ������ �Է¹޾Ƽ� ��� ��ȯ�ϴ� �Լ�  
//100 200
//150.0
public class study8 {
	public static void average() {
		Scanner s = new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		System.out.println((x+y)/2.0);
	}
	public static void main(String[] args) {
		average();
	}	
}
*/
/*
//*****
//@@@@@@@@@@
public class study8 {
	public static void pr(char a, int b) {
		for(int i=0; i<b; i++) {
			System.out.print(a);
		}
	System.out.println();
	}
	public static void main(String[] args) {
		pr('*',5);  //*****
		pr('@',10);	//@@@@@@@@@@
	}	
}
*/

/*
//*****
//@@@@@@@@@@
public class study8 {
	public static void pr(String a, int b) {
		for(int i=0; i<b; i++) {
			System.out.print(a);
		}
	System.out.println();
	}
	public static void main(String[] args) {
		pr("*",5);  //*****
		pr("@",10);	//@@@@@@@@@@
	}	
}
*/

/*
public class study8 {
	public static int total(int a[]) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum+=a[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int ary[]= {1,2,3,4,5};
		System.out.println(total(ary));	//15
		//����
	}
}
*/

/*
public class study8 {
	public static int total(int a[][]) {
		int sum=0;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				sum+=a[i][j];
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		int ary[][]= {{1,2,3},
					 {4,5,6}};	
		System.out.println(total(ary));	//21   <--2���� �迭 ����
	}
}
*/

/*
public class study8 {
	public static int add(int a, int b) {
		return a+b;
	}
	public static void main(String[] args) {
		System.out.println(add(10,20));	//30
		//a=10,b=20�� �ְ� ȣ���Ͽ�
		//�� �� ���ϴ� add �Լ� �����
	}
}
*/

/*
public class study8 {
	public static int add(int a, int b) {
	int sum;
	sum = a + b;
	System.out.println(a + b);	//30
	return sum;
	}
	public static void main(String[] args) {
	add(10,20);	
	}
}
*/

/*
//15 8
//15
//�� ���� ���ؼ� ū �� ���
public class study8 {
	public static void big(int a, int b) {
		int max=a>b?a:b;
		System.out.println(max);
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		big(s.nextInt(),s.nextInt());
	}
}
*/


//1.	1~10������ �Ѱ��� ����ض�.(while)
/*
public class study8 {
	public static void main(String[] args) {
		int i = 1;
		int mul = 1;
		while(i<10) {
		i++;
		mul=mul*i;
		}
		System.out.println(mul);	//3628800
	}
}
*/

/*
//2. �������� ¦���ܸ� ����ϸ鼭 �ش�Ǵ� ���� ��������(2���� 2*2, 4���� 4*4, 6���� 6*6, 8���� 8*8)����ض�.(break)
//2 x 1 = 2
//2 x 2 = 4
//4 x 1 = 4
//4 x 2 = 8
//4 x 3 = 12
//4 x 4 = 16
//6 x 1 = 6
//6 x 2 = 12
//6 x 3 = 18
//6 x 4 = 24
//6 x 5 = 30
//6 x 6 = 36
//8 x 1 = 8
//8 x 2 = 16
//8 x 3 = 24
//8 x 4 = 32
//8 x 5 = 40
//8 x 6 = 48
//8 x 7 = 56
//8 x 8 = 64
public class study8 {
	public static void main(String[] args) {
		
		for(int i=2; i<10; i+=2) { // ¦�� �ܸ� 2, 4, 6, 8
			for(int j=1; j<10; j++) { 
				System.out.println(i + " x " + j + " = " + i*j);
				if(j>=i)    // i = 2 �� ��, j = 1, 2 ���� ����ؼ� �ݺ��� Ż���ϱ� ���� ����
					break;    // 4, 6, 8 �ܵ� ��������
			}
		}
	}
}
*/	

/*
//3. main�Լ��� ���� adder, exp �Լ��� �ۼ��ض�.
//       main(){
//         int result=adder(10,20);          //�� ���� �� ���
//         System.out.println(result);
//         System.out.println(exp(3.5)); }   //3.5�� ������ �� ���

public class study8 {
	public static int adder(int a, int b) {
	return a+b;
	}
	public static double exp(double a) {
		return a*a;
	}
	public static void main(String[] args) {
		int result=adder(10,20);
		System.out.println(result);		//30
		System.out.println(exp(3.5));	//12.25
	}
}
*/

/*
//4.	���� ������ ������ �����ϸ�, ���� ���̸� ����ؼ� ��ȯ�ϴ� �޼ҵ带 ������.
//(�ΰ��� ��������) (�޼ҵ���� ���Ƿ� �ش�.)
//4.1) ����� main���� �ϱ�!
//4.2) ����� �޼ҵ�ȿ��� �ϱ�!

public class study8 {
	 public static double width(double num){
	  double p=3.14;
	  double sirWidth=p*num*num;
	  return sirWidth; //width ���� ��ȯ 
	}
	public static void main(String[] args) {
		System.out.println("�������� 5�� ���� ���� : "+ width(5));  //�������� 5�� width �޼ҵ� ȣ��
	}	//�������� 5�� ���� ���� : 78.5
}
*/

/*
//5.	1  3  5  7  9  �̷��� ����� 2���� �迭 ����ض�.
//      11 13 15 17 19 

public class study8 {
	public static void main(String[] args) {
		int[][] arr = {
				{1, 3, 5, 7, 9},
				{11,13,15,17,19},
				};
		for(int i=0; i<arr.length; i++){ 
			for(int j=0; j<arr[i].length; j++) 
				System.out.print(arr[i][j]+" "); 
				System.out.println(""); 
		}
	}
}
*/

/*
//6.   ���ڿ� a�� ��C++��, b�� ��,JAVA���� �ʱ�ȭ�ض�.
//6-1) ���ڿ� a�� ���̸� ����ض�.
//6-2) a,b�� ���ڿ��� �����ض�.
//6-3) �ε��� 3���� ������ ����ض�.
//6-4) JAVA�� ��C#������ �����ض� 
//6-5) ,�� �������� ���ڿ��� �и��ض�.
public class study8 {
	public static void main(String[] args) {
		String a="C++";
		String b=",JAVA";
		
		System.out.println(a.length());
		String c=a.concat(b);
		System.out.println(c);
		
		c=c.substring(3,7);
		System.out.println(c);
		
		c=c.replace("JAVA","C#");
		System.out.println(c);
		
		String []str=c.split(",");
		for(int i=0; i<str.length;i++)
			System.out.println(str[i]);
	}	
}
*/

/*
public class study8 {
	public static int big(int [][]a, int b, int c ) {
		int m=0;
		for(int i=0; i<b; i++) { 		//b :2
			for(int j=0; j<c; j++) {	//c :3
				if(m<a[i][j]) {
					m=a[i][j];
				}
			}
		}
		return m;
	}
	public static void main(String[] args) {
		//2�� 3��
		int [][]grade= {{55,86,90},
						{60,58,100}};
		int max;
		max = big(grade,2,3);
		System.out.println("��������: "+max);	// ��������: 100
	}
}
*/

/*
//java.lang.ArithmeticException: / by zero
//at study8.main(study8.java:341)
//��

public class study8 {
	public static void main(String[] args) {
		try {
			int n = 10/0; //error
			System.out.println(n);
		}
		catch(Exception e) {
			e.printStackTrace();
			e.getMessage();
		}
		finally {
			System.out.println("��");
		}
	}
	
}
*/

/*
public class study8 {
	public static void main(String[] args) {
		int a =100, b=0;
		int result;
		try {
			if(b==0) {	// �� ��Ͽ��� ���� ó�� �ʰڴ�.
				throw new Exception("0���� ���������? �ȵ˴ϴ�.");
			}	//���� �̷��, ������ 
			result = a/b;
			}catch (Exception e) {
				System.out.println("�߻� ���� ==> ");
				System.out.println(e.getMessage()); //0���� ���������? �ȵ˴ϴ�.
			}
	}
}
*/

/*
//ù��° �� �Է�
//5
//������ �Է�
//*
//�ι�° �� �Է�
//0
//�Ѵ� 0�̸� �ȵ�
public class study8 {
	 public static void main(String[] args) {
		  Scanner s=new Scanner(System.in);
		  	try {
		  		System.out.println("ù��° �� �Է�");
		  		int a=s.nextInt();
		  		
		  		System.out.println("������ �Է�");
		  		char b=s.next().charAt(0);
		   
		  		System.out.println("�ι�° �� �Է�");
		  		int c=s.nextInt();
		   
		  		switch(b) {
		  			case '*':
		  				if(a==0 || c==0) {
		  					throw new Exception("�Ѵ� 0�̸� �ȵ�"); 
		  				}
		  					System.out.println(a*c);
		  					break;
		  			case '/':
		  				if(c==0) {
		  					throw new Exception("0�̸� �ȵ�"); 
		  				}
		  					System.out.println(a/c);
		  					break;
		  		}
		  }catch(Exception e) {
			  System.out.println(e.getMessage());
		  }
	}
}
*/

/*
//22
//2
public class study8 {
	public static int func(int num) {
		return num%5;
	}
	 public static void main(String[] args) {
		 int a;
		 Scanner s = new Scanner (System.in);
		 a=s.nextInt();	//�Է��� ������ 5�� ���� ������ ���
		 System.out.println(func(a));
		 
	 }
}
*/

/*
//46754
public class study8 {
	public static void show(int a[]) {
		for(int i=0; i<a.length; i++) 
			System.out.print(a[i]);
		}
	public static void main(String[] args) {
		int ary[]=new int[] {4,6,7,5,4};
		show(ary);	// �迭�� �ִ� �� �� ���
	}
}
*/

/*
// ��������
3 2 1 6 5 
2 3 1 6 5 
2 1 3 6 5
2 1 3 5 6  => 1ȸ��
===================
1 2 3 5 6  => 2ȸ��
===================

public class study8 {
	public static void main(String[] args) {
		int temp;
		int ary[]= {3,2,1,6,5};
		for(int i=0; i<4; i++) {
			for(int j=i+1;j<5;j++) {
				if(ary[i]>ary[j]) {
					temp = ary[i];
					ary[i] = ary[j];
					ary[j] = temp;
					}
				}
		  }	// ���� ���ؼ� ��ȯ
		  for(int i = 0; i <ary.length; i++) {
			  System.out.print(ary[i]);	//12356
		  }
	}
}
*/

/*
public class study8 {
	public static double avg(int[]a) {
		double result = 0;
		for(int i=0; i<a.length; i++) {
			result += a[i];
		}
		return (double)(result/a.length);
	}
	public static void main(String[] args) {
		int ary[]= {3,2,1,6,5};
		double a=avg(ary);
		System.out.println(a); //�迭�� ��� ��� //3.4
	}
}
*/


//����Ʈ ��Ʈ��
//1) �Է� ��Ʈ�� -> ~~InputStream���� ����
//2) ��� ��Ʈ�� -> ~~OutputStream���� ����

//���ΰ� ��� => ���������� ���� ���� �Ұ� => Constructors�� �Ű������� ���ƾ�~
//�Ű����� �ȿ� InputStream, OutputStream, Reader, Writer�� ���̸� ���!
//������ ���ΰ�!


//���� ��Ʈ��
//1)�Է� ��Ʈ��	  -> ~~Reader
//2)��� ��Ʈ��    -> ~~Writer


//1.���� ����(���)
//Writer(���ڴ��� ���ϻ���)
//OutputStream(����Ʈ���� ���ϻ���)

//2.���Ͽ��� �� ����
//write �޼ҵ�

//3.���� �о����
//Reader(���ڴ����� �о����)
//InputStream(����Ʈ ������ �о����)

//4.���� �ݱ�(close())


/*
public class study8 {
	public static void main(String[] args) throws IOException {
		
		char a='S';
		char b='W';
		
		FileWriter out = new FileWriter("a.txt"); //���ϻ���
		out.write(a);	// ����
		out.write(b);
		out.close();
		//���� ���� Ȯ�� ����� ������Ʈ ������ Ŭ�� Refresh
		//������Ʈ Ŭ���ϰ� f5�� ������ ���� �ȴ�.
	}
}
*/

/*
public class study8 {
	public static void main(String[] args) throws IOException {
		char [] ary = new char[10];
		int r; // ��ȯ���� int��
		
		FileReader in = new FileReader("a.txt");//���Ͽ� ������ ���ڸ� �о�鿩��
		r=in.read(ary, 0, ary.length); // �迭, ���۰�, ����
		//�迭�� ���̸�ŭ ������ �Ŀ�
	for(int i=0; i<r; i++)
		System.out.println(ary[i]); //���
	in.close(); //�׻� �ݾ��־�� �Ѵ�.
//	S
//	W
	}
}
*/

/*
public class study8 {
	public static void main(String[] args) throws IOException {
		
		 FileWriter fw = new FileWriter("b.txt");
		 
		 BufferedWriter out = new BufferedWriter(fw);
		 
		 out.write("�ȳ�~");
		 out.newLine();
		 out.write("������ �����~");
		 out.newLine();
		 out.write("aaa@naver.com");
		 out.close();
	}
}
*/

// �ڵ��ϼ� ��� => ����Ű ctrl + space


/*
//�ȳ�~
//������ �����~
//aaa@naver.com
public class study8 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader in = new BufferedReader(new FileReader("b.txt"));
		
		String str;
		while(true) {
			str = in.readLine();
			if(str==null) {
				break;
			}
			System.out.println(str);
		}
		in.close();
	}
}
*/

/*
public class study8 {
	public static void main(String[] args) throws FileNotFoundException {
		
		PrintWriter out = new PrintWriter("c.txt");
		
		out.printf("������ %s����","��");
		out.println();
		
		out.println("������ �ڹٰ���!");
		out.print("�ָ�!!");
		out.close();
	}
}
*/


/*
//InputStreamReader
BufferedReader in
= new BufferedReader(new InputStreamReader(System.in));
�Է��� ���� ���Ͽ� �����ϴ�!
*/

/*
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class study8 {
	public static void main(String[] args) {
		
		BufferedReader bu=null;	//��Ʈ���� ���� �ƹ��͵� ����.
		PrintWriter pr=null;	//��Ʈ���� ���� �ƹ��͵� ����.
		
		//�ܼ�â�� ���ڸ� �Է��ؼ� �Է��� ���ڸ�
		//���Ͽ� ����
		try {
			InputStreamReader in=
					new InputStreamReader(System.in);
			
			bu=new BufferedReader(in); // �ֿܼ� �Է��ϴ� ����!
			FileWriter fw = new FileWriter("d.txt");
			//d.txt�� ����
			pr=new PrintWriter(fw);
			
			String str=null;
			while((str=bu.readLine())!=null) {
				pr.println(str);
			}
			bu.close();
		}catch(Exception e) {}
		finally {
			pr.close();
		}
		
	}
}
*/

//������ �� EOF End Of File
/*
//��ü�� ���Ͽ� �����ϰ�
//������ ��ü�� �о���̴� �۾�

//ObjectInputStream
//ObjectOutputStream
*/


public class study8 {
	public static void main(String[] args) {
		
	}
}
