package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 백준_10610 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String N = br.readLine(); //최대 10^5개의 숫자로 구성 => int형, long형 X
		
		String[] s = N.split(""); //정렬하기 위한 배열 생성
			
		Arrays.sort(s); //오름차순 정렬
		
		int sum = 0;
		
		for(String value : s) {
			sum += Integer.parseInt(value);
		}
		
		if(sum % 3 == 0 && N.contains("0")) { //30의 배수인 경우
			StringBuilder sb = new StringBuilder();
			for(int i = s.length - 1; i >= 0; i--) {
				sb.append(s[i]);
			}
			
			System.out.println(sb.toString());
			
		} else {
			System.out.println(-1);
		}	
		
	}		

}
