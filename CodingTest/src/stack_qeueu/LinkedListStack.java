package stack_qeueu;

class Node{
	int data;
	Node next; //다음 노드를 가리키는 노드
	
	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class LinkedListStack {
	private Node top;
	
	public LinkedListStack() {
		this.top = null;
	}

	public void push(int data) {
		Node node = new Node(data);
		
		if(top == null) {
			top = node;
		} else {
			node.next = top; //비어있지 않은 경우 다음 노드가 top
			top = node;
		}
	}
	
	public int pop() {
		if(top == null) {
			System.out.println("스택이 비어있음.");
			return -1;
		}
		
		int poppedData = top.data;
		top = top.next;
		return poppedData;
	}
	
	public int peek() {
		if(top == null) {
			System.out.println("스택이 비어있음");
			return -1;
		}
		
		return top.data;
	}
	
	public boolean isEmpty() {
		return (top == null);
	}
	
	public int stackSize() {
		int cnt = 0;
		Node currentNode = top;
		while(currentNode != null) {
			cnt++;
			currentNode = currentNode.next;
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		LinkedListStack stack = new LinkedListStack(); //스택 생성
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		System.out.println("top 위치 데이터: " + stack.peek()); //3 반환
		
		stack.pop();
		System.out.println("pop()한 후 top 위치 데이터: " + stack.peek()); //2 반환
		
	}
}
