import java.util.*;
class Merge_Sort
{
void simplemerge(int a[],int low,int mid,int high)
{
int c[]=new int[100000];
int i,j,k;
i=low;
j=mid+1;
k=low;
while((i<=mid)&&(j<=high))
{
if(a[i]<a[j])
{
c[k]=a[i];
i++;
k++;
}
else
{
c[k]=a[j];
j++;
k++;
}
}
while(i<=mid)
{
c[k]=a[i];
k++;
i++;
}
while(j<=high)
{
c[k]=a[j];
k++;
j++;
}
for(i=low;i<=high;i++)
{
a[i]=c[i];
}
}
void mergesort(int a[], int low, int high)
{

int mid;
if(low<high)
{
mid=(low+high)/2;
mergesort(a,low,mid);
mergesort(a,mid+1,high);
simplemerge(a,low,mid,high);
}
}
public static void main(String args[])
{
int n,i;
Merge_Sort m=new Merge_Sort();
Scanner s=new Scanner(System.in);
Random r=new Random();
int a[]=new int[100000];
System.out.println("Enter the no. of elements");
n=s.nextInt();
for(i=0;i<n;i++)
a[i]=r.nextInt(1000);
System.out.println("Array elements are\n");
for(i=0;i<n;i++)
System.out.print(a[i]+" ");
long st=System.currentTimeMillis();
m.mergesort(a,0,n-1);
long et=System.currentTimeMillis();
long tt=et-st;
System.out.println("\n Sorted elements are\n");
for(i=0;i<n;i++)
System.out.print(a[i]+" ");
System.out.println("\n Total time:"+tt+"ms");
}

}