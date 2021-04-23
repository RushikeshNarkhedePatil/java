import java.util.ArrayList;
public class arrayList
{
public static void main(String[] args)
{
ArrayList<String> ArrayList1 = new ArrayList<String>();
ArrayList<String> ArrayList2 = new ArrayList<String>();
ArrayList1.add("item 1");ArrayList1.add("item 2");
ArrayList1.add("item 3");
ArrayList1.add("item 4");
ArrayList2.add("item 1");
ArrayList2.add("item 2");
ArrayList2.add("item 3");
ArrayList2.add("item 4");
System.out.println(" ArrayList1 = " + ArrayList2);
System.out.println(" ArrayList1 = " + ArrayList1);
if (ArrayList1.equals(ArrayList2) == true)
{
System.out.println(" Array List are equal");
}
else
{
System.out.println(" Array List are not equal");
}
System.out.println("\n Lets insert one more item in Array List 1");
ArrayList1.add("item 5");
System.out.println(" ArrayList1 = " + ArrayList1);
System.out.println(" ArrayList = " + ArrayList2);
if (ArrayList1.equals(ArrayList2) == true)
{
System.out.println(" Array List are equal");
}
else
{
System.out.println(" Array List are not equal");
}
}
}