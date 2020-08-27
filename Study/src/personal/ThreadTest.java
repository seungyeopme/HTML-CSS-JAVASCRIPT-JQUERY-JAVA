package personal;

public class ThreadTest extends Thread {

	public void run() {
		//인터럽트 시 예외처리
		try {
			for(int i=0; i<10; i++) {
				Thread.sleep(500);//스레드 0.5초 동안 대기
				System.out.println("Thread: "+i);
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	}

}
