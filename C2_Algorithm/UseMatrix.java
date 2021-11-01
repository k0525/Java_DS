package C2_Algorithm;
import java.util.Random;
import java.util.Scanner;

class Matrix{
    int[][] a = new int [10][10];
    int[][] b = new int [10][10];
    int[][] c = new int [10][10];
    int n, m;

    void init(){
        Random r = new Random();
        for(int i = 0; i<n; i++)
            for(int j = 0; j<m; j++){
                a[i][j] = (int)(r.nextDouble() * 100);
                b[i][j] = r.nextInt(100);
            }
    }

    void mulMatrix(){
        for(int i = 0; i<n; i++)
            for(int j = 0; j<m; j++){
                c[i][j] = 0;
                for(int k = 0; k<m; k++)
                    c[i][j] = c[i][j] = a[i][k]*b[k][j];
            }
    }

    void display(int aa[][], int n, int m){
        int i, j;
        for(i = 0; i<n; i++){
            for(j = 0;j<m; j++)
                System.out.print(aa[i][j] + "\t");
            System.out.println();
        }
        System.out.println();       
    }
}

public class UseMatrix{
    public static void main(String args[]){
        Matrix obj = new Matrix();
        Scanner sc = new Scanner(System.in);

        System.out.print("행과 열의 크기 입력: ");

        obj.n = sc.nextInt();
        obj.m = sc.nextInt();
        
        obj.init();

        System.out.println("*** a 행렬");
        obj.display((obj.a), obj.n, obj.m);
        
        System.out.println("*** b 행렬");
        obj.display((obj.b), obj.n, obj.m);

        obj.mulMatrix();
        System.out.println("*** a와 b의 곱");
        obj.display((obj.c), obj.n, obj.n);

        sc.close();

    }
}