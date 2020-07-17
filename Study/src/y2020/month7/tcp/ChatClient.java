package y2020.month7.tcp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
 
public class ChatClient {
    public static void main(String[] args) {
        if(args.length != 2) {
            System.out.println("사용법 : java ChatClient id 접속할 서버 ip");
            System.exit(1);
        }
        Socket sock = null;
        BufferedReader br = null;
        PrintWriter pw = null;
        boolean endflag = false;
        try {
            sock = new Socket(args[1], 10001);//아아디,포트
            pw = new PrintWriter(new OutputStreamWriter(sock.getOutputStream()));
            br = new BufferedReader(new InputStreamReader(sock.getInputStream()));
            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
            
            pw.println(args[0]);
            pw.flush();
            InputThread it = new InputThread(sock,br);
            it.start();
            String line = null;
            while((line = keyboard.readLine()) != null) {
                pw.println(line);
                pw.flush();
                if(line.equals("/quit")) {
                    endflag = true;
                    break;
                }
            }
            System.out.println("클라이언트 접속 종료");
        }catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(pw != null) {
                    pw.close();
                }
                if(br != null) {
                    br.close();
                }
                if(sock != null) {
                    sock.close();
                }
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
 
class InputThread extends Thread{
    private Socket sock = null;
    private BufferedReader br = null;
    public InputThread(Socket sock,BufferedReader br) {
        this.sock = sock;
        this.br = br;
    }
    public void run() {
        try {
            String line = null;
            while((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                if(br != null) {
                    br.close();
                }
                if(sock != null) {
                    sock.close();
                }
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
/*
접속을 기다립니다.
접속한 사용자의 아이디 : abc
접속을 기다립니다.
접속한 사용자의 아이디 : abc
접속을 기다립니다.
접속한 사용자의 아이디 : abc
접속을 기다립니다.
*/
/*
예를들어 ~~\eclipse-workspace\nio\bin 디렉토리 밑에 ChatClient.class 파일이 있다면

"java nio.ChatClient aaa localhost" 이런식으로 실행해야한다. (bin디렉토리에서 실행)

여기서 nio는 패키지 이름이고 만약 패키지 이름이 com.tistory.jeongpro 라면

"java com.tistory.jeongpro.ChatClient abc localhost" 이렇게 입력해야한다.
*/