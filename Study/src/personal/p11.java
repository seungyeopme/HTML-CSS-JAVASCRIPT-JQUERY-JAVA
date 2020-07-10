package personal;
/*
class Data {int x;}

public class p11 {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d);
		System.out.println("After change(d)");
		System.out.println("main() : x = " + d.x);
	}
	
	static void change(Data d) {	//참조형 매개변수
		d.x = 1000;
		System.out.println("change() : x = " + d.x);
	}

}
*/
/*
main() : x = 10
change() : x = 1000
After change(d)
main() : x = 1000
*/

//이전 예제와 달리 change메소드를 호출한 후에 d.x의 값이 변경되었다. change메소드의
//매개변수가 참조형이라서 값이 아니라 '값이 저장된 주소'를 change메소드에게 넘겨주었기
//때문에 값을 읽어오는 것뿐만 아니라 변경하는 것도 가능하다.