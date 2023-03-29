import java.io.*;
class A extends Thread
{
public void run()
{
for(int i=1;i<=5;i++)
{
System.out.println(i+"*"+5+"="+(i*5));
}
System.out.println("Thread1 is completed:");
}
}
class B extends Thread
{
public void run ()
{
for(int j=1;j<=7;j++)
{
System.out.println(j+"*"+7+"="+(j*7));
}
System.out.println("Thread2 is completed:");
}
}
public class table
{
public static void main(String []args)throws IOException
{
A ThreadA=new A();
B ThreadB=new B();
ThreadA.setPriority(Thread.MAX_PRIORITY);
ThreadB.setPriority(Thread.MIN_PRIORITY);
ThreadA.start();
ThreadB.start();
}
}