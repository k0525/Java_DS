package C5_Stack;
import java.util.Stack;

public class E5_TestStack {
    public static void main(String[] args) {
        Stack<Integer> stk = new Stack<>();
        Integer objint;
        int x;
        int intarr[] = new int[20];
        System.out.println("*** print stack element");

        for(int j = 0; j<10; j++){
            objint = j*2;                   //objint=new Integer(j*2); 스택에 값 저장
            stk.push(objint);
            objint = (Integer)stk.peek();   //스택의 top 원소 반환
            x = objint;                     //x = objint.intValue();
            System.out.print(x+" ");
            intarr[j] = x;
        }

        System.out.println("\n");

        int size = stk.size();              //스택 사이즈 반환
        System.out.println("스택 크기: " + size + "\n");
        System.out.println("*** top 원소: "+intarr[size-1]+ "\n");
        System.out.println("*** pop 연산 후 스택 출력 ");
        objint = (Integer)stk.pop();        //스택의 top원소 삭제
        size--;
        
        for(int j = 0; j<size; j++)
            System.out.print(intarr[j]+" ");
        System.out.println("\n");
        System.out.println("*** 34 push 연산 후 스택 출력 ");
        stk.push(34);                       //stk.push(new Integer(34));
        intarr[size] = 34;
        size++;
        for(int j = 0; j<size; j++)
            System.out.print(intarr[j]+" ");
        System.out.println();
    }
}
