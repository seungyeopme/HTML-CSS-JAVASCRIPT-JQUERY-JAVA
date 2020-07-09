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
public class test1 {

	public int[] solution(int[] answers) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] arr3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
 
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(1, 0);
        hm.put(2, 0);
        hm.put(3, 0);
        //���� ���� Count
        for (int i = 0; i < answers.length; i++) {
            int num = answers[i];
            if (arr1[i%5] == num) hm.replace(1, hm.get(1)+1);
            if (arr2[i%8] == num) hm.replace(2, hm.get(2)+1);
            if (arr3[i%10] == num) hm.replace(3, hm.get(3)+1);
        }
        //�ִ� �� ���ϱ�
        int max = hm.get(1);
        for (Integer val : hm.values()) {
            if (val > max) {
                max = val;
            }
        }
        //���� ����Ʈ ����
        ArrayList<Integer> answerList = new ArrayList<>();
        for (Integer key : hm.keySet()) {
            if (hm.get(key) == max) {
                answerList.add(key);
            }
        }
        //���� �� �迭�� ��ȯ
        int[] answer = new int[answerList.size()];
        Collections.sort(answerList);
        for (int i = 0; i < answer.length; i++) {
            answer[i] = answerList.get(i);
        }
        return answer;
	}
}
/*
(line 50 ~ 52)

������ ���� ������ �ݺ��Ǵ� ������ �迭�� ������ݴϴ�.



(line 55 ~ 64)

HashMap�� Ȱ���Ͽ� Key�� �л��� ��ȣ, Value�� ���� ������ �������ݴϴ�.

for������ �־��� ���� �迭�� ���鼭 %(�� �л��� ���� �迭�� ����)�� ���� ���� ������ Count ���ݴϴ�. 



(line 65 ~ 70)

HashMap�� Value �� �ִ밪�� �����ݴϴ�.



(line 72 ~ 77)

�ִ밪�̶� ��ġ�ϴ� Key�� answerList�� �������ݴϴ�.



(line 79 ~ 84)

Collections.sort�� Ȱ���� ������������ �����ϰ� answer �迭�� ��ȯ �� return���ݴϴ�.
*/
