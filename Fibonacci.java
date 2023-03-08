import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner c=new Scanner(System.in);
        int z1=0,z2=1,z3;
        System.out.println("Enter the Number");
        int n=c.nextInt();
        System.out.println(z1+"\n"+z2);
        for(int x=2;x<n;x++)
        {
            z3=z1+z2;
            System.out.println(z3);
            z1=z2;
            z2=z3;
        }
    }
}
