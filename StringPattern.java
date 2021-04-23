import java.util.regex.*; 
class StringPattern
{ 
    public static void main(String args[])
    {    
        String content = "This is Rushikesh " +"from Nimkhed.";
        String pattern = ".*rushi*";
        boolean isMatch = Pattern.matches(pattern, content);
        System.out.println("The text contains 'rushi'?" + isMatch);
    }
}