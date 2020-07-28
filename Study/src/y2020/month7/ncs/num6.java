package y2020.month7.ncs;

class Num{
	int sum=0;
	int max=0;
	int n;
	Num(){
		n=0;
	}
	Num(int n){
		this.n=n;
		sum+=n;
		if(max<n)
			max=n;
	}
	void add(int n) {
		sum+=n;
		if(max<n) {
			max=n;
		}
	}
	int getSum() {
		return sum;
	}
	int getMax() {
		return max;
	}
}
public class num6 {

	public static void main(String[] args) {
		
		Num nb = new Num();
		nb.add(7); 
		nb.add(-1);
		nb.add(20);
	
		nb.add(5);
	
		System.out.println("Sum = "+nb.getSum());
		System.out.println("Max = "+nb.getMax());
		
		Num nb1=new Num(20);
		System.out.println(nb1.getSum());
		System.out.println(nb1.getMax());
	}
}
/*
Sum = 31
Max = 20
20
20
*/

