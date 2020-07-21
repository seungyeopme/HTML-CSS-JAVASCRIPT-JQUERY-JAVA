package y2020.month7.tcp;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client1 {

	public static void main(String[] args) throws Exception, IOException {
		
		 // 연길시에 소켓이 생성된다. 연결이 안될경우에는 예외발생한다.
        Socket sk = new Socket("172.16.7.69" , 5050) ;
        System.out.println("서버와 접속이 되었습니다.");
	}
}