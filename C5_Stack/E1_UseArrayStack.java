package C5_Stack;

class ArrayStack{
    private int top;                //top 원소 가리키는 변수
    private int size;               //배열의 크기
    private int increment;          //배열의 확장 단위
    private Object[] itemStack;     //원소 저장하는 배열
    private Object itemEmpty = "empty";

    public ArrayStack(){            //스택 멤버 변수들 초기화
        top = -1;
        size = 50;
        increment = 10;
        itemStack = new Object[size];
    }

    public boolean isEmpty(){
        return top == -1;           //공백 스택
    }

    public void push(Object x){     //원소 삽입
        if(top == size -1){         //스택이 만원일 경우 배열 크기 확장
            size += increment;  
            Object[] tempArray = new Object[size];
            for(int i = 0; i<=top; i++)     //새로운 배열로 원소 이동
                tempArray[i] = itemStack[i];
            itemStack = tempArray;
        }
        itemStack[++top] = x;       //원소 삽입
    }

    public Object pop(){
        if(isEmpty()){
            System.out.println("Stack Empty");
            return itemEmpty;
        }  
        return itemStack[top--];    //top 원소 꺼내준 다음 --해서 그 원소 없앰
    }

    public Object peek(){
        if(isEmpty()){
            System.out.println("Stack Empty");
            return itemEmpty;
        }
        else
            return itemStack[top];
    }

    public void print(){
        for(int i = 0; i<top; i++)
            System.out.print(itemStack[i] + ", ");
        System.out.println(itemStack[top]);
        System.out.println();
    }
}

public class E1_UseArrayStack{
    public static void main(String[] args) {
        ArrayStack stack1 = new ArrayStack();
        stack1.push("han");
        stack1.push(1279);
        stack1.push("Lee");
        stack1.push("Park");
        stack1.push(5734);

        System.out.println("*** push 연산 후 Stack ***");
        stack1.print();
        
        System.out.print("*** Top 원소 : ");
        System.out.println(stack1.peek()+"\n");

        stack1.pop();
        System.out.println("*** pop 연산 후 Stack ***");
        stack1.print();

        stack1.pop();
        System.out.println("*** pop 연산 후 Stack ***");
        stack1.print();

        System.out.print("*** Top 원소 : ");
        System.out.println(stack1.peek()+"\n");

        stack1.pop();
        System.out.println("*** pop 연산 후 Stack ***");
        stack1.print();
    }
}