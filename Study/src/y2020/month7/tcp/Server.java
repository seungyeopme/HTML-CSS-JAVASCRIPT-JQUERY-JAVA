package y2020.month7.tcp;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
	public static void main(String[] args) {

		ServerSocket ser=null;
		try {
			ser= new ServerSocket(); //1.���� ���� ����
			
			//2.���� ���ϰ� ���� ������ ����Ǿ� �ִ� ip�ּҿ� ��Ʈ��ȣ �˾Ƴ��� ���
			ser.bind(new InetSocketAddress("localhost",5001));
			while(true) {
				System.out.println("���� �Ǳ⸦ ��ٸ�");
				Socket so=ser.accept();
				
				//3.���� ��û�� �����ϸ鼭 ��Ĺ �����Ѵ�.
				//4.����� Ŭ���̾�Ʈ ���� ip�� ��Ʈ������ �ñ��� //getRemoteSocketAddress()
				InetSocketAddress is= (InetSocketAddress)so.getRemoteSocketAddress();
				
				byte[]b=null;
				String msg=null;
				
				//�������� �о��� ���̴� �۾�
				InputStream in=so.getInputStream();
				b=new byte[100];
				int r=in.read(b);
				
				//�޽��� ����Ʈ �迭 �д´�
				msg=new String(b,0,r,"UTF-8");
				//����Ʈ �迭�� ���ڿ��� �ٲ۴�.
				System.out.println("������ �ޱ� ����");
				
				OutputStream os=so.getOutputStream();
				msg="Hi Client";
				b=msg.getBytes("UTF-8"); //���ڿ��� ����Ʈ ������ �����ؼ� �����ϰڴ�.
				os.write(b);
				System.out.println("������ ������ ����");
					
				os.close();
				in.close();
				so.close();
				ser.close();
			}
			
		}catch(Exception e){}
		
	}
}
