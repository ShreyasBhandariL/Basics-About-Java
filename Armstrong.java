import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner d=new Scanner(System.in);
        int  n,temp,rem,sum=0;
        System.out.println("Enter the number");
        n=d.nextInt();
        temp=n;
        while(n!=0)
        {
            rem=n%10;
            sum=sum+(rem*rem*rem);
            n=n/10;

        }
        if(temp == sum)
{
    System.out.println("The given number is Armstrong number");

}   
else{
    System.out.println("The given number is Not an Armstrong number");
} 
    }
}
