package y2020.month7.tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//Java soldesk source 
//2020.07.22
public class Server3 {
	public static void main(String[] args) throws IOException {
		BufferedWriter out=null;
		BufferedReader in=null;
		
		ServerSocket ser=null; //�����ʿ��� �ʿ��� ��ü��
		Socket so=null;	//�����ʿ��� �ʿ��� ��ü��
	
		Scanner s=new Scanner(System.in);
		try {
			ser=new ServerSocket(8555);
		} catch(Exception e) {}
		System.out.println("���� ��ٸ��� �ֽ��ϴ�.");
		//Ŭ���̾�Ʈ�� ���� ��û�� �� ������ ��ٸ���.
		try {
			so=ser.accept(); //���� ����
		} catch(Exception e) {
			System.out.println("����");
			System.exit(-1); //���� x //System.exit(0); <-����
		}
		System.out.println("��ٸ���..");
		//���� �ʿ��� Ŭ���̾�Ʈ���� �޼��� ������.
		try {
			out=new BufferedWriter(new OutputStreamWriter(so.getOutputStream()));
			in=new BufferedReader(new InputStreamReader(so.getInputStream()));
		
		
		while(true) {
			String msg=in.readLine(); //�� ������ �о��
			
			if(msg.equals("stop")) {
				System.out.println("����");
				break;
			}
				System.out.println("������: ");
				String outmsg=s.nextLine();
				out.write(outmsg +"\n"); //�� ������ ������
				out.flush(); //���� ���ۿ� ����Ǿ� �ִ� ������ Ŭ���̾�Ʈ���� �����ϰ� ���۸� ����.
		}
		}catch(Exception e) {}
			finally {
				
				try {			
					s.close();
					so.close();
					ser.close();
				}catch(Exception e) {
					System.out.println("���� �߻�");
				}
			}
		}		
}