package C3_SequentialDS;

class ArrayLinearList{
    private int no;                         //배열의 현재 원소 나타내는 변수
    private int size;                       //배열의 크기
    private int increment;                  //배열의 확장 단위
    private int[] itemList;                 //원소 저장 배열

    public ArrayLinearList(){               //리스트 변수 초기화
        no = -1;
        size = 50;
        increment = 10;
        itemList = new int[size];
    }

    public boolean isEmpty(){
        return no == -1;                    //공백 리스트
    }

    public void insert(int x){              //리스트에 원소 삽입
        int pos = 0;
        
        if(no == size-1){
            size += increment;              //배열 크기 확장
            int[] tempArray = new int[size];//기존 배열 크기를 늘릴 수는 없으니 확장된 새 임시 배열 생성
            for(int i = 0; i<=no; i++)
                tempArray[i] = itemList[i]; //임시 배열로 원소 이동
            itemList = tempArray;           //임시배열 대입해 선형리스트 변경
        }

        if(no == -1){                       //공백 리스트인 경우
            no++;
            itemList[no] = x;
        }
        else{
            for(int i = 0; i<=no; i++)      //삽입 위치 결정
                if(x>itemList[i])           //순서대로 배치하느라
                    pos++;
            for(int i = no+1; i>pos; i--)   //기존 자료 이동
                itemList[i] = itemList[i-1];//pos 기준으로 뒤에(더 큰 원소) 뒤로 한 칸씩 이동
            
            itemList[pos] = x;              //원소 삽입
            no++;
        }
    }

    public void delete(int x){
        if(isEmpty())
            System.out.println("List Empty");

        else{
            int loc = -1;
            for(int i = 0; i<= no; i++)     //삭제 위치 결정
                if(x == itemList[i])
                    loc = i;

            if(loc == -1)                   //삭제할 원소가 없어서 loc가 초기화해두었던 -1이면
                System.out.println("삭제할 원소 " + x + "없습니다.\n");
            else{
                for(int i = loc; i<no; i++)
                    itemList[i] = itemList[i+1];//앞으로 땡김
                no--;
            }
        }
    }

    public void print(){
        for(int i = 0; i < no; i++)
            System.out.print(itemList[i] + ", ");
        System.err.println(itemList[no] + "\n");
    }
}

public class E3_8_UseLinearList{
    public static void main(String[] args) {
        ArrayLinearList list1 = new ArrayLinearList();
        list1.insert(12);
        list1.insert(24);
        list1.insert(36);
        list1.insert(58);
        list1.insert(79);
        System.out.println("*** 삽입 후 선형 리스트 ***");
        list1.print();
        list1.delete(24);
        System.out.println("*** 삭제 후 선형 리스트 ***");
        list1.print();
        list1.delete(58);
        System.out.println("*** 삭제 후 선형 리스트 ***");
        list1.print();
        list1.delete(12);
        System.out.println("*** 삭제 후 선형 리스트 ***");
        list1.print();
        list1.delete(10);
        System.out.println("*** 삭제 후 선형 리스트 ***");
        list1.print();
    }
} 