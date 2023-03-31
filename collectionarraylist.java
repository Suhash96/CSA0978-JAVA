import java.util.*;
class sample
{
public static void main(String[]args)
{
ArrayList<String> list=new ArrayList<String>();
list.add("hai");
list.add("suhash");
Iterator itr=list.iterator();
while(itr.hasNext())
{
System.out.println(itr.next());
}
}
}