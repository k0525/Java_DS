package C3_SequentialDS;

import java.util.Arrays;

public class E3_1_UseArrayList1 {
    //int랑 char랑 다른 형이지만 같은 함수를 써서 출력하기 위해
    //object 배열 사용
    static void print(Object[] ob, int length){
        for(int i = 0; i<length; i++)
            System.out.print(ob[i] + " ");
        System.out.println();
    }

    public static void main(String args[]){
        int[] a = new int[3];
        for(int i = 0; i<a.length; i++)
            a[i] = i*3;

        char[] b = {'a', 'b', 'c', 'd', 'f'};
        
        System.out.print("int array : ");
        
        Object[] ob = new Object[5];

        for(int i = 0; i<a.length;i++)
            ob[i] = a[i];

        print(ob, a.length);

        System.out.println("char array : ");

        for(int i = 0; i<b.length; i++)
            ob[i] = b[i];

        print(ob, b.length);

        System.out.println("a배열 : "+Arrays.toString(a));
        System.out.println("b배열 : "+Arrays.toString(b));
    }
}

//ob는 temp라고 봐도 무방
//잠깐 담아서 출력만 해줌