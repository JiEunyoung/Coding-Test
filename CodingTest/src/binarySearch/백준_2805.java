package binarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 백준_2805 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); //공백 단위로 데이터 처리
		
		int N = Integer.parseInt(st.nextToken()); //나무의 수
		int M = Integer.parseInt(st.nextToken()); //가져갈 나무의 길이
		
		int[] trees = new int[N]; 
		
		int min = 0;
		int max = 0;
		
		st = new StringTokenizer(br.readLine(), " ");
		for(int i=0; i<N; i++) {
			trees[i] = Integer.parseInt(st.nextToken()); //배열 안에 주어진 나무 길이 넣기
			
			if(max < trees[i]) {
				max = trees[i]; //최대 나무 길이 max로 지정
			}
		}
		
		while(min <= max) {
			
			int mid = (min + max) / 2;
			long sum = 0; 
			//(나무 길이가 최대 1000000000)
		    //오버플로우 방지위해 int 대신 long
			
			for(int tree : trees) {
				if(tree - mid > 0) { //자르고 난 나무의 길이가 양수인 경우 길이 합하기
					sum += tree - mid;
				}
			}
			
			if(sum < M) { //mid 길이를 줄여 sum값 늘리기
				max = mid - 1; 
			} else { //mid 길이 늘려서 sum값 줄이기
				min = mid + 1; 
				//mid로 계산했을 때 sum > M인 결과가 나왔기에 
				//mid + 1을 해서 min으로 잡기
			}
		}
		
		System.out.println(max);

	} 

}
