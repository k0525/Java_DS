package C5_Stack;


class Node3{
    Object data;
    Node link;
}

class stack3{
    Node top;

    void push(String x){
        Node temp;
        if(top == null){            //스택이 공백인 경우
            top = new Node();
            top.data = x;
            top.link = null;
        }
        else{                       //공백 스택이 아닌 경우
            temp = new Node();
            temp.data = x;
            temp.link = top;        //top 앞에 temp 노드 삽입
            top = temp;             //top이 삽입한 노드 temp를 가리킴
        }
    }

    void print(){
        Node temp;
        temp = top;
        while(temp != null){
            System.out.println(temp.data + " -> ");
            temp = temp.link;
        }
        System.out.println("null");
    }
}

public class E3_LinkedStack {
    public static void main(String[] args) {
        stack3 stk = new stack3();
        stk.push("kim");
        stk.push("lee");
        stk.push("pak");
        stk.push("yoon");
        System.out.println("*** 스택 출력 ***"); 
        stk.print();
        stk.push("cho");
        System.out.println("*** push 연산 후 스택 출력 ***");
        stk.print();
        stk.push("han");
        System.out.println("*** push 연산 후 스택 출력 ***");
        stk.print();
    }    
}
