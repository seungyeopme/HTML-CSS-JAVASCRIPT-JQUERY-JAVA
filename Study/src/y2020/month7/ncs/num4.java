package y2020.month7.ncs;

class GetterSetter{
	private String name;
	private int age;
	private float height;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
}

public class num4 {
	public static void main(String[] args) {
	
		GetterSetter name = new GetterSetter();
		name.setName("aaa");
		System.out.println(name.getName());
	}
}
//aaa