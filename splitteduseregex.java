import java.util.Scanner;
public class splitteduseregex
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter a String:");
String str = s.nextLine();
System.out.println("Splitted words:");
String[] arrOfStr = str.split(" ");
for (String a :arrOfStr)
System.out.println(a);
}
}