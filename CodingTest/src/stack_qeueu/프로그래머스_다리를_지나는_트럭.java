package stack_qeueu;

import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        
    	Queue<Integer> queue = new LinkedList<Integer>();
    	
    	int time = 0;
    	int sum = 0;
    	
    	for(int truck : truck_weights) {
    		while(true) {
    			if(queue.size() == 0) {
        			queue.add(truck);
        			time++;
        			sum += truck;
        			break; //Ʈ���� ť�� �� ���� Ʈ�� �޾ƿ� �� �ֵ��� 
        		} else if(queue.size() == bridge_length) {
        			int pollData = queue.peek();
        			queue.poll();
        			sum -= pollData;		
        		} else {
        			if(sum + truck <= weight) {
        				queue.add(truck);
            			time++;
            			sum += truck;
            			break; //Ʈ���� ť�� �� ���� Ʈ�� �޾ƿ� �� �ֵ��� 
        			} else {
        				queue.add(0);
        				time++;
        			}
        			
        		}
    		}
    		
    	}
    	
    	return time + bridge_length; //�ٸ� ��� �ð� �߰�
    	
    }
}

public class ���α׷��ӽ�_�ٸ���_������_Ʈ�� {

	private static int bridge_length = 2;
	private static int weight = 10;
	private static int[] truck_weights = {7, 4, 5, 6};
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		System.out.println(sol.solution(bridge_length, weight, truck_weights));

	}

}
