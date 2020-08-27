package personal;

public class Thread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadTest t1 = new ThreadTest();
		ThreadTest t2 = new ThreadTest();
		
		//번갈아가면서 나옴(run)
		t1.run();
		t2.run();
		
	}

}
