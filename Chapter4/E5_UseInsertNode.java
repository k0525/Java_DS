public class E5_UseInsertNode {
    public static void main(String[] args) {
        Node5 obj = new Node5();
        Node5 L = null;
        L = obj.build();
        L = obj.insert(L, 28);
        L = obj.insert(L, 46);
        L = obj.insert(L, 7);
    }
}

class Node5{
    Object data;
    Node5 link;

    Node5 build(){
        Node5 L = null, temp, end;
        end = L;
        int [] Data = {15, 35, 67, 98};
        int no = Data.length;
    }
}
