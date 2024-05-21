package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class 백준_1931 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		int[][] meet = new int[N][2];
		
		for(int i=0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			
			meet[i][0] = Integer.parseInt(st.nextToken()); //시작 시간 값
			meet[i][1] = Integer.parseInt(st.nextToken()); //끝 시간 값
		}
		
		Arrays.sort(meet, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) { //두 객체를 받아 순서를 결정하는 정수값 반환
				//return 음수 인 경우: 첫 번째 객체가 앞에 위치
				//       양수 인 경우: 첫 번째 객체가 뒤에 위치
				
				if(o1[1] == o2[1]) { //종료 시간이 같은 경우
					return o1[0] - o2[0]; //시작 시간에 따라 정렬
				}
				
				return o1[1] - o2[1]; //종료 시간에 따라 정렬
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
