import java.util.Scanner;
class CountVowels
{
public static void main(String[] args) 
{
Scanner scanner = new Scanner(System.in);
System.out.println("Enter a statement:");
String statement = scanner.nextLine().toLowerCase();
int count=0;
for (int i = 0; i < statement.length(); i++)
{
char c = statement.charAt(i);
if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') 
{
count++;
}
}
System.out.println("Number of vowels in the statement: " + count);
}
}