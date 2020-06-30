import java.util.Arrays;

public class study6 {

	public static void main(String[] args) {
		
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
			

	
		
		
		
	}
}