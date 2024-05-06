package stack_qeueu;

public class ArrayStack {
	
	private int size; //���� ũ��
	private int top; //���� �� �ε���
	private int[] stack; //���� ���� ���� �迭

	public ArrayStack(int size) {
		this.size = size;
		stack = new int[size];
		top = -1; //������ ����ִ� ���·� �ʱ�ȭ
	}
	
	public void push(int data) {
		if(top == size - 1) { //������ ������ �� ���
			System.out.println("������ ������ ��.");
		}
		stack[++top] = data; //1 ������ �� top �� �̿�
	}
	
	public int pop() {
		if(top == -1) {
			System.out.println("������ �����.");
			return -1;
		}
		return stack[top--]; //top �� �̿��� �� 1 ����
	}
	
	public int peek() {
		if(top == -1) {
			System.out.println("������ �����.");
			return -1;
		}
		return stack[top];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	//���� ũ��
	public int stackSize() {
		return top + 1;
	}
	
	//���� ���
	public void printStack() { 
		for(int i=0; i<=top; i++) {
			System.out.print(stack[i] + " ");
		}
		System.out.println();
	}


	public static void main(String[] args) {
		ArrayStack stack = new ArrayStack(5); //ũ�Ⱑ 5�� ���� ����
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.printStack(); // 1 2 3 ��ȯ
		
		System.out.println("top ��ġ ������: " + stack.peek()); //3 ��ȯ
		System.out.println("���� ũ��: " + stack.stackSize()); //3��ȯ
		 
		stack.pop();
		stack.printStack(); // 1 2 ��ȯ
		
		System.out.println("���� ����ִ��� Ȯ��: " + stack.isEmpty()); //false ��ȯ

	}

}
