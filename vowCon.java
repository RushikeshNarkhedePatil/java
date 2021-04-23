import java.io.*;
public class vowCon
{
    public static void main(String[] args)throws IOException
    {
    try
    {
        FileInputStream fstream = new
        FileInputStream("C:/Assignment4/data.txt");
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        FileWriter ostream = new FileWriter("C:/Assignment4/vowels.txt");
        BufferedWriter out = new BufferedWriter(ostream);
        FileWriter opstream = new
        FileWriter("C:/Assignment4/consonants.txt");
        BufferedWriter outt = new BufferedWriter(opstream);
        String str=br.readLine();
        char ch;
        for (int i=0;i<str.length();i++)
        {
            ch = str.charAt(i);
            if(( ch == 'a') ||( ch == 'e') ||( ch == 'i') ||( ch == 'o') ||( ch =='u'))
            {
                out.write(ch);
                System.out.println(ch+" is a vowel");
            }
            else
            {
                outt.write(ch);
                System.out.println(ch+" is a consonant");
            }
        }
        out.close();
        outt.close();
        br.close();
    }
    catch(Exception e)
    {
        System.err.println(e);
    }
}
}