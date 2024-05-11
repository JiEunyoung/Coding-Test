package binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 백준_1654 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		int K = Integer.parseInt(st1.nextToken()); //가지고 있는 랜선 개수
		int N = Integer.parseInt(st1.nextToken()); //필요한 랜선 개수
		
		long[] lines = new long[K]; //가지고 있는 랜선 길이 담을 배열 생성
		
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
				sum += line / mid; //생성될 랜선 길이의 합
			}
			
			if(sum < N) { //필요한 랜선 길이보다 작을 경우 => mid 값 줄이기
				max = mid - 1;
			} else { //필요한 랜선 길이보다 클 경우 => mid 값 늘리기
				min = mid + 1;
			}
			
		}
		
		System.out.println(max);

	}

}