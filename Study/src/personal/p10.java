package personal;
/*
class Data {int x;}

public class p10 {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = " + d.x);
	}
	
	static void change(int x) {	//기본형 매개변수
		x = 1000;
		System.out.println("change() : x = " + x);
	}

}
*/
/*
main() : x = 10
change() : x = 1000
After change(d.x)
main() : x = 10
*/

//change메소드에서 main메소드로부터 넘겨받은 d.x의 값을 1000으로 변경했는데도
//main 메소드에서는 d.x의 값이 그대로이다.

//'d.x'의 값이 변경된 것이 아니라, change메소드의 매개변수 x의 값이 변경된 것이다. 
//즉, 원본이 아닌 복사본이 변경된 것이라 원본에는 아무런 영향을 미치지 못한다.
//이처럼 기본형 매개변수는 변수에 저장된 값만 읽을 수만 있을 뿐 변경할 수는 없다.