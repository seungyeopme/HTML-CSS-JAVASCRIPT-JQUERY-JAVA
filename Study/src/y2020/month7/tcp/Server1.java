package y2020.month7.tcp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {

	public static void main(String[] args) throws IOException {
		
		int port = 5050;
        
        //���� ������ ����
        ServerSocket ssk = new ServerSocket(port); //���� �ڽ��� ��Ʈ�� �������ش�.
         
        System.out.println("���� �����~ ");
         
        while(true) {
        Socket sock = ssk.accept(); // ���ο� ������ ���� Ŭ���̾�Ʈ�� �������� , ����������  ����Ǵ� ����
        System.out.println("����� ���� �߽��ϴ�");
        System.out.println("Client ip :"+ sock.getInetAddress());
        } //while
   }
}

