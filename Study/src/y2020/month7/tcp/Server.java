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
			ser= new ServerSocket(); //1.서버 소켓 생성
			
			//2.서버 소켓과 서버 소켓이 연결되어 있는 ip주소와 포트번호 알아내는 방법
			ser.bind(new InetSocketAddress("localhost",5001));
			while(true) {
				System.out.println("연결 되기를 기다림");
				Socket so=ser.accept();
				
				//3.연결 요청을 수락하면서 소캣 생성한다.
				//4.연결된 클라이언트 쪽의 ip와 포트정보가 궁금함 //getRemoteSocketAddress()
				InetSocketAddress is= (InetSocketAddress)so.getRemoteSocketAddress();
				
				byte[]b=null;
				String msg=null;
				
				//소켓으로 읽어들어 들이는 작업
				InputStream in=so.getInputStream();
				b=new byte[100];
				int r=in.read(b);
				
				//메시지 바이트 배열 읽는다
				msg=new String(b,0,r,"UTF-8");
				//바이트 배열을 문자열로 바꾼다.
				System.out.println("데이터 받기 성공");
				
				OutputStream os=so.getOutputStream();
				msg="Hi Client";
				b=msg.getBytes("UTF-8"); //문자열을 바이트 단위로 변경해서 전송하겠다.
				os.write(b);
				System.out.println("데이터 보내기 성공");
					
				os.close();
				in.close();
				so.close();
				ser.close();
			}
			
		}catch(Exception e){}
		
	}
}
