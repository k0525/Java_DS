import java.util.Scanner;

public class E3_Node2 {
    Object data;
    E3_Node2 link;
    
    void build(){
        E3_Node2 p = null, temp, end;
        end = p;

        System.out.println("자료를 입력하시오.\n---입력 마침 문자: * ");
        Scanner scanner = new Scanner(System.in);

        while(true){
            String x = scanner.next();

            if(x.equals("*"))
                break;

            temp = new E3_Node2();
            temp.data = x;

            if(p == null){
                p = temp;
                end = p;
            }
            else{
                end.link = temp;
                end = temp;
            }
        }
        System.out.println("*** 리스트 출력 ***");
        display(p);

        scanner.close();
    }

    void display(E3_Node2 p){
        if(p != null){
            System.out.print(p.data + " -> ");
            display(p.link);
        }
        else
            System.out.println("null");
    }

    public static void main(String[] args) {
        E3_Node2 list = new E3_Node2();
        list.build();
    }
}
