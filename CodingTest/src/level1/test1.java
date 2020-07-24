package level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

//���ǰ��
/*
1.���� ����
�����ڴ� ������ ������ ����� �ظ��Դϴ�. ������ ���ι��� ���ǰ�翡 ���� ������ ���� ������ �մϴ�. �����ڴ� 1�� �������� ������ �������� ������ ���� ����ϴ�.



1�� �����ڰ� ��� ���: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...

2�� �����ڰ� ��� ���: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...

3�� �����ڰ� ��� ���: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...



1�� �������� ������ ���������� ������ ������� ���� �迭 answers�� �־����� ��, ���� ���� ������ ���� ����� �������� �迭�� ��� return �ϵ��� solution �Լ��� �ۼ����ּ���.

2.���ѻ���
������ �ִ� 10,000 ������ �����Ǿ��ֽ��ϴ�.
������ ������ 1, 2, 3, 4, 5�� �ϳ��Դϴ�.
���� ���� ������ ���� ����� ������ ���, return�ϴ� ���� �������� �������ּ���.

3.����� ��
answers			return
[1,2,3,4,5]		[1]
[1,3,2,4,2]		[1,2,3]

4.����� �� ����
����� �� #1

������ 1�� ��� ������ �������ϴ�.
������ 2�� ��� ������ Ʋ�Ƚ��ϴ�.
������ 3�� ��� ������ Ʋ�Ƚ��ϴ�.
���� ���� ������ ���� ���� ����� ������ 1�Դϴ�.

����� �� #2

��� ����� 2�������� ������ϴ�.

*/
class A {
	public static void solution(int[] answers) {
		//������ ���� ������ �ݺ��Ǵ� ������ �迭�� ������ݴϴ�.
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] arr3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
 
      //HashMap�� Ȱ���Ͽ� Key�� �л��� ��ȣ, Value�� ���� ������ �������ݴϴ�.
        HashMap<Integer, Integer> hm = new HashMap<>(); 
        hm.put(1, 0);
        hm.put(2, 0);
        hm.put(3, 0);
        
      //for������ �־��� ���� �迭�� ���鼭 %(�� �л��� ���� �迭�� ����)�� ���� ���� ������ Count ���ݴϴ�.
      //���� ���� Count       
        for (int i = 0; i < answers.length; i++) {
            int num = answers[i];
            if (arr1[i%5] == num) hm.replace(1, hm.get(1)+1);
            if (arr2[i%8] == num) hm.replace(2, hm.get(2)+1);
            if (arr3[i%10] == num) hm.replace(3, hm.get(3)+1);
        }
        //HashMap�� Value �� �ִ밪�� �����ݴϴ�.
        int max = hm.get(1);
        for (Integer val : hm.values()) {
            if (val > max) {
                max = val;
            }
        }
        //���� ����Ʈ ����
        //�ִ밪�̶� ��ġ�ϴ� Key�� answerList�� �������ݴϴ�.
        ArrayList<Integer> answerList = new ArrayList<>();
        for (Integer key : hm.keySet()) {
            if (hm.get(key) == max) {
                answerList.add(key);
            }
        }
        //���� �� �迭�� ��ȯ
        //Collections.sort�� Ȱ���� ������������ �����ϰ� answer �迭�� ��ȯ �� return���ݴϴ�.
        int[] answer = new int[answerList.size()];
        Collections.sort(answerList);
        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
            System.out.println(answer[i]);
        }
        
	}
}
	public class test1{
	public static void main(String[] args) {
		A a = new A();
		a.solution(new int[] {1,2,3,4,5});
		a.solution(new int[] {2, 1, 2, 3, 2, 4, 2, 5});
		a.solution(new int[] {3, 3, 1, 1, 2, 2, 4, 4, 5, 5});	
	}
}
/*	
	1
	2
	3
*/