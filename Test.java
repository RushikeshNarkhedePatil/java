class Test
{
static <T> void genericDisplay (T element)
{
System.out.println(element.getClass().getName() +" = " + element);
}
public static void main(String[] args)
{
genericDisplay(11);
genericDisplay("Rushikesh Narkhede");
genericDisplay(1.0);
}
}