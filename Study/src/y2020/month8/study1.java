package y2020.month8;

import java.util.Scanner;
//첫번째 방법
/*
두 사람이 게임을 한다.
1~3 사이의 정수를 랜덤하게 발생시켜 다 같은 수가 나오면 승리 한것.

객체배열로 구현.

실행 결과)
이름: 홍길동
이름: 김길동

홍길동: 엔터이외 아무키나 입력해라: ee
1 0 1

김길동: 엔터이외 아무키나 입력해라: ee
1 1 1

김길동이 이김.
*/
class rand {
	int d;
	String a;

	rand(String a) {
		this.a = a;
		for (int i = 0; i < a.length(); i++) {
			d = (int) (Math.random() * 3 + 1);
		}
	}
}
public class study1 {
	static int n = 1;
	static String str = "";
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		rand r[] = new rand[3];
		while (true) {

		if (n % 2 == 1) {
		str = "홍길동";
		}
		if (n % 2 == 0) {
		str = "김길동";
		}
		System.out.println(str + "엔터이외 아무키나 입력해라");
		String str1 = s.next();
		
		for (int i = 0; i < 3; i++) {
			r[i] = new rand(str1);
			System.out.print(r[i].d+" ");
		}
		if(r[0].d==r[1].d&&r[0].d==r[2].d) {
			System.out.println(str+"이 승리했다.");
			break;
		}
		n++;
		}
	}
}
/*
홍길동엔터이외 아무키나 입력해라
ee
2 1 3 김길동엔터이외 아무키나 입력해라
ee
1 3 3 홍길동엔터이외 아무키나 입력해라
ee
3 2 3 김길동엔터이외 아무키나 입력해라
ee
3 1 2 홍길동엔터이외 아무키나 입력해라
ee
2 3 3 김길동엔터이외 아무키나 입력해라
ee
1 1 3 홍길동엔터이외 아무키나 입력해라
ee
1 1 3 김길동엔터이외 아무키나 입력해라
ee
3 2 1 홍길동엔터이외 아무키나 입력해라
ee
3 2 1 김길동엔터이외 아무키나 입력해라
ee
2 3 2 홍길동엔터이외 아무키나 입력해라
ee
2 1 2 김길동엔터이외 아무키나 입력해라
ee
1 1 1 김길동이 승리했다.
*/