package y2020.month7.ncs;

/*
�����ڿ� Getter/Setter �޼ҵ�

������

- Ư���� ������ ������ �޼ҵ�

- ��ü�� �ʱ�ȭ�ϴ� ����.********************

- ���������� : public �ٸ��� �Ȱ���.

- ��ȯ�� ����. (void X -> �ƿ� ǥ�� ����)

- ���ڰ� ���� �� �ִ�.

- ������� ȣ�� �Ұ�
		

- new : ������, ��ü���� ������.

- �ڷ��� ������ = new������ ������.

- ������ : ��ü�� �ʱ�ȭ.
*/

class KeyBoard{
	private String model;
	private int price;
	
	//������1
	public KeyBoard(String model, int price) {
		this.model=model;
		this.price=price;
	}
	//������2
	public KeyBoard(String model) {
		this.model=model;
	}
	//������3
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
        k5.setModel("��1");
        k5.setPrice(10000);
	}
}
