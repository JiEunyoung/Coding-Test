package stack_qeueu;

import java.util.Stack;

public class StackClass {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>(); //자바에서 제공하는 stack 클래스
		//메소드
		//push(): 스택에 데이터 추가
		//peek(): 스택의 마지막 요소 반환
		//pop(): 스택의 마지막 요소 제거
		//empty(): 스택이 비어있는지 확인(비어있는 경우 true, 비어있지 않은 경우 false)
		//search(): 데이터의 해당 위치 반환(데이터가 여러 개일 경우 마지막 위치 반환)
		
		for(int i=1; i<=5; i++) {
			stack.push(i);
		}

		System.out.println("stack=" + stack);
		
		stack.pop(); 
		System.out.println("stack=" + stack); //[1, 2, 3, 4] 반환
		
		System.out.println(stack.peek()); //4 반환
		
		System.out.println(stack.search(3)); //2 반환
		
		System.out.println(stack.empty()); //false 반환
	}

}
