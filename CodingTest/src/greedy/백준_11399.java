package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 백준_11399 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		int[] times = new int[N];
		
		for(int i=0; i<N; i++) {
			times[i]= Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(times); //오름차순 정렬
		
		int total = 0;
		int sum = 0;
		
		for(int i=0; i<N; i++) {
			sum += times[i]; //사람마다 걸리는 시간
			total += sum;
		}
		
		System.out.println(total);
	}

}
