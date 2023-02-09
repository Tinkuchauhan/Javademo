import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        main(){
        //code
        //code
}

        /**
        int cp;
        int sp;
        System.out.println("Enter the Cost Price : ");
        cp = sc.nextInt();
        System.out.println("Enter the Selling Price : ");
        sp = sc.nextInt();
        int amt;
        if (cp>sp){
            amt = cp-sp;
            System.out.println("The is Loss:"+amt);
            
        } else if (sp>cp) {
            amt = sp-cp;
            System.out.println("The profit is: "+amt);
            
        }
        else{
            System.out.println("no profit no loss");
        }
       **/
       pw(){
        System.out.print("Hellooooooo")
       }
        double num1;
        double num2;
        double ans;
        char op;
        System.out.println("Enter num1 value : ");
        num1 = sc.nextDouble();
        System.out.println("Enter num2 value : ");
        num2 = sc.nextDouble();
        System.out.println("Enter an operator : (+,-,/,*,%)");
        op = sc.next().charAt(0);
        switch (op){
            case'+':
                ans = num1+num2;
                System.out.println(ans+"= "+num1+ " + " +num2);
                break;

            case'-':
                ans = num1-num2;
                System.out.println(ans+"= "+num1+ " - " +num2);
                break;
            case'*':
                ans = num1*num2;
                System.out.println(ans+"= "+num1+ " * " +num2);
                break;
            case'/':
                ans = num1/num2;
                System.out.println(ans+"= "+num1+ " / " +num2);
                break;
            case'%':
                ans = num1%num2;
                System.out.println(ans+"= "+num1+ " % " +num2);
                break;
            default:
                System.out.println("the operator value is unsigned");
        }

    }
}