package y2020.month7.ncs;

public class num5 {
	public static void main(String[] args) {
		int a=1, b=4;
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {

				if(i==0 ||i==2 ) {
					System.out.printf("%4d", a);
					a++;
				}
				else if(i==1 || i==3) {
					a--;
					System.out.printf("%4d",a );
				}
			}
			System.out.println();
			a+=b;
		}
	}
}
/*
1   2   3   4
8   7   6   5
9  10  11  12
16  15  14  13
*/