package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ����_12026 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        
        String[] road = s.split("");
        
        int[] dp = new int[N];
        
        dp[0] = 0;
        for (int i = 1; i < N; i++) {
            dp[i] = Integer.MAX_VALUE;
        }
        
        for (int i = 0; i < N; i++) {
        	
        	if (dp[i] == Integer.MAX_VALUE) {
        	    continue; //�����÷ο� ���� ����
        	}
        	
            String current = road[i];
            for (int j = i + 1; j < N; j++) {
                String next = road[j];
                
                if ((current.equals("B") && next.equals("O")) || //B -> O
                    (current.equals("O") && next.equals("J")) || //O -> J
                    (current.equals("J") && next.equals("B"))) { //J -> B
                    dp[j] = Math.min(dp[j], dp[i] + (j - i) * (j - i)); //Integer.MAX_VALUE, �����ϴµ� �� ������ �� �� �ּҰ�
                }
            }
        }
        
        if (dp[N - 1] == Integer.MAX_VALUE) { //���������� �������� ���� ���
            System.out.println(-1);
        } else {
            System.out.println(dp[N - 1]);
        }
    }
}
