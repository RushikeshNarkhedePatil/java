import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Mail
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("ENTER EMAIL-ID: ");
String phone = sc.next();
String regex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
Pattern pattern = Pattern.compile(regex);
Matcher matcher = pattern.matcher(phone);
if(matcher.matches())
{
System.out.println("EMAIL ID IS VAILD");
}else
{
System.out.println("EMAIL ID IS INVALID");
}
}
}