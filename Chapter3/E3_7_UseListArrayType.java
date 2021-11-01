import java.util.Arrays;

public class E3_7_UseListArrayType{
    public static void main(String[] args){
        int i;
        int[] L = {1,2,3,4,5};
        System.out.print ("L : ");
        for(i=0; i<L.length;i++)
            System.out.print(L[i]+" ");
        System.out.println();
        System.out.println("L 배열: "+Arrays.toString(L ));
    }
}