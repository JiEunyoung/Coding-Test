package stack_qeueu;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class 백준_10828 {
    public static void main(String[] args) throws IOException { 
    	//throws IOException 안 쓰면 try-catch문 작성해야 함
    	
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine()); //String 타입이기에 형 변환 필요

        Stack<Integer> stack = new Stack<>(); //Stack클래스 사용

        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine()); //데이처 가공처리
            String s = st.nextToken();

            if(s.equals("push")) {
                stack.push(Integer.parseInt(st.nextToken())); //String타입 -> Integer타입 형 변환
            } else if(s.equals("pop")) {
                if(stack.empty())
                    System.out.println(-1);
                else
                    System.out.println(stack.pop());
            } else if(s.equals("size")) {
                System.out.println(stack.size());
            } else if(s.equals("empty")) {
                if(stack.empty())
                    System.out.println(1);
                else
                    System.out.println(0);
            } else if(s.equals("top")) {
                if(stack.empty())
                    System.out.println(-1);
                else
                    System.out.println(stack.peek());
            }
        }
    }
}