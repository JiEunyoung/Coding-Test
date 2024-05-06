package stack_qeueu;

import java.util.Stack;

public class StackClass {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>(); //�ڹٿ��� �����ϴ� stack Ŭ����
		//�޼ҵ�
		//push(): ���ÿ� ������ �߰�
		//peek(): ������ ������ ��� ��ȯ
		//pop(): ������ ������ ��� ����
		//empty(): ������ ����ִ��� Ȯ��(����ִ� ��� true, ������� ���� ��� false)
		//search(): �������� �ش� ��ġ ��ȯ(�����Ͱ� ���� ���� ��� ������ ��ġ ��ȯ)
		
		for(int i=1; i<=5; i++) {
			stack.push(i);
		}

		System.out.println("stack=" + stack);
		
		stack.pop(); 
		System.out.println("stack=" + stack); //[1, 2, 3, 4] ��ȯ
		
		System.out.println(stack.peek()); //4 ��ȯ
		
		System.out.println(stack.search(3)); //2 ��ȯ
		
		System.out.println(stack.empty()); //false ��ȯ
	}

}
