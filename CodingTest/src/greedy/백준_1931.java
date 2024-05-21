package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class ����_1931 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		int[][] meet = new int[N][2];
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			
			meet[i][0] = Integer.parseInt(st.nextToken()); //���� �ð� ��
			meet[i][1] = Integer.parseInt(st.nextToken()); //�� �ð� ��
		}
		
		Arrays.sort(meet, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) { //�� ��ü�� �޾� ������ �����ϴ� ������ ��ȯ
				//return ���� �� ���: ù ��° ��ü�� �տ� ��ġ
				//       ��� �� ���: ù ��° ��ü�� �ڿ� ��ġ
				
				if(o1[1] == o2[1]) { //���� �ð��� ���� ���
					return o1[0] - o2[0]; //���� �ð��� ���� ����
				}
				
				return o1[1] - o2[1]; //���� �ð��� ���� ����
			}
			
		});
		
		int cnt = 0;
		int end = 0;
		
		for(int i=0; i<N; i++) {
			
			if(end <= meet[i][0]) {
				end = meet[i][1];
				cnt++;
			}
		}
		
		 System.out.println(cnt);

	}

}
