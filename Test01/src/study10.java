import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
Character.toUpperCase(ch);	// 대문자
Character.isLowerCase(ch);	// 소문자
*/

/*
public class study10 {
	public static void main(String[] args) throws IOException {
		
		
		//system.dat 파일을 생성
		FileWriter f=new FileWriter("system.dat");
		
		f.write("월요일이네요\n");
		f.write("화이팅~\n");
		f.write("자바공부");
		}
}
*/

/*
public class study10 {
	public static void main(String[] args) throws IOException {
		
		//system.dat 파일을 생성
		FileWriter f=new FileWriter("system.dat");
		BufferedWriter b=new BufferedWriter(f);
	
		b.write("월요일이네요");
		b.newLine();
		b.write("화이팅~");
		b.newLine();
		b.write("자바공부");
		b.close();
		}
}
*/

/*
public class study10 {
	public static void main(String[] args) throws IOException {
		FileWriter f=new FileWriter("system.dat");
		BufferedWriter b=new BufferedWriter(f);
		
		char a[] = new char[] {'월', '요', '일'}; //월요일
	
		b.write(a);
		b.close();
		}
}
*/

/*
class AA{
		int a;
		double b;
		void show() {
			System.out.println(a+ " "+b); //10 3.5
		}
	}
public class study10 {
	public static void main(String[] args) {
		
		AA aa=new AA();
		aa.a=10;
		aa.b=3.5;
		aa.show();
	}
}
*/

/*
class Food{
	String menu;	//필드
	int price;		//필드
	
	void pp(int p) {	//음식 추가 함수(메소드)
		price+=p;
	}
	void show() {		//메소드
		System.out.println(price+ " "+menu);	//10000 pizza
	}
}

public class study10 {
	public static void main(String[] args) {
	//객체생성
		Food f = new Food();
		f.menu="pizza";
		f.price=0;
		f.pp(10000);
		f.show();
		
		Food f1=new Food();
		f1.menu="pasta";
		f1.pp(10000);
		f1.show();
		
	}
}
*/

/*
class Anidog{
	String kind;
	int age;
	String name;
	
	public void print() {
		System.out.println(kind+ " "+age+" "+name);
	}
}
public class study10 {
	public static void main(String[] args) {
		Anidog ad= new Anidog();
		ad.kind = "강아지";
		ad.age = 1;
		ad.name="소리";
		ad.print();
	}
}
*/

/*
class Student
{
    int m_nKor;
    int m_nEng;
    int m_nMat;
    
    // static 
    static String g_strTeacher = "김구";
}
public class study10 {
	public static void main(String[] args) {
		Student obj = new Student();
        // obj.m_nKor = 30;
        // 인스턴스 변수는 초기화 하지 않으면 자동으로 0의 값을 가지며
        // 반드시 객체 이름으로만 호출해야 합니다.
        obj.m_nEng = 40;
        obj.m_nMat = 50;
        System.out.println("obj의 국어점수 = " + obj.m_nKor);
        System.out.println("obj의 수학점수 = " + obj.m_nMat);
        System.out.println("obj의 영어점수 = " + obj.m_nEng);
        
        // 클래스로 통해 접근
        System.out.println("Student의 선생님= " + Student.g_strTeacher);
        // 객체 생성을 통해 접근
        System.out.println("obj의 선생님= " + obj.g_strTeacher);
        // 클래스를 통해 접근하여 값 바꾸기
        Student.g_strTeacher = "안중근";
        System.out.println("obj의 선생님= " + obj.g_strTeacher);
	}
}
//obj의 국어점수 = 0
//obj의 수학점수 = 50
//obj의 영어점수 = 40
//Student의 선생님= 김구
//obj의 선생님= 김구
//obj의 선생님= 안중근
*/

/*
class Student
{
    // 멤버 변수
    int m_nKor;
    int m_nEng;
    int m_nMat;
    
    // 멤버 변수의 값을 정해주는 set 메소드
    public void set(int a, int b, int c)
    {
        m_nKor = a;
        m_nEng = b;
        m_nMat = c;
    }
    
    // 접근지정자가 public이고
    // 반환값이 double형인
    // 국, 영, 수의 평균을 구하는 함수
    public double calc()
    {
        double avg;
        avg = (m_nKor + m_nEng + m_nMat) / 3.0;
        return avg;
    }
    
    // 접근지정자가 public이고
    // 반환 값이 없고
    // 평균을 출력해주는 함
    public void disp()
    {
        System.out.println("평균은 " + calc() + "입니다.");
    }
}

public class study10 {
	public static void main(String[] args) {
		Student obj = new Student();    // 객체 생성
        
        // 국, 영, 수 점수 정하기
        obj.set(80, 65, 85);
        
        //평균 출력
        obj.disp();
	}
}
//평균은 76.66666666666667입니다.
*/


//1.	FileOutputStream을 이용하여 byte[] 배열 속에 들어있는 값을 test.txt파일에 저장해라.
//byte b[]={4,6,7,8,-1,24};
/*
public class study10 {
	public static void main(String[] args) throws IOException {
		byte b[] = {4,6,7,8,-1,24};
		
		
			FileOutputStream f=new FileOutputStream("test.txt");
			
			for(int i=0; i<b.length; i++) {
				f.write(b[i]);
			}
	}
}
*/

	

//2	FileInputStream을 이용하여 test.txt파일을 읽어 byte[] 속에 저장하고 화면에 출력해라.
/* 첫번째 방법
public class study10 {
	public static void main(String[] args) {
		try (
                FileReader rw = new FileReader("test.txt");
                BufferedReader br = new BufferedReader( rw );
			)
		
		{
			//읽을 라인이 없을 경우 br은 null을 리턴한다.
            String readLine = null ;
            while( ( readLine =  br.readLine()) != null ){
                System.out.println(readLine);
            }
        }	catch ( IOException e ) {
            System.out.println(e);
        }
	}
}
//4 6 7 8 -1 24
*/

// 두번째 방법 시작
/*
public class study10 {
	public static void main(String[] args) throws IOException {
		byte b[] = {4,6,7,8,-1,24};
		
		
			FileOutputStream f=new FileOutputStream("test1.txt");
			
			for(int i=0; i<b.length; i++) {
				f.write(b[i]);
			}
	}
}
*/

/*
public class study10 {
	public static void main(String[] args) throws IOException {
		
		FileInputStream in=new FileInputStream("test1.txt");
		int r, i=0;
		byte[] a=new byte[6];
		
		while((r=in.read())!=-1) {
			a[i]=(byte)r;	//byte 배열 읽어와서 그 값을 다시 byte 배열에 저장
			//4 6 7 8 -1 24
			i++;
		}
		for(int k=0; k<a.length; k++) {
			System.out.print(a[k]+" ");
		}
		in.close();
	}
}
*/
//두번째 방법 끝

/*
//3. 복권의 번호와 추첨한 복권의 번호를 확인하여 일치하는 번호의 개수를 출력하는 프로그램. 
//   배열은 main함수에 선언하고 두 배열에서 일치하는 번호를 찾아 그 개수를 반환해라.
//main(){
//int lottop[]={4,10,25,30,45,47};
//int my[]={1,4,7,26,45,48};
//int r;

//r=same(lotto,my);
//System.out.println(“일치하는 번호의 개수:%d\n”, r);}

public class study10 {
	static int same(int a[],int b[]) {
		int cnt=0;
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					cnt++;
				}
			}
		}
		return cnt;
	}
public static void main(String[] args) {

	int lotto[]={4,10,25,30,45,47};
	int my[]={1,4,7,26,45,48};
	int r;

	r=same(lotto,my);
	System.out.printf("일치하는 번호의 개수:%d\n", r);
	}
}
//일치하는 번호의 개수:2
*/

/*
//4. show()함수를 배열을 역순으로 출력하는 함수로 정의해라.
//main(){
// int ary[]{6,2,8,4,9};
// show(ary);}

public class study10 {
	static void show(int[] a) {
		
		int temp;
		int[] b = new int[a.length];
		
		for (int i = 0; i < a.length/2; i++) {
			temp = a[i];
			a[i] = a[a.length - 1 - i];
			a[a.length - 1 - i] = temp;
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]);
		}
			System.out.println();
	}
	
	public static void main(String[] args) {
		
		 int ary[]={6,2,8,4,9};
		 show(ary);
	}
}
//94826
*/

/*
//5.	다음 배열의 전체 합과 평균 출력(소수점 첫째자리까지)
//main(){
//  int [][]ary ={{43,97},{34,77,87},{100,95,38,89}}; }

public class study10 {
	public static void main(String[] args) {
		int [][]ary ={{43,97},{34,77,87},{100,95,38,89}}; 
		
		int sum = 0;
		int cnt = 0;
		double avg = 0.0;
		
		for(int i=0; i<ary.length; i++) {
			for(int j=0; j<ary[i].length; j++) {
				sum+=ary[i][j];
				cnt++;
			}
		}
		avg=sum/cnt;
		
		System.out.println(sum);
		System.out.println(avg);
	}
}
//660
//73.0
*/

/*
//6. 다섯명의 학생의 점수를 입력하여 유효점수와 평균 출력하는 프로그램
//유효점수는 최고점과 최저점을 제외한 점수이며 평균은 유효점수로 계산해라.
//(for-if문 중첩, contine사용)
//실행결과) 5명 학생 점수 입력 : 1 2 3 4 5
//        유효 점수: 2 3 4
//        평균: 3.0

public class study10 {
	public static void main(String[] args) {
	
		int score[]=new int[5];
		int max,min,sum=0;
		int maxindex,minindex;
		double avg;
		
		Scanner s=new Scanner(System.in);
		
		System.out.println("5명 학생 점수 입력");
		for(int i=0; i<score.length;i++) {
			score[i]=s.nextInt();
		}	//80 90 100 60 90
		max=min=score[0];
		maxindex=minindex=0;
		
		for(int i=1; i<score.length;i++) {
			if(score[i]>max) {
				max=score[i];
				maxindex=i;	//최고점이 있는 위치를 저장
			}
			if(score[i]<min) {
				min=score[i];
				minindex=i;	//최저점이 있는 위치를 저장
			}
		}
		System.out.println("유효 점수: ");
		for(int i=0; i<5;i++) {
			if(i==maxindex || i==minindex) {
				continue;	//최고, 최저가 있는 인덱스 제외
			}
			else {
				sum+=score[i];
			}
		}
		System.out.println(sum/3.0);
	}
}
//5명 학생 점수 입력
//100 50 70 21 44
//유효 점수: 
//54.666666666666664
*/


/*
//7. Sample.txt파일에 “저는 자바를 좋아합니다”를 저장하고 파일을 읽어 화면에 출력해라.
//(String [] 배열로 초기화해서 for문으로 읽기)

//sample.txt에 저장
public class study10 {
	public static void main(String[] args) throws IOException {
		BufferedWriter b=
				new BufferedWriter(new FileWriter("sample.txt"));
		
		String a="저는 자바를 좋아합니다";
		b.write(a);
		b.close();
	}
}
*/

/*
//화면 출력
public class study10 {
	public static void main(String[] args) throws IOException {
		BufferedReader in=
				new BufferedReader
				(new FileReader("sample.txt"));
		String b[]=new String[1];
		for(int i=0; i<b.length;i++) {
			b[i]=in.readLine();
			System.out.println(b[i]);	//저는 자바를 좋아합니다
		}
	}
}
*/

/*
class Aa{
	private int age;
	public double ki;
	protected String name;
	int id;
}
public class study10 {
	public static void main(String[] args) {
	
		Aa a=new Aa();
//		a.age=10; age는 private여서 접근 안됨
		a.ki=177.7;
		a.name="홍길동";
		a.id=123;
	}	
}
*/

/*
//첫번째 방법
public class study10 {
	public static void main(String[] args) throws IOException {
		
		// 입력받은 텍스트를 tt.txt에 저장하는 프로그램
		// 출력
		InputStreamReader in=
				new InputStreamReader(System.in);
		FileWriter fout=null;
		fout=new FileWriter("tt.txt");
		int r;
		
		while((r=in.read())!=-1) {
			fout.write(r);
		}
		in.close();
		fout.close();
	}
}
*/

/*
//두번째 방법
public class study10 {
	public static void main(String[] args) throws IOException {
		// 입력받은 텍스트를 tt.txt에 저장하는 프로그램
		// 출력
				BufferedReader in
					= new BufferedReader(new InputStreamReader(System.in));
				FileWriter fout=null;
				fout=new FileWriter("tt.txt");
				String r;
				
				while((r=in.readLine())!=null) {
					fout.write(r);
				}
				in.close();
				fout.close();
	}
}
*/

/*
class Car{
	private String color;
	private int speed;

	Car(){					//생성자
		color = "빨강";
		speed = 0;
	}
	public String getColor() {
		return color;		//메소드
}
	public int getSpeed() {
		return speed;		//메소드
	}
}

public class study10 {
	public static void main(String[] args) {
	
	// 생성자 = 함수 구조와 비슷
	// 반환형이 없다.
	// 클래스 이름과 동일하다.
	
		Car c1=new Car();	//객체 생성과 동시에 생성자 호출
		Car c2=new Car();	//객체 생성과 동시에 생성자 호출
		
		System.out.println(c1.getColor()+""+c1.getSpeed());
		System.out.println(c2.getColor()+""+c1.getSpeed());
	}
}
*/

//this ->  1.필드 이름, 매개변수의 이름이 같을 때 구분하는 키워드
//		   2.this() -> 다른 생성자 호출

/*
class Car {
	private String modelName;
    private int modelYear;
    private String color;
    private int maxSpeed;
    private int currentSpeed;
   
    Car(String modelName, int modelYear, String color, int maxSpeed) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.currentSpeed = 0;
    }
    public String getModel() {
        return this.modelYear + "년식 " + this.modelName + " " + this.color;
    }
}
public class study10 {
	public static void main(String[] args) {
		Car myCar = new Car("아반떼", 2016, "흰색", 200); // 생성자의 호출
		System.out.println(myCar.getModel()); // 생성자에 의해 초기화되었는지를 확인함.
	}
}
//2016년식 아반떼 흰색
*/

/*
//	*메소드 오버로딩*
//	같은 클래스 내에서 메소드의 이름이 같아도 파라미터의 개수나 데이터 형식만 다르면 여러개를 선언할 수 있는 것을 말한다.
//	생성자도 메소드의 일종이므로 메소드 오버로딩을 할 수 있다. 

class Book{
	String title;	//필드
	int price;		//필드
	
	void show() {	//메소드
		System.out.println(title+ " " +price);
	}
	
	Book() {			//기본 생성자
		this("",0);		//다른 생성자 호출 (매개변수 2개가 있는)
		System.out.println("생성자 호출!");	//생성자가 호출될 때 기본 생성자가 가장 먼저 호출된다! 객체로 출력하지 않는 이상!
	}
	Book(String title){	//생성자
		this(title, 0);	//this => 다른 생성자 호출(매개변수 2개가 있는)
	}
	Book(String title, int price){	//생성자
		this.title=title;
		this.price=price;
	}	
}
public class study10 {
	public static void main(String[] args) {
		
		Book b=new Book("고양이", 30000);
		Book b1=new Book("신곡");
		Book b2=new Book();
		
		b.show();
		b1.show();
		b2.show();
	}
}
*/

/*
class Tv{
	String company;
	int size;
	void show() {
		System.out.println(company+ " " +size+"인치tv");	//삼성 20인치tv
	}
}
public class study10 {
	public static void main(String[] args) {
		
		Tv t=new Tv();
		t.company="삼성";	//필드
		t.size=20;		//필드
		t.show();	//삼성 20인치 tv
		
		//클래스 이름? Tv
		//객체 이름? t
		//함수 이름? show
	}
}
*/

/*
class Tv{
	String company;
	int size;
	//생성자: 초기화 과정
		Tv(String company, int size) {
			this.company=company;
			this.size=size;
		}//저장한 값을 필드에 초기화하는 과정
			void show() {
				System.out.println(company+ " " +size+"인치tv");	//삼성 20인치tv
			}
		}
public class study10 {
	public static void main(String[] args) {
		Tv t=new Tv("삼성",20);
		t.show();	//삼성 20인치 tv
	}
}
*/

/*
class Music{
	String title;	
	
	Music(String title){
		this.title=title;
	}
}
public class study10 {
	public static void main(String[] args) {
	
		Music m=new Music("a");
		System.out.println(m.title);	//a
	}
}
*/

/*
class Pet{
	String type;	//애완동물 종류
	int age;		//애완동물 개월 수
	
	void move() {
		System.out.println(this.type+"가 움직입니다.");
	}
	
	int getAge() {
		return this.age;
	}
}

public class study10 {
	public static void main(String[] args) {
		Pet pet1 = new Pet();
		pet1.type = "강아지";
		pet1.age = 8;
		
		Pet pet2 = new Pet();
		pet1.type = "고양이";
		pet1.age = 13;
		
		pet1.move();
		pet2.move();
		
		System.out.println(pet1.type + "는 " + pet1.age + "개월입니다.");
		System.out.println(pet2.type + "는 " + pet2.age + "개월입니다.");
	}
}
//고양이가 움직입니다.
//null가 움직입니다.
//고양이는 13개월입니다.
//null는 0개월입니다.
*/

/*
class Music{
	String title;
	Music(String title) {
		this.title=title;
	}
}
public class study10 {
	public static void main(String[] args) {
		
		Music m1=new Music("on");
		Music m2=new Music("dna");
		System.out.println(m1.title);
		System.out.println(m2.title);
	}
}
//on
//dna
*/

/*
class Circle{
	double a;
	Circle(double a){
		this.a=a;
	}
	public void area() {
		System.out.println(3.14*a*a);	//7.0649999999999995
	}
}
public class study10 {
	public static void main(String[] args) {
	
		Circle c1=new Circle(1.5);	//반지름
		c1.area();					//윈 면적 3.14*1.5*1.5
	}
}
*/


/*
class Profile{
	String a,b;
	
	Profile(String a, String b){
		this.a=a;
		this.b=b;
	}
}
public class study10 {
	public static void main(String[] args) {
		//모든 데이터 출력
		Profile p1=new Profile("010-1234-5678","두희");
		Profile p2=new Profile("010-2345-7890","지혜");
		
		System.out.println(p1.a + " "+p1.b);
		System.out.println(p2.a + " "+p2.b);
	}
}
//010-1234-5678 두희
//010-2345-7890 지혜
*/


/*
class Pro{
	String name;
	
	Pro(String name){
		this.name=name;
	}

	public String get() {
	return name;
	}
}
public class study10 {
	public static void main(String[] args) {
		
		Pro p1=new Pro("경찬");
		Pro p2=new Pro("동혁");
		//1. 클래스 만들기
		//2. 문자열 필드
		//3. 생성자
		//4. 이름 반환받는 get
		System.out.println("이름은 "+p1.get());
		System.out.println("이름은 "+p2.get());
	}
}
//이름은 경찬
//이름은 동혁
*/

/*
public class study10 {
	private int x1 = 0;
	private int y1 = 0;
	private int x2 = 0;
	private int y2 = 0;
	
	public study10(int x1, int y1) {
		this(x1, y1, 30, 40);
	}
	
	public study10(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
	}
	
	public static void main(String[] args) {
		study10 cal = new study10(10,20);
		
		System.out.println("x1 : " + cal.x1);
		System.out.println("y1 : " + cal.y1);
		System.out.println("x2 : " + cal.x2);
		System.out.println("y2 : " + cal.y2);
	}
}
//x1 : 10
//y1 : 20
//x2 : 30
//y2 : 40
*/

/*
class Rec{
	int a,b; //인스턴스 변수 or 필드
	Rec(int a,int b){
		this.a=a;
		this.b=b;
	}
	
	void area(){
	System.out.println(a*b);
}

}
public class study10 {
	public static void main(String[] args) {
		
		Rec r1=new Rec(4,7);
		Rec r2=new Rec(7,9);
		
		r1.area();	//4*7
		r2.area();	//7*9
	}
}
//28
//63
*/

/*
class AA{
	static int n=0;	//클래스 변수
	AA(){	//생성자
		in();	//메소드 호출
	}
	void in() {	//메소드
		n++;	//1
	}
}
public class study10 {
	public static void main(String[] args) {
		
		AA a=new AA();	//생성자 호출 n=1
		a.n++;	//n=2
		AA.n++; //n=3 <-클래스 변수는 클래스명으로 접근 가능하다.
		System.out.println(AA.n);	//3
	}
}
*/

/*
// 인스턴스 변수
// 인스턴스 변수를 사용하기 위해서는 객체를 생성해야 한다!!
public class study10{
	int x=3; 	//인스턴스 변수
	int y; 		//인스턴스 변수

	public static void main(String[] args) {
		study10 ivd = new study10();
		ivd.y = 5;
	
		System.out.println(ivd.x);
		System.out.println(ivd.y);
	}
}
//3
//5
*/

/*
class RadioOption{
	static String color = "white"; // 클래스 변수
	int volume = 5; 		//인스턴스 변수
	boolean power = false; 	//인스턴스 변수
}

public class study10{
	static int x = 10; //클래스 변수
	public static void main(String[] args) {
		System.out.println(RadioOption.color); //클래스 변수는 인스턴스화 하지 않고도 사용 가능
		//System.out.println(RadioOption.volume); //오류!!
		
		RadioOption ro = new RadioOption();
		ro.power = true;
		System.out.println(ro.power);
		
		int x = 100;	//지역변수
		
		System.out.println(x);
	}
}
//white
//true
//100

// 1.클래스 변수와 지역변수는 이름이 같아도 됩니다.
// 2.같은 변수의 이름인 x를 출력할 때 같은 구역에 지역변수가 있다면 지역변수가 출력
// 3.클래스 변수에 접근 시 항상 클래스이름.클래스변수 형식으로 사용하기

//세 종류의 변수가 메모리에 올라오는 시기가 다르다
// 1.클래스 변수는 클래스가 메모리에 올라올 때 생성
// 2.인스턴스 변수는 객체가 생성 될 때 (new를 사용해 메모리를 할당 할 때)생성
// 3.지역 변수는 선언문이 수행 될 때 생성됩니다.
*/
