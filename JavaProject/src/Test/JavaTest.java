package Test;

import java.awt.Container;
import java.awt.FlowLayout;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
//1번
/*
public class JavaTest {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("두 정수를 입력: ");
		int a=s.nextInt();
		int b=s.nextInt();
		
		int result=a+b;
		
		System.out.println("합은 "+result);
	}
}
*/
/*
두 정수를 입력: 
10 20
합은 30
*/

//2번
/*
class Circle{
	private double r;
	
	Circle(double r) {
		this.r=r;
	}
	double area() {
		return 3.14*r*r;
	}
}
public class JavaTest {
	public static void main(String[] args) {
		
		Circle[] c=new Circle[5];
		//double r[] r=new double[5];
		 
		double sum=0;
		
		Scanner s=new Scanner(System.in);
		for(int i=0; i<5; i++) {
			System.out.println("반지름 입력해주세요");
			
			double r=s.nextDouble();
			sum+=c[i].area();
		}
		System.out.println(sum);
	}
}
*/

//3번
/*
class Num{
	int num;
	int sum=0;
	
	Num() {
		this.num=num;
	}
	
	int add(int n) {
		sum=n+num;
		return sum;
	}
	
	int getSum(int a,int b,int c,int d) {
		//
		//int hap=0;
		//for(int i=1; i<=4; i++) {
		//	hap+=i;
		//}
		//return hap;
	
		sum=a+b+c+d;
		return sum;
	}
		
	
	//int getMax() {
		
	//}
	
	public static int max(int a, int b, int c , int d) {
		return a;
	}
}
public class JavaTest {
	public static void main(String[] args) {
		
			Num nb=new Num();
			
			//4개 숫자를 입력
			nb.add(7);
			nb.add(-1);
			nb.add(20);
			nb.add(5);
			
			System.out.println("Sum = "+nb.getSum(7,-1,20,5));//4개 숫자의 합계
			System.out.println("Max = "+nb.max(20,7,5,-1));//4개 숫자 중 최대값
	}
}
*/
/*
Sum = 31
Max = 20
*/

//4번
/*
public class JavaTest {
	public static void main(String[] args) {
	
		HashMap<String, Double> h = new HashMap();
		
		h.put("AA", 11.1);
		h.put("BB", 22.2);		
	}
}
*/

//5번

public class JavaTest extends JFrame {
	
	JavaTest(){
	
		JFrame j= new JFrame();
		Container c=getContentPane();
		
		//JButton j[] = new JButton[9];
		JButton j1 = new JButton("1");
		JButton j2 = new JButton("2");
		JButton j3 = new JButton("3");
		JButton j4 = new JButton("4");
		JButton j5 = new JButton("5");
		JButton j6 = new JButton("6");
		JButton j7 = new JButton("7");
		JButton j8 = new JButton("8");
		JButton j9 = new JButton("9");
		
		
		setSize(500,500);
		setVisible(true);
		
		
	}
	public static void main(String[] args) {
	
		new JavaTest();
	}
}

