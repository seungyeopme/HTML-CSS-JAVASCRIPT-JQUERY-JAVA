package y2020.month7;
/*

//study11.java ���ϰ� �Բ� ���̴� (�Ʒ� ÷��)
 
import java.io.Serializable;
public class Stu implements Serializable {
	
	//����ȭ �������̽�
	private String name;//�ʵ�	private�� Stu Ŭ���� ���ο����� ��� ���� 
	private String id;	//�ʵ�
	private int age;	//�ʵ�
	
	public String getName() {
		return name;		//��ȯ�Լ�
	}
	public void setName(String name) {
		this.name = name;	//�ʱ�ȭ �ڵ�
	}
	public String getId() {
		return id;	
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
*/


/*
//��ü �����ϴ� �۾�  Stu.java
public class study11 {
	public static void main(String[] args) throws IOException {
		
		ObjectOutputStream os=null;
		try {
			os=new ObjectOutputStream(new FileOutputStream("ob.dat"));
			
			Stu s=new Stu(); //��ä ����
			s.setName("��");
			s.setId("123");
			s.setAge(22);
			os.writeObject(s);
	
		}catch(Exception e) {}
		os.close();
	}
}
*/

/*
//��ü �о���̴� �۾� Stu.java
public class study11 {
	public static void main(String[] args) throws IOException {
	
		ObjectInputStream is=null;
		
		try {
			is=new ObjectInputStream(new FileInputStream("ob.dat"));
			
			Stu s=(Stu)is.readObject();	//Ŭ���� ����ȯ
			System.out.println(s.getName());
			System.out.println(s.getId());
			System.out.println(s.getAge());
		}catch(Exception e) {}
		is.close();
	}
}	
//��
//123
//22
*/