import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter the 2 numbers");
        int n1=s.nextInt();
        int n2=s.nextInt();
        System.out.println("Enter the operator to perfom operation like (+,-,*,/,% )");
        char ch=s.next().charAt(0);
        switch(ch)
        {
            case '+':System.out.println((n1+n2));
            break;
            case '-':System.out.println((n1-n2));
            break;
            case '*':System.out.println((n1*n2));
            break;
            case '/':System.out.println((n1/n2));
            break;
            case '%':System.out.println((n1%n2));
            break;
            default:System.out.println("Invalid Operator");
            break;
        }

    }
}
