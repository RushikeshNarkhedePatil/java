import java.util.regex.*;
import java.util.Scanner;
public class mobilevalid
{
    public static void main(String[] args)
    {
    Scanner s = new Scanner(System.in);
    System.out.println("Please Enter Mobile Number: ");
    String mob = s.next();
    boolean valid = Pattern.matches("[789]{1}[0-9]{9}",mob);
    if(valid==true)
            System.out.println("Valid mobile number!!");
    else
        System.out.println("Invalid mobile number!!!");
    }
}