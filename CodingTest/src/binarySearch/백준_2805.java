package binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ����_2805 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); //���� ������ ������ ó��
		
		int N = Integer.parseInt(st.nextToken()); //������ ��
		int M = Integer.parseInt(st.nextToken()); //������ ������ ����
		
		int[] trees = new int[N]; 
		
		int min = 0;
		int max = 0;
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<N; i++) {
			trees[i] = Integer.parseInt(st.nextToken()); //�迭 �ȿ� �־��� ���� ���� �ֱ�
			
			if(max < trees[i]) {
				max = trees[i]; //�ִ� ���� ���� max�� ����
			}
		}
		
		while(min <= max) {
			
			int mid = (min + max) / 2;
			long sum = 0; 
			//(���� ���̰� �ִ� 1000000000)
		    //�����÷ο� �������� int ��� long
			
			for(int tree : trees) {
				if(tree - mid > 0) { //�ڸ��� �� ������ ���̰� ����� ��� ���� ���ϱ�
					sum += tree - mid;
				}
			}
			
			if(sum < M) { //mid ���̸� �ٿ� sum�� �ø���
				max = mid - 1; 
			} else { //mid ���� �÷��� sum�� ���̱�
				min = mid + 1; 
				//mid�� ������� �� sum > M�� ����� ���Ա⿡ 
				//mid + 1�� �ؼ� min���� ���
			}
		}
		
		System.out.println(max);

	} 

}
