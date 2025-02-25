import java.io.*;

public class AppendFile 
{
    public static void main(String[] args) throws  FileNotFoundException, IOException {
        String filepath = "newfile.txt";
        File f = new File(filepath);
        FileWriter fw = null;
        fw=new FileWriter(f,true);
        fw.append("hi evryone");
        fw.append("Hi everyone");
        System.out.println("writing is successful");
        fw.close();
    }
  
}
