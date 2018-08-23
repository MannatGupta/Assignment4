import java.util.Scanner;
class code2
{
public static void main(String[ ] args)
{
System.out.println("enter value of N");
Scanner S=new Scanner(System.in);
int n=S.nextInt();
for(int i=1;i<=n;i++)
{
    if(i%2==0)
   {
      System.out.println(i);
   }
}
}
}
