import java.util.Scanner;
 class Year_Week_Day 
{
public static void main(String args[])
{
int n, year, week, day;
Scanner s = new Scanner(System.in);
System.out.print("Enter the number of days:");
n = s.nextInt();
year = n / 365;
n = n % 365;
System.out.println("No. of years:"+year);
week = n / 7;
n = n % 7;
System.out.println("No. of weeks:"+week);
day = n;
System.out.println("No. of days:"+day);
}
}