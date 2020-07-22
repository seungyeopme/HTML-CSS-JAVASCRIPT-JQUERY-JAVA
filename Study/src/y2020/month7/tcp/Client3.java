package y2020.month7.tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;


//Java soldesk source 
//2020.07.22
public class Client3 {
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Socket so=null;
		BufferedWriter out=null;
		BufferedReader in=null;
		
		Scanner s=new Scanner(System.in);
		
		//TCP -> ACK -> NACK
		try {
		so=new Socket("localhost",8555);
		
		in=new BufferedReader(new InputStreamReader(so.getInputStream()));
		out=new BufferedWriter(new OutputStreamWriter(so.getOutputStream()));
		
		while(true) {
			System.out.println("º¸³»±â: ");
			String outmsg=s.nextLine();
			
			if(outmsg.equalsIgnoreCase("stop")) {
				out.write(outmsg+"\n");
				out.flush();
				break;
			}
			
			out.write(outmsg+"\n");
			out.flush();
			
			String msg=in.readLine();
			System.out.println(msg);
		}
	}catch(Exception e) {}
		s.close();
		so.close();
	}
}
