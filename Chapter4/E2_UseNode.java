public class E2_UseNode {
    public static void main(String[] args) {
        Node1 obj = new Node1();
        obj.build();
    }    
}

class Node1{
    Object data;
    Node1 link;

    void build(){
        Node1 L = null, temp, end;
        end = L;                    //end는 마지막 노드를 가리키는 변수
        String [] Data = {"Kim", "Lee", "Park", "Yoon"};
        int no = Data.length;
 
        for(int i = 0; i<no; i++){
            temp = new Node1();
            temp.data = Data[i];

            if(L == null){
                L = temp;
                end = L;  
            }
            else{
                end.link = temp;
                end = temp;
            }
        }
        System.out.println("*** 리스트 L 출력 ***");
        L.print(L);
    }

    void print(Node1 p){
        while(p != null){
            System.out.print(p.data + " -> ");
            p = p.link;
        }
        System.out.println("null");
    }
}