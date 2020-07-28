package y2020.month7.ncs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	String a,b;
	int c;
	
	Student(String a, String b, int c) {
		this.a=a;
		this.b=b;
		this.c=c;
	}
	void show() {
		System.out.println(a+""+b+""+c);
	}
}
public class num8 {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		Student s= new Student("jack","123",20);
		ObjectOutputStream o=new ObjectOutputStream(new FileOutputStream("javat.txt"));
		s.show();
		o.writeObject(s);
		o.close();
		
		ObjectInputStream i=new ObjectInputStream(new FileInputStream("javat.txt"));
		Student s1=(Student)i.readObject();
		s1.show();
		i.close();
	}
}
/*
jack12320
jack12320
*/
