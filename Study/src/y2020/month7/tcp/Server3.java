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
		
		ServerSocket ser=null; //서버쪽에서 필요한 객체들
		Socket so=null;	//서버쪽에서 필요한 객체들
	
		Scanner s=new Scanner(System.in);
		try {
			ser=new ServerSocket(8555);
		} catch(Exception e) {}
		System.out.println("연결 기다리고 있습니다.");
		//클라이언트가 연결 요청이 올 때까지 기다린다.
		try {
			so=ser.accept(); //연결 수락
		} catch(Exception e) {
			System.out.println("에러");
			System.exit(-1); //종료 x //System.exit(0); <-종료
		}
		System.out.println("기다린다..");
		//서버 쪽에서 클라이언트한테 메세지 보낸다.
		try {
			out=new BufferedWriter(new OutputStreamWriter(so.getOutputStream()));
			in=new BufferedReader(new InputStreamReader(so.getInputStream()));
		
		
		while(true) {
			String msg=in.readLine(); //행 단위로 읽어옴
			
			if(msg.equals("stop")) {
				System.out.println("종료");
				break;
			}
				System.out.println("보내기: ");
				String outmsg=s.nextLine();
				out.write(outmsg +"\n"); //행 단위로 내보냄
				out.flush(); //현재 버퍼에 저장되어 있는 내용을 클라이언트한테 전송하고 버퍼를 비운다.
		}
		}catch(Exception e) {}
			finally {
				
				try {			
					s.close();
					so.close();
					ser.close();
				}catch(Exception e) {
					System.out.println("오류 발생");
				}
			}
		}		
}