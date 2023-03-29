
class overloading
void sum(int a,int b);
{
System.out.println("a+b");
}
void sum (int a,long b,int c);
{
System.out.println(a+b+c);
}
{
public static void main(String[] args)
overloading o= new.overloading;
o.sum(10,20);
o.sum(10,20,30);
}