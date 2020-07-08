import java.util.Scanner;

public class study6 {
public static void main(String[] args) {
	
/*
	static int[] arr() {
		int a[] = new int[4];
		int b = a.length;
		for(int i=0; i<b; i++) 
			a[i] = i;
		return a;
}


	public static void main(String[] args) {
		int a[] = arr();
		for(int i=0; i<a.length; i++)
			System.out.print(a[i] + " ");	// 0 1 2 3
	}
}
*/
		
		/*
		 while문을 이용해서 정수 여러 개 입력 받는다
		-1이 입력되면 입력종료!
		입력받은 수 다 출력
		Scanner s = new Scanner(System.in);
		int n;
		while((n=s.nextInt())!=-1) {
			System.out.println(n);
		}
		*/
		
		
		
		//1.	1~10까지 합을 구해라. (for, while, do~while)
		
		//for
		/*int sum=0;
		for(int i = 1; i<=10; i++) {
			sum=sum+i;
		}
		System.out.println(sum);
		*/
		
		//while
		/*
		int i=1,sum=0;
		while(i<=10) {
			sum+=i;
			i++;
		}
	
		System.out.println(sum);
		*/
		
		/*
		//do~while
		int i=1, sum=0;
		do {
			sum+=i;
			i++;
		}while(i<=10);
		System.out.println(sum);
		*/
		
		//2.	while문을 이용하여 정수를 여러 개 입력받고 평균 출력해라. (0이 입력되면 입력이 종료된다.)
		/* 첫번째 방법
		Scanner s = new Scanner(System.in);
		int num, sum =0; 
		int count =0;
		while(true) {
			System.out.println("정수를 여러 개 입력해주세요(종료 0)");
			num = s.nextInt();
			if(num==0) {
				System.out.println("프로그램 종료 \n");
				break;
			}
			count++;
			sum+=num;
		}
		System.out.printf("총 %d개의 점수 평균은 %.1f입니다.",count, sum/(double)count);
		*/
		
		/* 두번째 방법 (클린 코드)
		Scanner s = new Scanner(System.in);
		int i, sum=0, count=0;
		while((i=s.nextInt())!=0) {
			count++;
			sum+=i;
		}
		System.out.println(sum/count);
		*/
		
		//3. 다음 while문을 보고 실행결과가 동일하게 나오도록 2가지 과정으로 바꿔라.
		/*
		int i=0, sum=0;
		while(i<10){
		i=i+2;
		sum +=i;
		}
		System.out.println(sum); //30
		*/
		
		//3.1) while(true)와 break를 사용하여 바꿔라.
		/* 첫번째 방법
		int i=0, sum=0;
		while(true) {
			if(i<10) {
			i=i+2;
			sum+=i;
			}
			else {
				System.out.println(sum);
				break;
			}
		}
		*/
		/* 두번째 방법 (클린 코드)
		int i=0, sum=0;
		while(true) {
			i=i+2;
			sum+=i;
			if(i>=10) {
				break;
			}
		}
		System.out.println(sum);
		*/
		
		//3.2) do~while문, continue을 사용하여 바꿔라.
		/* 
		int i=0, sum=0;
		do {
			i++;
			if(i%2==1) {
				continue;
			}
			sum+=i;
		}while(i<10);
		System.out.println(sum);
		*/
		

		//4-1) 10개의 문자를 가지는 배열 a를 선언하고 생성해라.
		//char[] a = new char[10];
		
		//4-2) 0~4까지 정수형으로 초기화된 배열 b를 선언하고 생성해라.
		//int[] b = {0,1,2,3,4}; 
		//int b[] = new int[] {0,1,2,3,4};
		
		//4-3) “java”, “c”, “c++”로 초기화된 배열 c를 선언하고 생성해라.
		//String[] c = {"java", "c", "c++"};
		//String [] c = new String[] {"java", "c", "c++"};
		
		//4-4) 인덱스의 최대값이 9인 정수형 배열 d를 선언하고 생성해라.
		//int [] d = new int[10];
		
		//1~100 중에서 5의 배수이고
		//10의 배수에 해당하는 것의 총합 출력 
		/*
		//while문
		int i=0,sum=0;
		while(i<=100) {
			if(i%5==0 && i%10==0) {
				sum+=i;
			}
			i++;
		}
		System.out.println(sum);
		*/
		/*
		//do while문
		int i=0,sum=0;
		do {
			if(i%5==0 && i%10==0) {
				sum+=i;
			}
			i++;
		}while(i<=100);
		System.out.println(sum);
		*/
		/*
		//for문
		int sum=0;
		for(int n=0;n<=100;n++) {
		   if(n%5==0 && n%10==0) {
		    sum+=n;
		   }
		  }
		  System.out.println(sum);
		 */
		
		/*
		int [] a = {0,1,2,3,4}; 
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		int a[] = {0,1,2,3,4};
		int b[] = new int[] {0,1,2,3,4};
		int c[];
		c=new int[] {0,1,2,3,4};
		for(int i=0;i<5; i++) {
			System.out.println(a[i]);
		}
		*/
		/*
		//정수형 배열 5개 선언
		//정수 5개 입력받아 평균 출력
		//(length 필드 사용)
		 
		int []a= new int[5];
		Scanner s = new Scanner(System.in);
		double sum=0;
		
		for(int i=0; i<5;i++) {
			a[i] = s.nextInt();
			sum += a[i];
		}
		System.out.println(sum/5);
		*/
		/*
		//정수 5개를 입력받아 가장 큰 수 출력
		int []a= new int[5];
		Scanner s = new Scanner(System.in);
		
		int big=0; //제일 큰 수
		for(int i=0; i<5; i++) {
			a[i]=s.nextInt();
			if(big < a[i]) {
				big=a[i]; 
			}
			
		}
		System.out.println("최대값"+big);
		*/
		
		/*
		//for-each문 활용
		//1부터 5까지 배열 초기화
		//1
		//2
		//3
		//4
		//5
		int sum=0;
		int ary[] = {1,2,3,4,5};
		for(int i:ary) { // 순차적으로 대입
			sum+=i;
		}
		System.out.println(sum);  //15
		*/
		
		/*
		//컴퓨터
		//자바
		//DB
		String str[]= {"컴퓨터","자바","DB"};
		//for-each
		for(String s : str) {
			System.out.println(s);
		}
		*/
		
		/*
		//5
		//8
		//6
		//2
		//2차원 배열
		//2,2
		int ary[][] = new int[][] {{5,8},
									{6,2}};
		
		//ary[0][0]=5;
		//ary[0][1]=8;
		//ary[1][0]=6;
		//ary[1][1]=3;
		
		
		for(int i=0; i<2; i++) {
			for(int j=0; j<2; j++) {
				System.out.println(ary[i][j]);
			}
		}
		*/
		
		/*
		//정수 10개 입력받아 배열에 저장 한 후
		//5의 배수 정수만 출력
		int a[] = new int[10];
		Scanner s=new Scanner(System.in);
		for(int i=0; i<10; i++) {
			a[i] = s.nextInt();
			if(a[i]%5==0) {
				System.out.println(a[i]);
			}	
		}
		*/
		
		/*
		//[0, 1, 2]
	    //[3, 4, 5]
		int[][]scores = new int[2][3]; 
		int k = 0; for(int i = 0; i < scores.length; i++) { 
			for(int j = 0; j < scores[i].length; j++) { 
				scores[i][j] = k++; 
			} 
			System.out.println(Arrays.toString(scores[i])); }
		*/
		
		/*
		String str[]= {"A","B","C"};
		for(int i=0; i<3;i++) {
			if(str[i]=="A") {
				break;  // for문 탈출! 반복문 탈출!
			}
			System.out.println(str[i]);	//출력 안됨
		}
		*/
		
		/*
		//1
		//2
		//3
		//4
		//5
		//6
		//1.0
		//2.0
		//3.0
		//4.0
		//5.0
		//6.0
		double ary[][]=new double[2][3];
		// 실수형 2행 3열
		Scanner s = new Scanner(System.in);
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				ary[i][j]= s.nextDouble();
				// 실수를 배열(2행 3열)에다 입력
			}
			
		}
		for(int i=0; i<2; i++) {
			for(int j=0; j<3; j++) {
				System.out.println(ary[i][j]);
			}
		}
		*/
		
		/*
		int arr[][] = new int[2][3];
        int a, i, j;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("2차원 배열안의 값을 순차적으로 입력하세요");
        // arr의 전체길이
        for(i=0; i<arr.length; i++) {
            // arr[i]의 전체 
            for(j=0; j<arr[i].length; j++) {
                System.out.print("arr[" + i + "][" + j + "] : ");
                a = sc.nextInt();
                arr[i][j] = a;
            }
        }
        for(i=0; i<2; i++) {
            for(j=0; j<3; j++) {
                System.out.println("arr[" + i + "][" + j + "] : " + arr[i][j]);
            }
        }
		*/
	
		/*
//		aa[0][0]부터 aa[2][3]까지 출력 
//
//		  1   2   3   4 
//		  5   6   7   8 
//		  9  10  11  12 

		int[][]aa=new int[3][4];
		int i, k;
		int val =1;
		
		for(i=0; i<3; i++) {
			for(k=0; k<4; k++) {
				aa[i][k] = val;
				val++;
			}
		}
		
		System.out.println("aa[0][0]부터 aa[2][3]까지 출력 \n");
		
		for(i=0; i<3; i++) {
			for(k=0; k<4; k++) {
				System.out.printf("%3d ", aa[i][k]);
			}
			System.out.printf("\n");
		}
		*/
	
		
/*		
//		aa[0][0]부터 aa[3][5]까지 출력 
//
//		  2   4   6   8  10 
//		 12  14  16  18  20 
//		 22  24  26  28  30 

		
		int[][]aa=new int[3][5];
		int i, k;
		int val =2;
		
		for(i=0; i<3; i++) {
			for(k=0; k<5; k++) {
				aa[i][k] = val;
				val+=2;
			}
		}
		
		System.out.println("aa[0][0]부터 aa[3][5]까지 출력 \n");
		
		for(i=0; i<3; i++) {
			for(k=0; k<5; k++) {
				System.out.printf("%3d ", aa[i][k]);
			}
			System.out.printf("\n");
		}
*/
		/*
//		1	2	3	4	5	
//		6	7	8	9	10	
//		11	12	13	14	15	
//		16	17	18	19	20	

		int ary[][]= new int[4][5];
		int n=1;
		for(int i=0; i<4; i++) {
			for(int j=0; j<5; j++) {
				ary[i][j]=n++;
				System.out.print(ary[i][j]+"\t");
			}
			System.out.println();
		}
		*/
		
/*		
//		  1*  1=  1  2*  1=  2  3*  1=  3  4*  1=  4  5*  1=  5  6*  1=  6  7*  1=  7  8*  1=  8  9*  1=  9
//		  1*  2=  2  2*  2=  4  3*  2=  6  4*  2=  8  5*  2= 10  6*  2= 12  7*  2= 14  8*  2= 16  9*  2= 18
//		  1*  3=  3  2*  3=  6  3*  3=  9  4*  3= 12  5*  3= 15  6*  3= 18  7*  3= 21  8*  3= 24  9*  3= 27
//		  1*  4=  4  2*  4=  8  3*  4= 12  4*  4= 16  5*  4= 20  6*  4= 24  7*  4= 28  8*  4= 32  9*  4= 36
//		  1*  5=  5  2*  5= 10  3*  5= 15  4*  5= 20  5*  5= 25  6*  5= 30  7*  5= 35  8*  5= 40  9*  5= 45
//		  1*  6=  6  2*  6= 12  3*  6= 18  4*  6= 24  5*  6= 30  6*  6= 36  7*  6= 42  8*  6= 48  9*  6= 54
//		  1*  7=  7  2*  7= 14  3*  7= 21  4*  7= 28  5*  7= 35  6*  7= 42  7*  7= 49  8*  7= 56  9*  7= 63
//		  1*  8=  8  2*  8= 16  3*  8= 24  4*  8= 32  5*  8= 40  6*  8= 48  7*  8= 56  8*  8= 64  9*  8= 72
//		  1*  9=  9  2*  9= 18  3*  9= 27  4*  9= 36  5*  9= 45  6*  9= 54  7*  9= 63  8*  9= 72  9*  9= 81

		// i=0 j=0 결과 1	
		// i=0 j=1 결과 2 
		// i=1 j=0 결과 2
		// i=1 j=1 결과 4
		
		int[][]ary=new int[9][9];
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				ary[i][j] = (i+1)*(j+1);
			}
		}
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				System.out.printf("%3d*%3d=%3d", j+1, i+1, ary[i][j]);
			}
			System.out.println();
		}
*/
	
/*
//		1	2	
//		3	4	
//		5	6	
		//3행 2열
		int ary[][] = new int[][]{
								  {1,2},
								  {3,4},
								  {5,6}
								 };
		int n=1;
		for(int i=0; i<3; i++) {
			for(int j=0; j<2; j++) {
			ary[i][j]=n++;
			System.out.print(ary[i][j]+"\t");
			}
			System.out.println();
		}
*/
/*		
//		1	5	
//		2	6	
//		3	7	
//		4	8	

		int ary[][] = {	//2행 4열
						{1,2,3,4},
						{5,6,7,8}
			 		  };
		int ary1[][] = new int[4][2];//ary의 데이터를 ary1에 복사 (위치가 다름) 4행 2열
		for(int i=0; i<2; i++) {
			for(int j=0; j<4; j++) {
				ary1[j][i]=ary[i][j];
			}
	}
		for(int i=0; i<4; i++) {
			for(int j=0; j<2;j++) {
				System.out.printf(ary1[i][j]+"\t");
				
			}
			System.out.println();
		}
*/
/*	
//		1
//		2
//		3
//		4
//		5
//		6
//		21

		// [2][3] 정수형 2차원 배열
		// 값을 입력받아 총합
		int sum=0;
		Scanner s = new Scanner(System.in);
		int ary[][] = new int[2][3];
		for(int i=0; i<ary.length; i++) {
			for(int j=0; j<ary[i].length; j++) {
				ary[i][j] = s.nextInt();
				sum=sum+ary[i][j];
			}
		}
		System.out.println(sum);
*/
		
/*
		// 2차원 배열일때
		// 행 -> 배열명.length
		// 열 -> 배열명[행].length
		
		String s[][] = {{"java"},
						{"c","c++"},
						{"html","css","python"}};
		
		for(int i=0; i<s.length; i++) {
			for(int j=0; j<s[i].length; j++) {	//s[i].length  행을 기준으로 열이 몇 개인지; length 열 부분 처리할 때는 행 기준으로!!! 행은 고정적인데 열이 가변적일 때 사용을 한다!!!
				System.out.println(s[i][j]);
			}
		}
*/
		
/*
		String str="오늘은 화요일";
		System.out.println(str.length()); //7
		System.out.println(str.charAt(1)); //늘
*/		
		
/*		
//		오늘은 화요일
//		공부하고 티비봄!!

		String str="오늘은 화요일,공부하고 티비봄!!";
		String a[]=str.split(",");
		for(String b:a) {	// for each문
			System.out.println(b);
		}
*/
/*
		String str="오늘은 화요일,공부하고 티비봄!!";
		String a=str.substring(4, 7);
		System.out.println(a);			//화요일
*/
/*
		String str="오늘은 화요일,공부하고 티비봄!!";
		String b=str.replace("공부", "study");
		System.out.println(b); 			//오늘은 화요일,study하고 티비봄!!
*/
/*		
		String str="오늘은 화요일";
		String str1=str.concat("내일은 수요일");
		//문자열 연결
		System.out.println(str1);
*/
/*	
//		문자열 입력 ==> IT CookBook Java 입니다
//		출력 문자열 ==> IT C$$kB$$k Java 입니다
		Scanner s = new Scanner(System.in);
		String str;
		
		System.out.print("문자열 입력 ==> ");
		str = s.nextLine();
		
		System.out.print("출력 문자열 ==> ");
		for (int i=0; i< str.length(); i++) {
			if(str.charAt(i)== 'o')
				System.out.printf("%c", '$');
			else
				System.out.printf("%c", str.charAt(i));
		}
*/
		
		/*
		// 2개의 과일이름을 입력받아(영문)
		// 문자열이 긴 단어를 출력
		Scanner s = new Scanner(System.in);
		String a=s.next();
		String b=s.next();
		
		if(a.length() < b.length())
			System.out.println(b);
		else
			System.out.println(a);
		*/
		
		/*
		String a="apple";
		String b="banana";
		
		if(a.compareTo(b)>0) {	//a>b
			System.out.println(a);
		}
		else if(a.compareTo(b)<0) {	//a<b
			// b가 a보다 나중에 나옴
			System.out.println(b);
		}
		else	//a.compareTo(b)==0, 0이면 같은 문자열
			System.out.println("같은 문자열!");
		*/
		
		/*
//		원 문자열1 ==> [Java Programming]
//		원 문자열2 ==> [Java IT CookBook]
//		7
//		true

		String str1 = "Java Programming";
		String str2 = "Java IT CookBook";
		
		System.out.println("원 문자열1 ==> [" + str1 + "]");
		System.out.println("원 문자열2 ==> [" + str2 + "]");
		
		System.out.println(str1.compareTo(str2));	// 두 문자열 비교
		System.out.println(str1.contains("Java"));	// "Java" 글자가 포함되었는지 확인
		*/
	}
}
	
		
		

