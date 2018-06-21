package Output;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExample {

    public static void main(String[] args) {
        try {
            BufferedOutputStream stream = new BufferedOutputStream(new FileOutputStream("textfile1.txt"));
            stream.write("Hello World".getBytes());
            stream.write(System.lineSeparator().getBytes());
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

