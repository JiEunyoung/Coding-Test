package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ����_2875 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int cnt = 0;
		
		while(N + M - K > 0) { //���Ͻ� ���� �ο��� �������
			if((N - 2) + (M - 1) - K >= 0) { //�� �� ����� ���Ͻ� ���� �ο��� ����� ���
				N = N - 2;
				M = M - 1;
                
                if(N < 0 || M < 0) {
					break;
				}
                
				cnt++; //�� �Ἲ
				
			} else {
				break;
			}
		}
		
		System.out.println(cnt);

	}

}