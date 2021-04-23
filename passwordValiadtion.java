import java.util.regex.*;
import java.io.FileOutputStream;
import java.util.*;
class passwordValiadtion
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
try{
FileOutputStreamfout=new FileOutputStream("F:/Assignment 4/userid.txt");
FileOutputStream fout1=new FileOutputStream("F:/Assignment4/pass.txt");
String username;
String pass;System.out.println("Enter Your User_Name");
username=sc.next();
System.out.println("Enter Your Password");
pass=sc.next();
String regularEx="^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,}$";
booleanans = pass.matches(regularEx);
if(ans)
{
System.out.println("Your Password is Correct");
byte b1[]=username.getBytes();
byte b[]=pass.getBytes();//converting string into byte array
//fout.write("Username:");
fout.write(b1);
//fout.write("Password:");
fout1.write(b);
fout.close();
System.out.println("success...Usename And Password is stored in your file");
}
else
{
System.out.println("Error...Please Check Your Password Once Again");
}
}catch(Exception e){System.out.println(e);}
}
}