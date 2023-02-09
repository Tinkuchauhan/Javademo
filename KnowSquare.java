import java.util.Scanner;

public class KnowSquare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //check sqare or not given lenth and breadth by user
        /**
         int length;
         length= sc.nextInt();
         int breadth;
         breadth= sc.nextInt();
         if(length==breadth){
         System.out.println("This is square");
         }
         else {
         System.out.println("This is not square");
         }
         **/

        //check Absolute or not given by user
        /**
         int num;
         System.out.print("Enter the Number:  ");
         num=sc.nextInt();
         if(num<0) {
         num=num*-1;
         System.out.println("The Absloute value is:"+ num);

         }
         **/
        int marks;
        System.out.println("Enter the marks : ");
        marks = sc.nextInt();
        if (marks>=90){
            System.out.println("Grade : A+");
        } else if (marks>=80) {
            System.out.println("Grade : A");

        } else if (marks>=70) {
            System.out.println("Grade : B+");

        } else if (marks>=60) {
            System.out.println("Grade : B");

        } else if (marks>=50) {
            System.out.println("Grade : C");
        } else if (marks>=40) {
            System.out.println("Grade : D");
        } else if (marks>=30) {
            System.out.println("Grade : E");
        } else if (marks<30) {
            System.out.println("Fail");
        }
        else
        {
            System.out.println("Enter valid Marks");
        }
    }

}
