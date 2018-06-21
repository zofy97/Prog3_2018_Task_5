package Output;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Date;

public class PrintStreamExample {
    public static void main(String[] args)  {
        File file = new File("textfile2.txt");
        FileOutputStream fileOutputStream = null;
        PrintStream printStream = null;
        try {
            fileOutputStream = new FileOutputStream(file);
            printStream = new PrintStream(fileOutputStream);
            printStream.print(new Date());
            printStream.println();
            printStream.println("Hello World!");
        } catch (Exception e)   {
            e.printStackTrace();
        } finally {
            try {
                if(fileOutputStream != null)    {
                    fileOutputStream.close();
                }
                if(printStream != null) {
                    printStream.close();
                }
            } catch (Exception e)   {
                e.printStackTrace();
            }
        }
    }
}
