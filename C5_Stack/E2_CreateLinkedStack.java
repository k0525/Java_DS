package C5_Stack;

class Node{
    Object data;
    Node link;
}

class stack{
    Node top;
    void create(String x){
        Node temp;
        if(top == null){            //스택이 공백인 경우
            top = new Node();
            top.data = x;
            top.link = null;
        }
        else{                       //공백 스택이 아닌 경우
            temp = new Node();
            temp.data = x;
            temp.link = top;
            top = temp;
        }
    }
    void print(){
        Node temp;
        temp = top;
        while(temp!=null){
            System.out.println(temp.data + " -> ");
            temp = temp.link;
        }
        System.out.println("null");
    }
}

public class E2_CreateLinkedStack {
    void build(stack stk){
        stk.create("kim");
        stk.create("lee");
        stk.create("pak");
        stk.create("yoon");
    }

    public static void main(String[] args) {
        E2_CreateLinkedStack obj = new E2_CreateLinkedStack();
        stack stk = new stack();
        obj.build(stk);
        System.out.println("*** 스택 출력 ***");
        stk.print();
    }
}
