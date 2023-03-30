class A Extend Thread
{
public static void main(String [] args)
{
for(i=1,i<5,i++)
{
System.out.println(i+"*"+5+"=+(i*5));
}
System.out.println(" Thread1 is completed":);
}
class B Extend Thread
{
public static void main(String [] args)
{
for(j=1,j<=7,j++)
{
System.out.println(j+"*"+7+"=+(j*7));
}
System.out.println(" Thread2 is completed":);
}
}
public class table
{
public static void main(String [] args)throws 10 Exception
{
A Thread1=new()
B Thread2=new()
ThreadA.set Priority(Thread.Maximum Priority)
TreadB.set Priority(Thread.Normal Priority)
ThreadA.start()
ThreadB.start()