package y2020.month7.tcp;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client1 {

	public static void main(String[] args) throws Exception, IOException {
		
		 // ����ÿ� ������ �����ȴ�. ������ �ȵɰ�쿡�� ���ܹ߻��Ѵ�.
        Socket sk = new Socket("172.16.7.69" , 5050) ;
        System.out.println("������ ������ �Ǿ����ϴ�.");
	}
}