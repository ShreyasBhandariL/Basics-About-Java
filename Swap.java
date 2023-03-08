import java.util.Scanner;
public class Swap {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int y=s.nextInt();
      try{  x=x*y;
        y=x/y;
        x=x/y;
        System.out.println("The values x:"+x+"  Y:"+y);
      }
      catch (ArithmeticException r) {
      System.out.println("Can not swap 0");
      }
    }
}
