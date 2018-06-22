package Input;

import java.io.*;

public class DataInputStreamExample {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream("textfile1.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);
        LineNumberInputStream lineNumberInputStream = new LineNumberInputStream(dataInputStream);

        while(dataInputStream.available() > 0)  {
            String txt = dataInputStream.readUTF();
            System.out.println(txt + " ");
        }
    }
}
