package y2020.month7;
/*

//study11.java 파일과 함께 쓰이는 (아래 첨부)
 
import java.io.Serializable;
public class Stu implements Serializable {
	
	//직렬화 인터페이스
	private String name;//필드	private는 Stu 클래스 내부에서만 사용 가능 
	private String id;	//필드
	private int age;	//필드
	
	public String getName() {
		return name;		//반환함수
	}
	public void setName(String name) {
		this.name = name;	//초기화 코드
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
//객체 저장하는 작업  Stu.java
public class study11 {
	public static void main(String[] args) throws IOException {
		
		ObjectOutputStream os=null;
		try {
			os=new ObjectOutputStream(new FileOutputStream("ob.dat"));
			
			Stu s=new Stu(); //객채 생성
			s.setName("준");
			s.setId("123");
			s.setAge(22);
			os.writeObject(s);
	
		}catch(Exception e) {}
		os.close();
	}
}
*/

/*
//객체 읽어들이는 작업 Stu.java
public class study11 {
	public static void main(String[] args) throws IOException {
	
		ObjectInputStream is=null;
		
		try {
			is=new ObjectInputStream(new FileInputStream("ob.dat"));
			
			Stu s=(Stu)is.readObject();	//클래스 형변환
			System.out.println(s.getName());
			System.out.println(s.getId());
			System.out.println(s.getAge());
		}catch(Exception e) {}
		is.close();
	}
}	
//준
//123
//22
*/