package C2_Algorithm;
import java.util.Scanner;

public class AlgorithmSum {

    //반복적인 방법
    int computeSum(int n) {
        int sum = 0;
        for(int i = 1; i<=n; i++)
            sum = sum + i;
        return sum;
    }

    //순환 방법
    int recursionSum(int n){
        if(n==1)
            return 1;
        else
        return (n + recursionSum(n-1));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AlgorithmSum as = new AlgorithmSum();
        System.out.print("합을 구할 수 입력: ");

        int n = scanner.nextInt();
        int sum = as.computeSum(n);
        int rsum = as.recursionSum(n);

        System.out.println("반복적인 방법 sum = " + sum);
        System.out.println("순환적인 방법 sum = " + rsum);

        scanner.close();
    }
}