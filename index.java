import java.util.*;
class index{
    
 public static void main(String[] args) {
    Scanner cd=new Scanner(System.in);
    int a[]=new int[10];
    int temp=0;
    System.out.println("Enter the number");
    int n=cd.nextInt();
    System.out.println("Enter the elements in the array");
    for(int i=0;i<n;i++){
        a[i]=cd.nextInt();
    }
    System.out.println("entered unsorted array is");
    for(int i=0;i<n;i++){
        System.out.print(a[i]+"\t");
    }
    System.out.println("\n");
    for(int i=0;i<n-1;i++){
        for(int j=0;j<n-1-i;j++){
            if(a[j]>a[j+1]){
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
            }
        }
    }
    for(int i=0;i<n;i++){
        System.out.print(a[i]+"\t");
    }
    System.out.println("\n");
    System.out.println("The largest elemt in the array is "+a[n-1]);
}
}
