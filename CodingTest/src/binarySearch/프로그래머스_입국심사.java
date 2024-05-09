package binarySearch;

class Solution {
    public long solution(int n, int[] times) {
        long answer = 0;
        
        long min = 0;
        long max = 0;
        
        for(int i=0; i<times.length; i++) {
        	if(max < times[i]) {
        		max = times[i];
        	}
        }
        
        max = max * n;
    
        while(min <= max) {
        	long mid = (min + max) / 2;
        	long complete = 0;
        	
        	for(int time : times) {
        		complete += mid / time;
        	}
        	
        	if(complete < n) {
        		min = mid + 1;
        	} else {
        		max = mid - 1;
        		
        	}
            answer = min;
        }
        
        
        return answer;
    }
}

public class 프로그래머스_입국심사 {
	
	private static int n = 6;
	private static int[] times = {7, 10};

	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution(n, times));

	}

}
