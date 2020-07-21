package y2020.month7.tcp;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {
	public static void main(String[] args) {
		
		Socket s=null;
		try {
			s=new Socket();
			System.out.println("연결 요청");
			s.connect(new InetSocketAddress("localhost",5001));
			
			System.out.println("연결 성공");
		
			byte[] b=null;
			String msg=null;
			
			OutputStream os=s.getOutputStream();
			msg="Hi Server";
			b=msg.getBytes("UTF-8"); //문자열을 바이트 단위로 변경해서 전송하겠다.
			os.write(b);
			System.out.println("데이터 보내기 성공");
			
			InputStream in=s.getInputStream();
			b=new byte[100];
			int r=in.read(b);
			
			//메시지 바이트 배열 읽는다
			msg=new String(b,0,r,"UTF-8");
			//바이트 배열을 문자열로 바꾼다.
			System.out.println("데이터 받기 성공");
			
			in.close();
			os.close();
			s.close();
		}catch(Exception e) {}
	}
}