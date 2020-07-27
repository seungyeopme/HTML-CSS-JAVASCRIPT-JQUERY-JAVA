package y2020.month7.ncs;

/*
생성자와 Getter/Setter 메소드

생성자

- 특수한 목적을 가지는 메소드

- 객체를 초기화하는 역할.********************

- 접근지정자 : public 다른애 안가짐.

- 반환값 없다. (void X -> 아예 표기 안함)

- 인자값 가질 수 있다.

- 마음대로 호출 불가
		

- new : 연산자, 객체생성 연산자.

- 자료형 변수명 = new연산자 생성자.

- 생성자 : 객체를 초기화.
*/

class KeyBoard{
	private String model;
	private int price;
	
	//생성자1
	public KeyBoard(String model, int price) {
		this.model=model;
		this.price=price;
	}
	//생성자2
	public KeyBoard(String model) {
		this.model=model;
	}
	//생성자3
	public KeyBoard(int price) {
		this.price=price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
public class num2 {
	public static void main(String[] args) {
		
		/*
		 KeyBoard k5 = new KeyBoard("B200", 7000);
	     KeyBoard k6 = new KeyBoard(7000);
	     KeyBoard k7 = new KeyBoard("B200");
	     */
		KeyBoard k5 = new KeyBoard(0);
        k5.setModel("모델1");
        k5.setPrice(10000);
	}
}
