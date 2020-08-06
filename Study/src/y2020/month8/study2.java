package y2020.month8;

import java.util.Scanner;
//두번째 방법
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
class game{
	public game(int ary[],int ary2[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("플레이어 1 이름 입력");
		String n=s.next();
		System.out.println("플레이어 2 이름 입력");
		String n1=s.next();

		System.out.println(n+"엔터이외 아무키나 입력해라 !");
		
		for(int i=0; i<ary.length;i++) {
			int ran=(int)(Math.random()*2);
			ary[i]=ran;
			System.out.println(ary[i]);
		}

		System.out.println(n1+"엔터이외 아무키나 입력해라 !");
		for(int i=0; i<ary.length;i++) {
			int ran1=(int)(Math.random()*2);
			ary2[i]=ran1;
			System.out.println(ary2[i]);
		}
		
		if(ary[0]==ary[1]&&ary[1]==ary[2]) {
			System.out.println(n+"이 이김");
		}else if(ary2[0]==ary2[1]&&ary2[1]==ary2[2]) {
			System.out.println(n1+"이 이김");
		}else {
			System.out.println("다같은수가 나온사람은 없습니다 ");
		}
	}
}
public class study2 {
	public static void main(String[] args) {
		
		int[] ary= new int[3];
		int[] ary2=new int[3];

		game g =new game(ary,ary2);
	}
}
/*
플레이어 1 이름 입력
홍길동 
플레이어 2 이름 입력
김지수
홍길동엔터이외 아무키나 입력해라 !
1
1
1
김지수엔터이외 아무키나 입력해라 !
1
0
0
홍길동이 이김
*/
/*
플레이어 1 이름 입력
aaa
플레이어 2 이름 입력
bbb
aaa엔터이외 아무키나 입력해라 !
0
1
1
bbb엔터이외 아무키나 입력해라 !
1
1
0
다같은수가 나온사람은 없습니다 
*/