package y2020.month8;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/*
1. data.txt�� ���� �׸��� ���� ���� �ٷ� ������ �ؽ�Ʈ �����̸� �� �ٸ��� �� ���� ������ ����ִ�. 
������ �а� �� �ٿ� ����ִ� ������ ���� ����ϴ� �ڵ带 �ۼ��ض�.
*/
/*
public class study3 {
	public static void main(String[] args) {
	
		byte b[] = {10, -1, 20, 10};
		try {
			FileOutputStream f=new FileOutputStream("data.txt");
		
			for(int i=0; i<b.length; i++) 
				f.write(b[i]);
				f.close();
			
		}catch(Exception e) {}
	}
}
*/

public class study3 {
	public static void main(String[] args) {
		
		byte b[]=new byte[4];
		try {
			FileInputStream f= new FileInputStream("data.txt");
			
			int sum=0, n=0, c;
			while((c=f.read())!=-1) {
				b[n]=(byte)c;
				sum+=b[n];
				n++;
			}
			System.out.println(sum);
		}catch(Exception e) {}
	}
}
//39