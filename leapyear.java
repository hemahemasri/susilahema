import java.util.Scanner;
public class  leapyear
{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
int yr;
System.out.println("enter the year");
yr=sc.nextInt();
if((yr%4==0)&&(yr%100!==0))
{
System.out.println("the given year is leap");
elseif((yr%100==0))
{
System.out.println("the given year is not a leap year");
}
elseif(yr%400==0)
{
System.out.println("the given year is leap year");
}
else 
{
System.out.println("the year is not a leapyear");
}
}
System.out.println(yr);
}
}
