import java.io.*;
class SerializeDeserialize1 implements java.io.Serializable
{
    public int sid;
    public String sname;
    public String sub;
    public int marks;
    public SerializeDeserialize1(int sid, String sname ,String sub,int marks)
    {
        this.sid = sid;
        this.sname = sname;
        this.sub = sub;
        this.marks = marks;
       
    }
}

class SerializeDeserializeEx1
{
    public static void main(String[] args)
    {
        SerializeDeserialize1 object = new SerializeDeserialize1(1, "Rushukesh", "java" ,49);
        String filename = "file.ser";
        try
        {
            FileOutputStream file = new FileOutputStream(filename);
            ObjectOutputStream out = new ObjectOutputStream(file);
            out.writeObject(object);
            out.close();
            file.close();
            System.out.println("Object has been serialized");
        }
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
        SerializeDeserialize1 object1 = null;
    // Deserialization
        try
        {
            FileInputStream file = new FileInputStream(filename);
            ObjectInputStream in = new ObjectInputStream(file);
            object1 = (SerializeDeserialize1)in.readObject();
            in.close();
            file.close();
            System.out.println("Object has been deserialized ");System.out.println("Id = " + object1.sid);
            System.out.println("Name = " + object1.sname);
            System.out.println("Subject = " + object1.sub);
            System.out.println("Mark = " + object1.marks);
        }
        catch(IOException ex)
        {
            System.out.println("IOException is caught");
        }
        catch(ClassNotFoundException ex)
        {
            System.out.println("ClassNotFoundException is caught");
        }
    }
}