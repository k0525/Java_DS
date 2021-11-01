package Chapter2;
import java.util.Scanner;

public class AlgorithmFac {

    //반복
    int computeFac(int n){
        int fac = 1;
        for(int i = 2; i<=n; i++)
            fac = fac*i;
        return fac;
    }

    //순환
    int recursionFac(int n){
        if(n == 1)
            return 1;
        else
            return (n * recursionFac(n-1));
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        AlgorithmFac af = new AlgorithmFac();

        System.out.print("곱을 구할 수 입력: ");
        int n = sc.nextInt();

        int fac = af.computeFac(n);
        int rfac = af.recursionFac(n);

        System.out.println("반복적인 방법 fac = " + fac);
        System.out.println("순환적인 방법 rfac = " + rfac);
        sc.close();
    }
}
