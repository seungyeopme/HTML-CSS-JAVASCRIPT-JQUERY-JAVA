package y2020.month7.swing_ex;

public class MainProcess {

	 LoginView loginView;
	 TestFrm testFrm;
	   
	    public static void main(String[] args) {
	       
	        // ����Ŭ���� ����
	        MainProcess main = new MainProcess();
	        main.loginView = new LoginView(); // �α���â ���̱�
	        main.loginView.setMain(main); // �α���â���� ���� Ŭ����������
	    }
	   
	    // �׽�Ʈ������â
	    public void showFrameTest(){
	        loginView.dispose(); // �α���â�ݱ�
	        this.testFrm = new TestFrm(); // �׽�Ʈ������ ����
	    }
}
