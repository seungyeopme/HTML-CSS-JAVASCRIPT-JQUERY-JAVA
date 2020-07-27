package y2020.month7.ncs;

class Tv1{
    private String color;
    private boolean power;
    private int ch;
    
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean getPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getCh() {
		return ch;
	}
	public void setCh(int ch) {
		this.ch = ch;
	}
}



public class num3 {
	public static void main(String[] args) {
		
		Tv1 t1 = new Tv1();	//객체 생성
		
		t1.setColor("red");//setColor라는 매서드를 통하여 red를 넣어 줌
		t1.setPower(true); //setPower라는 매서드를 통하여 true를 넣어 줌
        t1.setCh(7); //setCh라는 매서드를 통하여 7을 넣어 줌
        
        System.out.println(t1.getColor());
        System.out.println(t1.getPower());
        System.out.println(t1.getCh());
	}
}
/*
red
true
7
*/
