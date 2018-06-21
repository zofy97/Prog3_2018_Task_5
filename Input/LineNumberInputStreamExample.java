package Input;

import java.io.FileInputStream;
import java.io.LineNumberInputStream;

public class LineNumberInputStreamExample {
    public static void main(String[] args)  {
        try {
            FileInputStream fileInputStream = new FileInputStream("textfile2.txt");
            LineNumberInputStream lineNumberInputStream = new LineNumberInputStream(fileInputStream);

            System.out.println("First Line: " + lineNumberInputStream.getLineNumber());

            while (lineNumberInputStream.available() > 0)   {
                System.out.print((char) lineNumberInputStream.read());
            }
            System.out.println();

            System.out.println("Last Line: " + lineNumberInputStream.getLineNumber());
        } catch (Exception e)   {
            System.out.println(e.getMessage());
        }
    }
}
