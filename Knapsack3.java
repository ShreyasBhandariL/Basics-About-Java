import java.util.*;
public class Knapsack3
{
void knapsack(int n,int m,int w[],int p[])
{
int i=1;
float x=0,s=0;
while(m>0 && i<=n)
{
if(w[i]<m)
x=1;
else
x=(float)m/w[i];
s=s+p[i]*x;
m=(int)(m-w[i]*x);
i++;
}
System.out.println("Optimal solution is "+s);
}
void orderitems(int n,int w[],int p[])
{
int i,j;
float r[]=new float[10];
for(i=1;i<=n;i++)
r[i]=(float)p[i]/w[i];
for(i=1;i<=n-1;i++)
for(j=1;j<=n-i;j++)
if(r[j]<r[j+1])
{
swap(j,j+1,p);
swap(j,j+1,w);
}
}
void swap(int i,int j,int r[])
{
int t=r[i];
r[i]=r[j];
r[j]=t;
}

public static void main(String[] args) {
Knapsack3 g1=new Knapsack3();
Scanner s=new Scanner(System.in);
int w[]=new int[10];

int p[]=new int[10];
int i,n,m;
System.out.println("Enter the Number of Items");
n=s.nextInt();
System.out.println("Enter the Knapsack Capacity");
m=s.nextInt();
System.out.println("Enter the Weight of items");
for(i=1;i<=n;i++)
w[i]=s.nextInt();
System.out.println("Enter the profit of items");
for(i=1;i<=n;i++)
p[i]=s.nextInt();
g1.orderitems(n,w,p);
g1.knapsack(n,m,w,p);
}

}