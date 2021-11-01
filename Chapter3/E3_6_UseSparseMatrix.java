import java.util.Random;

public class E3_6_UseSparseMatrix {
    public static void main(String args[]){
        Random r;
        SparseMatrix obj = new SparseMatrix();
        r = new Random();

        int val = (int)(r.nextDouble()*100);

        obj.init(2,3,val);
        obj.init(5,1,r.nextInt(100));
        obj.init(7,0,r.nextInt(100));
        obj.init(8,6,r.nextInt(100));

        System.out.println("*** 희소 행렬");
        int n = obj.a.length;
        obj.display(obj.a, n);

        obj.MakeSparseArray();
        System.out.println("*** 희소 배열");
        obj.display(obj.b, obj.size);
    }
}

class SparseMatrix{
    int[][] a = new int[10][10];
    int[][] b = new int[10][3];
    int n, m, size = 0;

    void init(int x, int y, int z){
        a[x][y] = z;
        size++;
    }

    void MakeSparseArray(){
        int k = 0;
        for(int i = 0;i<10;i++)
            for(int j = 0; j<10; j++){
                if(a[i][j] != 0){
                    b[k][0] = i;
                    b[k][1] = j;
                    b[k][2] = a[i][j];
                    k++;
                }
            }
    }

    void display(int a[][], int n){
        int i, j;
        for(i = 0;i<n;i++){
            for(j = 0;j<a[i].length;j++)
                System.out.print(a[i][j]+"\t");
            System.out.println();
        }
        System.out.println();
    }
}