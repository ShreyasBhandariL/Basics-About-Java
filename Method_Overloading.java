import java.util.Scanner;

public class Method_Overloading {
double Method(int a,double d){
    return (a+d);
}
int Method(int a, int b,int c){
    return (a+b+c);
}
int Method(int a,int b){
    return (a+b);
}
public static void main(String[] args) {
    Method_Overloading m=new Method_Overloading();
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the value of a:");
    int a=sc.nextInt();
    System.out.println("Enter the value of b:");
    int b=sc.nextInt();
    System.out.println("Enter the value of c:");
    int c=sc.nextInt();
    System.out.println("Enter the value of d:");
    double d=sc.nextDouble();
    System.out.println(m.Method(a, b));
    System.out.println(m.Method(a, b,c));
    System.out.println(m.Method(a,d));
}
}
