package y2020.month7.tcp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server1 {

	public static void main(String[] args) throws IOException {
		
		int port = 5050;
        
        //서버 소켓을 생성
        ServerSocket ssk = new ServerSocket(port); //서버 자신의 포트를 설정해준다.
         
        System.out.println("접속 대기중~ ");
         
        while(true) {
        Socket sock = ssk.accept(); // 새로운 소켓을 생성 클라이언트가 들어왔을때 , 접속했을때  실행되는 구문
        System.out.println("사용자 접속 했습니다");
        System.out.println("Client ip :"+ sock.getInetAddress());
        } //while
   }
}

