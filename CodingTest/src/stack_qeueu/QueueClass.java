package stack_qeueu;

import java.util.LinkedList;
import java.util.Queue;

public class QueueClass {
	
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>(); //�ڹٿ��� �����ϴ� QueueŬ����
		//�޼ҵ�
		//add(): ����(���� �� exception �߻�)
		//offer(): ����(���� �� false ��ȯ)
		//remove(): ���� �� ����(�� �������� ������ false)
		//poll(): ���� �� ����(���� ť�̸� null ��ȯ)
		//element(): ť head�� ��ġ�� �� ��ȯ(���� ť�̸� exception �߻�)
		//peek(): ť head�� ��ġ�� �� ��ȯ(���� ť�̸� null ��ȯ)
		//clear(): ���� ť�� �ʱ�ȭ
		//size(): ť ũ��
		//contains(): �ش� ���� �����ϴ���(�����ϸ� true, �������� ������ false)
		//isEmpty(): ���� ť���� Ȯ��(���� ť�̸� true, ���� ť�� �ƴϸ� false)
		
		queue.add(1);
		queue.add(2);
		queue.add(3);
		System.out.println("Queue= " + queue); // 1, 2, 3 ��ȯ
		
		queue.poll();
		System.out.println("poll�� �� Queue= " + queue); // 2, 3 ��ȯ
		
		System.out.println("head�� ��ġ�� ��: " + queue.peek()); //2 ��ȯ
		
		System.out.println("Queue ũ��: " + queue.size()); //2 ��ȯ
		
		System.out.println("Queue�� 1�� �����ϴ���: " + queue.contains(1)); //false ��ȯ
		
		System.out.println("Queue�� ���� ť����: " + queue.isEmpty()); //false ��ȯ
		
		
	}

}
