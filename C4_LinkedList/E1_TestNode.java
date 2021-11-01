package C4_LinkedList;

//연결 리스트
//1. 자료를 저장할 필드
//2. 자료의 위치 정보(다음에 연결할 원소의 위치)를 담고 있는 필드 가짐
//<자료, 링크> 구조 <- 각각 노드의 자료 필드와 링크 필드
//리스트의 물리적 순서와 논리적 순서 일치할 필요 x

class Node{
    Object data;
    Node link;

    void print(Node p){
        while(p!=null){
            System.out.print(p.data + " -> ");
            p = p.link;                         //p가 다음 노드를 가리키게 함. 루프 돌아야하니까
        }
        System.out.println("null");
    }
}
public class E1_TestNode {
    public static void main(String[] args) {
        Node L = new Node();
        L.data = "Kim";
        L.link = null;
        
        Node temp = new Node();
        temp.data = "Leo";
        L.link = temp;

        Node temp1 = new Node();
        temp1.data = "Park";
        temp.link = temp1;

        Node temp2 = new Node();
        temp2.data = "Yoon";
        temp1.link = temp2;
        temp2.link = null;

        System.out.println("*** 리스트 L 출력 ***");
        L  .print(L);
    }
}
