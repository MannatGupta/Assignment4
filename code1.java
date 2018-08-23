import java.util.Scanner;
class code1
{
public static void main(String[ ] args)
{
System.out.println("Enter no. of rows:");
Scanner S=new Scanner(System.in);
int n=S.nextInt();
for(int i=1;i<=n;i++)
{
  for(int j=n;j>=i;j--)
{
  System.out.print("*");
}
System.out.println();
}
}
}