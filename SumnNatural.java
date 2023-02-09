import java.util.Scanner;

public class SumnNatural {
    public static void main(String[] args) {
        /**
         Scanner sc = new Scanner(System.in);
         int n;
         n = sc.nextInt();
         int sum = 0;
         int num = 1;
         while (n>=num){
         sum = sum+num;
         System.out.println(sum);
         num++;
         }
         */

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum =0;
        while (num !=-1) {
            sum += num;
            num = sc.nextInt();

            num++;
            System.out.println(sum);
        }


    }
}
