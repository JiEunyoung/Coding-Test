package stack_qeueu;

public class ArrayStack {
	
	private int size; //스택 크기
	private int top; //제일 위 인덱스
	private int[] stack; //스택 구현 위한 배열

	public ArrayStack(int size) {
		this.size = size;
		stack = new int[size];
		top = -1; //스택이 비어있는 상태로 초기화
	}
	
	public void push(int data) {
		if(top == size - 1) { //스택이 끝까지 찬 경우
			System.out.println("스택이 끝까지 참.");
		}
		stack[++top] = data; //1 증가한 뒤 top 값 이용
	}
	
	public int pop() {
		if(top == -1) {
			System.out.println("스택이 비었음.");
			return -1;
		}
		return stack[top--]; //top 값 이용한 뒤 1 감소
	}
	
	public int peek() {
		if(top == -1) {
			System.out.println("스택이 비었음.");
			return -1;
		}
		return stack[top];
	}
	
	public boolean isEmpty() {
		return (top == -1);
	}
	
	//스택 크기
	public int stackSize() {
		return top + 1;
	}
	
	//스택 출력
	public void printStack() { 
		for(int i=0; i<=top; i++) {
			System.out.print(stack[i] + " ");
		}
		System.out.println();
	}


	public static void main(String[] args) {
		ArrayStack stack = new ArrayStack(5); //크기가 5인 스택 생성
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.printStack(); // 1 2 3 반환
		
		System.out.println("top 위치 데이터: " + stack.peek()); //3 반환
		System.out.println("스택 크기: " + stack.stackSize()); //3반환
		 
		stack.pop();
		stack.printStack(); // 1 2 반환
		
		System.out.println("스택 비어있는지 확인: " + stack.isEmpty()); //false 반환

	}

}
