import java.util.Scanner;
public class digit 
{
public static void main(String[]args)
{
int no,a=0;
Scanner s=new Scanner(System.in);
System.out.println("enter  any num");
no=s.nextInt();
if(no<0)
{
no=no*-1;
}
elseif(no==0)
{
no=1;
}
while(no>0)
{
no=no/10;
a++;
}
System.out.println("number of digits in given number is"+a);
}
}
