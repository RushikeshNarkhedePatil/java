import java.io.*;
class FileMethods
{
    public static void main(String[] args)
    {
        File file = new File("abc1.txt");
    try
     {
        boolean value = file.createNewFile();
        if (value)
         {
            System.out.println("\nThe new file is created.");
        }
        else
         {
            System.out.println("The file already exists.");
         }          
     }
    catch(Exception e) {}
    System.out.println();
    try
     {
        FileOutputStream out = new FileOutputStream("abc1.txt");
        String c= "This is the Java Program";
        byte b[]=c.getBytes();
        out.write(b);
        out.close();
    }
    catch(Exception e){}
    System.out.println("Data is added to the file");
    System.out.println();
    File new1 = new File("new");
    boolean value = file.renameTo(new1);
    if(value) 
    {
         System.out.println("The name of the file is changed.");
    }
    else
     {
        System.out.println("The name cannot be changed.");
    }
    System.out.println();
    char[] array = new char[100];
    try
     {
        FileReader input = new FileReader("new");
        input.read(array);
        System.out.println("Data in the file:");
        System.out.println(array);
        input.close();
    }
    catch(Exception e) {}System.out.println();
    boolean value1 = new1.delete();
    if(value1)
     {
        System.out.println("The File is deleted.");
    }
    else
     {
        System.out.println("The File is not deleted.");
    }
    System.out.println();
    File file1 = new File("c:/java");
    String[] fileList = file1.list();
    System.out.println("The File in 'C:/java' are: ");
    for(String str : fileList)
    {
        System.out.println(str);
    }
}
}