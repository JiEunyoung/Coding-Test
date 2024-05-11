package binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ����_1654 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		int K = Integer.parseInt(st1.nextToken()); //������ �ִ� ���� ����
		int N = Integer.parseInt(st1.nextToken()); //�ʿ��� ���� ����
		
		long[] lines = new long[K]; //������ �ִ� ���� ���� ���� �迭 ����
		
		long max = 0;
		long min = 1;
		
		for(int i=0; i<K; i++) {
			lines[i] = Long.parseLong(br.readLine());
			if(max < lines[i]) {
				max = lines[i];
			}
		}
		
		while(min <= max) {
			long sum = 0;
			long mid = (min + max) / 2;
			
			for(long line : lines) {
				sum += line / mid; //������ ���� ������ ��
			}
			
			if(sum < N) { //�ʿ��� ���� ���̺��� ���� ��� => mid �� ���̱�
				max = mid - 1;
			} else { //�ʿ��� ���� ���̺��� Ŭ ��� => mid �� �ø���
				min = mid + 1;
			}
			
		}
		
		System.out.println(max);

	}

}