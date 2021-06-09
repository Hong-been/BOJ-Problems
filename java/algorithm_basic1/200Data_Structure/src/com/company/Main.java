package com.company;

import java.util.Scanner;
import java.util.Stack;

/*
push X: 정수 X를 스택에 넣는 연산이다.
pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
size: 스택에 들어있는 정수의 개수를 출력한다.
empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
* */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        Stack st=new Stack();
        int size=0;

        while(t-->0){
            String order=sc.next();
            if(order.equals("push")){
                int x=sc.nextInt();
                st.push(x);
                size++;
            }
            else if(order.equals("pop")){
                if(size==0){
                    System.out.println(-1);
                }
                else{
                    System.out.println(st.pop());
                    size--;
                }
            }
            else if(order.equals("size"))
                System.out.println(size);

            else if(order.equals("empty")){
                if(size==0)
                    System.out.println("1");
                else
                    System.out.println("0");
            }
            else if(order.equals("top")){
                if(size==0){
                    System.out.println("-1");
                }
                else{
                    System.out.println(st.peek());
                }
            }

        }

    }
}
