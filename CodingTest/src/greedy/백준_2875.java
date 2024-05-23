package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 백준_2875 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int cnt = 0;
		
		while(N + M - K > 0) { //인턴쉽 나갈 인원이 충분한지
			if((N - 2) + (M - 1) - K >= 0) { //한 팀 만들고 인턴쉽 나갈 인원도 충분할 경우
				N = N - 2;
				M = M - 1;
                
                if(N < 0 || M < 0) {
					break;
				}
                
				cnt++; //팀 결성
				
			} else {
				break;
			}
		}
		
		System.out.println(cnt);

	}

}