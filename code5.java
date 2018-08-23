import java.util.Scanner;
class code5
{
public static void main(String[ ] args)
{
System.out.println("enter number:");
Scanner S=new Scanner(System.in);
int n=S.nextInt();
int rem,rev=0,temp;
temp=n;
while(n>0)
{
rem=n%10;
rev=(rev*10)+rem;
n=n/10;
}
System.out.println("Reverse of the number"+" "+temp+" "+"is"+" "+rev);
}
}