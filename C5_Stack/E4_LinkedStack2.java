package C5_Stack;

class Node4{
    Object data;
    Node4 link;
}

class stack4{
    Node4 top;
    String itemEmpty = "StackEmpty";

    void push(String x){
        Node4 temp;
        if(top == null){            //스택이 공백인 경우
            top = new Node4();
            top.data = x;
            top.link = null;
        }
        else{                       //공백 스택이 아닌 경우
            temp = new Node4();
            temp.data = x;
            temp.link = top;
            top = temp;
        }
    }

    void pop(){
        if(top == null)
            System.out.println("공백 스택 -- pop을 수행할 수 없습니다.");
        else
            top = top.link;
    }

    Object peek(){              //스택에서 원소 값을 반환
        if(top == null){        //스택이 공백인 경우
            System.out.println("공백 스택입니다.");
            return itemEmpty;   //return "Stack is empty" 해도 무방
        }
        else
            return top.data;
    }

    void print(){
        Node4 temp;
        temp = top;
        while(temp != null){
            System.out.println(temp.data + " -> ");
            temp = temp.link;
        }
        System.out.println("null");
    }
}

public class E4_LinkedStack2 {
    public static void main(String[] args) {
        stack4 stk = new stack4();
        /*
        stk.push("kim");
        stk.push("lee");
        stk.push("pak");
        stk.push("yoon");
        System.out.println("*** print stack ***");
        stk.print();
        System.out.println("*** stack top element: "+stk.peek());
        stk.pop();
        System.out.println("*** print stack after pop");
        stk.print();
        System.out.println("*** stack top element: "+ stk.peek());
        stk.pop();
        System.out.println("*** print stack after pop");
        stk.print();
        stk.push("oh");
        System.out.println("*** print stack after push");
        stk.print();
        */
        System.out.println(stk.peek());

    }
}
