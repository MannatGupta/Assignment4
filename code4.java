import java.util.Scanner;
import java.lang.Math;
class code4
{
public static void main(String[ ] args)
{
System.out.println("Enter number:");
Scanner S=new Scanner(System.in);
int num=S.nextInt();
int c=0,sum=0,rem,temp;
temp=num;

while(num!=0) 
{
num=num/10;
++c;
}
while(num!=0)
{
rem=num%10;
sum+=Math.pow(rem, c);
num=num/10;
}
if(sum==temp)
{
System.out.println("It is an Armstrong Number");
}
else
{
System.out.println("It is not an Armstrong Number");
}
}
}
