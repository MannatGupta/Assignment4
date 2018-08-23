import java.util.Scanner;
class code3
{
public static void main(String[ ] args)
{ 
System.out.println("Enter value of N:");
Scanner S=new Scanner(System.in);
int n=S.nextInt();

for(int i=2;i<=n;i++)
{
   int flag=2;
for(int j=2;j<i;j++)
{
   if(i%j==0)
{
flag++;
}
}
if(flag==2)
{
System.out.println(i);
}
}
}
}