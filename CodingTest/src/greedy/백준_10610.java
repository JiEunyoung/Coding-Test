package greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ����_10610 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String N = br.readLine(); //�ִ� 10^5���� ���ڷ� ���� => int��, long�� X
		
		String[] s = N.split(""); //�����ϱ� ���� �迭 ����
			
		Arrays.sort(s); //�������� ����
		
		int sum = 0;
		
		for(String value : s) {
			sum += Integer.parseInt(value);
		}
		
		if(sum % 3 == 0 && N.contains("0")) { //30�� ����� ���
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
