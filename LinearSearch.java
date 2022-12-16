import java.util.*;
class LinearSearch{
    
 public static void main(String[] args) {
    Scanner cd=new Scanner(System.in);
int n,found=0,i;
int[] a=new int[10];
System.out.println("Enter the Number of elements");
n=cd.nextInt();
System.out.println("Enter the elements in the array");
for(i=0;i<n;i++)
{
    a[i]=cd.nextInt();
}
System.out.println("Enter the  to search element");
int key=cd.nextInt();
for( i=0;i<n;i++){
if(a[i]==key)
{
    found=1;
    break;
}
}
if(found==1){
    System.out.println("The search element in the position is"+(i+1));
}
else{
    System.out.println("Search is not found");
}

}
}

