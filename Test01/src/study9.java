import java.util.Scanner;

/*
public class study9 {
	static void adder(int a, int b) {
		System.out.println(a+b);	//9

		
	}
	public static void main(String[] args) {
	
		int a=3,b=6;
		adder(a,b);
	}
}
*/

/*
//��ȯ���� ������ return!
//��ȯ���� ������ ���!
 
public class study9 {
	static int adder(int a, int b) {
		return a+b;
	}
	public static void main(String[] args) {
		int a=3,b=6;
		int r=adder(a,b);
		System.out.println(r);	//9
	}
}
*/

/*
public class study9 {
	static void total(int a[]) {
	}
	public static void main(String[] args) {
		int a[]= new int[4];
		total(a);
	}
}
*/

/*
//42 0
//���
public class study9 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		try { 
			int a = s.nextInt();
			int b = s.nextInt();
			int c = a/b;
		}catch (Exception e) {
			System.out.println("���");
		}
		//�� ������ �Է¹޾� ������ ���� 0�� ��
		//��� ���
	}
}
*/

/*
public class study9 {
	public static void main(String[] args) {
		
		InputStreamReader in = new InputStreamReader(System.in);
		FileWriter out =null;
		
		int r;
		try {
			out=new FileWriter("e.txt");
			while((r=in.read())!=-1) {
				out.write(r);
			}
			in.close();
			out.close();
		}catch(IOException e) {
			System.out.println("����� ����!!");
		}
	}
}
*/

/*
public class study9 {
	public static void main(String[] args) throws IOException {
		//f.txt�� �о�ͼ� �ֿܼ� ���
		FileReader f=new FileReader("f.txt");
		BufferedReader b = new BufferedReader(f);
		
		String n=null;
		while((n=b.readLine())!=null) {
			System.out.println(n);
		}
		f.close();
		b.close();
	}
}
*/

/*
//1. ���� 10���� �Է¹޾� �迭�� ������ ��, �迭�� �˻��Ͽ� 4�� ����� ��� ����ϴ� ���α׷�
public class study9 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int[] num = new int[10];
		
		for(int i=0; i<num.length; i++) {
			System.out.println("���� 10�� �Է���");
			num[i] = s.nextInt();
		}
		for(int i=0 ; i<10; i++){
			   if(num[i]%4==0){
				   if(num[i]==0) continue;    //���� 0�� ���� ��� �ݺ��� �ѱ��
				   System.out.print(num[i]+" ");   //�� ���� 4�� ��� ���.
			   		}
			  }
			  
			  s.close();
	}
}
//���� 10�� �Է���
//1
//���� 10�� �Է���
//2
//���� 10�� �Է���
//3
//���� 10�� �Է���
//4
//���� 10�� �Է���
//5
//���� 10�� �Է���
//6
//���� 10�� �Է���
//7
//���� 10�� �Է���
//8
//���� 10�� �Է���
//9
//���� 10�� �Է���
//10
//4 8 
*/

/*
//2. ���� a=50, b=150���� �ʱ�ȭ�ؼ� a�� b���� ũ�� a�� b�� ��, �ƴϸ� a�� b�� ������ ���� ������ ���(���� ���� ������ Ȱ��)

public class study9 {
	public static void main(String[] args) {
		int a=50, b=150;
		
		int c = (a<b) ? a*b : a%b;
		System.out.println(c);	//7500
	}
}
*/

/*
//3. 100������ �ڿ��� �߿��� 2�� ����̰� 7�� ����� ���ڸ� ����ϰ�, ��µ� ������ ���� ���(while�� �̿�)
public class study9 {
	public static void main(String[] args) {
		int num=1,sum = 0;
		
		while(num<=100) {
			if (num%2== 0 && num%7== 0) {
				System.out.println(num);
				sum+=num;
			}num++;
		}
		System.out.println("��: "+sum);
	}	
}
//14
//28
//42
//56
//70
//84
//98
//��: 392
 */

/*
//4. ������ �Է¹޾� ¦���̸� ��¦����, Ȧ���̸� ��Ȧ���� ��� ����ض�.
//������ �Է����� ���� ��쿡�� ���α׷��� ������Ѷ�.(try-catch ���)
public class study9 {
	public static void main(String[] args) {
		
		try {
				Scanner s= new Scanner(System.in);
				System.out.print("���� �Է���: ");
				int num = s.nextInt();
				
				if (num % 2 == 0)  
				    System.out.print(num + "�� ¦���Դϴ�.");
				
				else 
				    System.out.print(num + "�� Ȧ���Դϴ�.");
					s.close();
			}
				
				catch (Exception e) {
			    System.out.println("������ �ƴϾ�, ���� �Է���");
				}
	}
}
//���� �Է���: 1
//1�� Ȧ���Դϴ�.

//���� �Է���: 2
//2�� ¦���Դϴ�.

//���� �Է���: 1.1
//������ �ƴϾ�, ���� �Է���
*/

/*
//5. ���ѷ����ȿ� �� ������ �Է¹޾� ���� ���ϰ�, �Ǽ��� �Է��ϸ� ���Ǽ��� �ȵȴ١���� ����ϰ�, 
//   �ٽ� �� ������ �Է¹޴� �ڵ带 �ۼ��ض�.
//
//���� ���) �� ���� �Է�: 3 3.5
//        �Ǽ��� �ȵȴ�
//
//        �� ���� �Է�: 3 5
//        ��: 8 

public class study9 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a,b;
		while(true) {
			System.out.println("�� ���� �Է�: ");
			try {
				a=s.nextInt(); // ���� ���ɼ� ����
				b=s.nextInt(); // ���� ���ɼ� ����
				System.out.println(a+b);
				break;
			}catch(Exception e) {
				System.out.println("�Ǽ��� �ȵȴ�");
				s.nextLine();	// ���� ������ ������� ���� ������ �ֱ� ������
								// ���� ���� �Է��� �� ������ ����
								// �Է� ��Ʈ���� �ִ� ������ �ƴ� ��ū�� ������ �ڵ�
				continue; 		// �ٽ� ���� �ö󰣴�.
			}
		}
	}
}
//�� ���� �Է�: 
//10 2.2
//�Ǽ��� �ȵȴ�
//�� ���� �Է�: 
//10 5
//15
*/ 


/*
//6. func�Լ� �ۼ��ϱ�.(Ű����� �Է��� ����� 5�� ������ ��� �������� ������ �����ϱ�
//main(){
//Scanner s = new Scanner(System.in);
//		int c=s.nextInt();
//		int a=c/5;
//		int b=c%5;
//	
//		func(a,b); //a->��, b-> ������ 
//} 
// 
//������) ��� �Է�: 8
//�� : 1, ������: 3

public class study9 {
	static void func(int a, int b) {
		System.out.println(a+ " " +b);
	}
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int c=s.nextInt();
		int a=c/5;
		int b=c%5;
	
		func(a,b);
	}
}
*/


/*
//7. �ټ� ���� ������ ����� �迭�� ���� ���� #��� (#�� 5���� �ϳ��� ����ϸ� ���� ������ ������. pr�Լ��� �ۼ�
//main(){
//int score[]=new int[] {58, 60, 86, 90, 84};
//pr(score, 5) }

public class study9 {
	static void pr(int a[], int b) {
		for(int i=0; i<b; i++) {
			a[i]=a[i]/5;
			for(int j=0; j<a[i]; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		int score[]=new int[] {58, 60, 86, 90, 84};
		pr(score, 5);
		}
}
//###########
//############
//#################
//##################
//################
*/

/*
//8. ���� main�Լ��� ���� ��ȯ���� String������ �ְ� ����ض�.
//   main(){
//     System.out.println(show(��$�� , 10)); }

public class study9 {
	static String show(String a, int b) {
		String str="";
		for(int i=1; i<=b; i++) {
			str=str.concat(a); // $ 10�� ����
		}
		return str;
	}
	public static void main(String[] args) {
		System.out.println(show("$",10));	//$$$$$$$$$$
	}
}
*/

/*
//9. �����δ� �������, ��ճ׿䡱��� ���ڿ��� str�� ������ ��,
//","�� �������� ���ڿ��� �����غ���, �ε��� 6�� �ִ� �� ���ڸ� ���, �����δ¡� ���

public class study9 {
	public static void main(String[] args) {
		String str = "���δ� �������, ��ճ׿�";
		String a[] = str.split(",");
		for(int i=0; i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.printf("%c \n", str.charAt(6));			//��
		System.out.printf("%s \n", str.substring(0, 3));	//���δ�
		}
}
//���δ� �������
// ��ճ׿�
//�� 
//���δ� 
*/


